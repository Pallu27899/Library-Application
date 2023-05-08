package com.library.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
