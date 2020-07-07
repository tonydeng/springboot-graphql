package com.github.tonydeng.graphql.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dengtao
 **/
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    private String isn;
    private String title;
    private String publisher;
    private String publishedDate;
    private String[] author;
}
