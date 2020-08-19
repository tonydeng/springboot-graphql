package com.github.tonydeng.graphql.service;

import com.github.tonydeng.graphql.GraphqlApplicationTest;
import graphql.ExecutionResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dengtao
 **/
@Slf4j(topic = "test")
public class GraphQLServiceTest extends GraphqlApplicationTest {

    @Autowired
    private GraphQLService graphQLService;


    @Test
    void testGetGraphQL() {
        Assertions.assertNotNull(graphQLService.resource);
        log.info("{}", graphQLService.resource.getFilename());

        ExecutionResult execute = graphQLService.getGraphQL().execute("{\n" +
                "   allBooks{\n" +
                "       isn\n" +
                "       title\n" +
                "       author\n" +
                "       publisher\n" +
                "       publishedDate\n" +
                "   }\n" +
                "}");
        Assertions.assertNotNull(execute);
        log.info("{}", execute);
    }
}
