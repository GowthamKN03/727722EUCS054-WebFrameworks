package com.example.gowthamday14cw1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamday14cw1.model.GowthamPayroll;



@Repository
public interface GowthamPayRollRepo extends JpaRepository<GowthamPayroll,Long> {
    
}
