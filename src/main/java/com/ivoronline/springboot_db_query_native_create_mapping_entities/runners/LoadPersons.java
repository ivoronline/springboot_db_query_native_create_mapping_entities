package com.ivoronline.springboot_db_query_native_create_mapping_entities.runners;

import com.ivoronline.springboot_db_query_native_create_mapping_entities.entities.Author;
import com.ivoronline.springboot_db_query_native_create_mapping_entities.entities.Book;
import com.ivoronline.springboot_db_query_native_create_mapping_entities.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired AuthorRepository authorRepository;

  @Override
  @Transactional
  public void run(String... args) {

    //CREATE ADDRESS ENTITY
    Book    book        = new Book();
            book.title  = "Dogs";

    //CREATE AUTHOR ENTITY
    Author  author      = new Author();
            author.name = "John";
            author.age  = 20;
            author.book = book;

    //STORE AUTHOR/ADDRESS ENTITY INTO DB
    authorRepository.save(author);

  }

}
