package com.example.gowthamknday6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamknday6cw3.model.GowthamProduct;



@Repository
public interface GowthamProductRepo extends JpaRepository<GowthamProduct,Integer>{
    
}
