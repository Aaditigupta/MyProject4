package com.mindtree.authorbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.authorbook.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
