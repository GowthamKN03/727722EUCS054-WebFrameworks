package com.example.gowthamkncw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamkncw2.model.GowthamCourse;

import java.util.List;


@Repository
public interface GowthamCourseRepo extends JpaRepository<GowthamCourse,Integer>{

    List<GowthamCourse> findByCourseName(String courseName);
    
}