package com.example.gowthamday13cw1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamday13cw1.model.GowthamBook;

@Repository
public interface GowthamBookRepository extends JpaRepository<GowthamBook, Long> {
}