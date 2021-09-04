package com.ivoronline.springboot_db_query_native_create_mapping_entities.repositories;

import com.ivoronline.springboot_db_query_native_create_mapping_entities.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
