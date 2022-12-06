package com.hackathon.dataprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.dataprocess.module.Author;

public interface AuthorRepository extends JpaRepository<Author, String>{

}
