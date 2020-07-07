package com.github.tonydeng.graphql.service;

import com.github.tonydeng.graphql.model.Book;
import com.github.tonydeng.graphql.repository.BookRepository;
import com.github.tonydeng.graphql.service.datafetcher.AllBooksDataFetcher;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * @author dengtao
 **/
@Service
@Slf4j
public class GraphQLService {
    private BookRepository bookRepository;

    private AllBooksDataFetcher allBooksDataFetcher;

    @Value("classpath:books.graphql")
    Resource resource;

    private GraphQL graphQL;

    @Autowired
    public GraphQLService(BookRepository bookRepository, AllBooksDataFetcher allBooksDataFetcher) {
        this.bookRepository = bookRepository;
        this.allBooksDataFetcher = allBooksDataFetcher;
    }

    @PostConstruct
    private void loadSchema() throws IOException {
        log.info("Entering loadSchema@GraphSQLService.......");

        loadDataIntoHSQL();

        //Get The Grahql file
        File file = resource.getFile();

        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(file);
        RuntimeWiring runtimeWiring = buildRuntimeWiring();

        GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
        graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private void loadDataIntoHSQL() {
        Stream.of(
                new Book("1001", "The C Programming Language", "PHI Learning", "1978",
                        new String[]{
                                "Brian W. Kernighan (Contributor)",
                                "Dennis M. Ritchie"
                        }),
                new Book("1002", "Your Guide To Scrivener", "MakeUseOf.com", " April 21st 2013",
                        new String[]{
                                "Nicole Dionisio (Goodreads Author)"
                        }),
                new Book("1003", "Beyond the Inbox: The Power User Guide to Gmail", " Kindle Edition", "November 19th 2012",
                        new String[]{
                                "Shay Shaked"
                                , "Justin Pot"
                                , "Angela Randall (Goodreads Author)"
                        }),
                new Book("1004", "Scratch 2.0 Programming", "Smashwords Edition", "February 5th 2015",
                        new String[]{
                                "Denis Golikov (Goodreads Author)"
                        }),
                new Book("1005", "Pro Git", "by Apress (first published 2009)", "2014",
                        new String[]{
                                "Scott Chacon"
                        })
        ).forEach(
                book -> bookRepository.save(book)
        );
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("allBooks", allBooksDataFetcher))
                .build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }
}