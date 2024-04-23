package com.example.gowthamkncw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowthamkncw2.model.GowthamCourse;
import com.example.gowthamkncw2.service.GowthamCourseService;

import java.util.*;


@RestController
public class GowthamCourseController {
    @Autowired
    private GowthamCourseService ser;

    @PostMapping("/api/course")
    public ResponseEntity<GowthamCourse> post(@RequestBody GowthamCourse person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/course")
    public ResponseEntity<List<GowthamCourse>> getAll() {
        List<GowthamCourse> li = ser.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<GowthamCourse>> getbyAge(@PathVariable String courseName) {
        List<GowthamCourse> li = ser.getbyAge(courseName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
