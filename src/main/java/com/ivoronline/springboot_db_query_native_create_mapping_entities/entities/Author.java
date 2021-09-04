package com.ivoronline.springboot_db_query_native_create_mapping_entities.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
  name     = "AuthorBookMapping",
  entities = {
    @EntityResult(
      entityClass = Author.class,
      fields = {
        @FieldResult(name = "id"  , column = "authorId"), //All Columns must be mapped
        @FieldResult(name = "name", column = "name"),
        @FieldResult(name = "age" , column = "age"),
        @FieldResult(name = "book", column = "book_id")
      }
    ),
    @EntityResult(
      entityClass = Book.class,
      fields = {
        @FieldResult(name = "id"   , column = "bookId"),
        @FieldResult(name = "title", column = "title")
      }
    )
  }
)
@Entity
public class Author {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //RELATIONSHIP
  @OneToOne(cascade = CascadeType.ALL)
  public Book book;  //Column = book_id

}





