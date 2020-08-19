package com.github.tonydeng.graphql;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author dengtao
 **/
@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j(topic = "test")
public class GraphqlApplicationTest {


    @Test
    void testContextLoads() {
        log.info("Context Loader.......");
    }
}
