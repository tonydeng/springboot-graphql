package com.github.tonydeng.graphql.repository;

import com.github.tonydeng.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dengtao
 **/
@Repository
public interface BookRepository extends JpaRepository<Book,String> {
}
