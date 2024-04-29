package com.example.gowthamknday14cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamknday14cw2.model.GowthamBook;


@Repository
public interface GowthamBookRepo extends JpaRepository<GowthamBook,Integer> {
    
}
