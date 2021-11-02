package com.bebo.springbootbookseller.repository;

import com.bebo.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
