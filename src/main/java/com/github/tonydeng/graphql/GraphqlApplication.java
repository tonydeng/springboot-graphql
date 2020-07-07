package com.github.tonydeng.graphql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dengtao
 **/
@SpringBootApplication
@Slf4j
public class GraphqlApplication {
    public static void main(String[] args) {
        log.info("Graphql Application Start......");
        SpringApplication.run(GraphqlApplication.class, args);
    }
}
