package com.example.cw_5.controller;
import com.example.cw_5.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {
    private final ObjectMapper objectMapper;

    public StudentController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
      
    }

    @GetMapping("/student")
    public String getStudents() throws JsonProcessingException {
        List<Student> students = new ArrayList<>();
        Student obj = new Student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, John!");
        students.add(obj);
        return obj.getMessage();
    }
}
