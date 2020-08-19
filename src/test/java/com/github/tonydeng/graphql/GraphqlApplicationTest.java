package com.github.tonydeng.graphql;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author dengtao
 **/
@SpringBootTest(classes = GraphqlApplicationTest.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j(topic = "test")
public class GraphqlApplicationTest {

    @SpringBootApplication(scanBasePackages = {"com.github.tonydeng.graphql"})
    static class SpringTestConfiguation {

    }

    @Test
    void testContextLoads() {
        log.info("Context Loader.......");
    }
}
