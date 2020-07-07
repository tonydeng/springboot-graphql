package com.github.tonydeng.graphql.service.datafetcher;

import com.github.tonydeng.graphql.model.Book;
import com.github.tonydeng.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dengtao
 **/
@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {

    private BookRepository bookRepository;

    @Autowired
    public AllBooksDataFetcher(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return bookRepository.findAll();
    }
}
