package com.github.tonydeng.graphql.service.datafetcher;

import com.github.tonydeng.graphql.GraphqlApplicationTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dengtao
 **/
@Slf4j
public class BookDataFetcherTest extends GraphqlApplicationTest {

    @Autowired
    private BookDataFetcher bookDataFetcher;

    @Test
    void testNotNull(){
        Assertions.assertNotNull(bookDataFetcher);
    }
}
