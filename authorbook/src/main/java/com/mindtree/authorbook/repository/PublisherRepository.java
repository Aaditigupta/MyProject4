package com.mindtree.authorbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.authorbook.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer>{

}
