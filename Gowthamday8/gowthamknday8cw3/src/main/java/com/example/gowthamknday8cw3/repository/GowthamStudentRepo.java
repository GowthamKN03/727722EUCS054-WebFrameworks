package com.example.gowthamknday8cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamknday8cw3.model.GowthamStudent;

import java.util.List;


@Repository
public interface GowthamStudentRepo extends JpaRepository<GowthamStudent,Integer>{

    List<GowthamStudent> findByMarksGreaterThan(int marks); 
    List<GowthamStudent> findByMarksLessThan(int marks); 
}
