package com.github.tonydeng.graphql;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dengtao
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GraphqlApplicationTest {

    @Test
    public void contextLoads() {
        log.info("Context Loader.......");
    }
}
