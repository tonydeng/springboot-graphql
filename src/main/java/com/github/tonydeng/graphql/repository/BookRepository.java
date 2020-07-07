package com.github.tonydeng.graphql.repository;

import com.github.tonydeng.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dengtao
 **/
public interface BookRepository extends JpaRepository<Book,String> {
}
