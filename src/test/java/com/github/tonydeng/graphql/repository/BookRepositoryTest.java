package com.github.tonydeng.graphql.repository;

import com.github.tonydeng.graphql.GraphqlApplicationTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dengtao
 **/
@Slf4j
public class BookRepositoryTest extends GraphqlApplicationTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void testRepositoryNotNull() {
        Assertions.assertNotNull(bookRepository);
    }

}
