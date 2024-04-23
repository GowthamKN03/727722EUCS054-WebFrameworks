package com.example.gowthamkncw2.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamkncw2.model.GowthamCourse;
import com.example.gowthamkncw2.repository.GowthamCourseRepo;

@Service
public class GowthamCourseService {
    @Autowired
    private GowthamCourseRepo rep;

    public boolean post(GowthamCourse person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GowthamCourse> getAll()
    {
        return rep.findAll();
    }

    public List<GowthamCourse> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
