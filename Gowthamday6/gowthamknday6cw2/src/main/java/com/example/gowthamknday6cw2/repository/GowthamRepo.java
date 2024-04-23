package com.example.gowthamknday6cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gowthamknday6cw2.model.GowthamStudent;




public interface GowthamRepo extends JpaRepository<GowthamStudent,Integer>{
    
}
