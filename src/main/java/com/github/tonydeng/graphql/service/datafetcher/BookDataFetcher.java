package com.github.tonydeng.graphql.service.datafetcher;

import com.github.tonydeng.graphql.model.Book;
import com.github.tonydeng.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dengtao
 **/
@Component
public class BookDataFetcher implements DataFetcher<Book> {

    private final BookRepository bookRepository;

    @Autowired
    public BookDataFetcher(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        String isn = dataFetchingEnvironment.getArgument("id");
        return bookRepository.findById(isn).orElse(null);
    }
}
