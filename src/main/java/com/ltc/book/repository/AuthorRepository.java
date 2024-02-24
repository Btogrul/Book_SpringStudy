package com.ltc.book.repository;

import com.ltc.book.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    ArrayList<Author> findAll();
}
