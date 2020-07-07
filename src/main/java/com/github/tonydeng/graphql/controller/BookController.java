package com.github.tonydeng.graphql.controller;

import com.github.tonydeng.graphql.service.GraphQLService;
import graphql.ExecutionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengtao
 **/
@RequestMapping("/rest/books")
@RestController
@Slf4j
public class BookController {

    private GraphQLService graphQLService;

    @Autowired
    public BookController(GraphQLService graphQLService) {
        this.graphQLService = graphQLService;
    }

    @PostMapping
    public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
        log.info("Entering getAllBooks@BookController......");
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
