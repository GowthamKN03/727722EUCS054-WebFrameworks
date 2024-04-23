package com.example.gowthamknday8cw3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamknday8cw3.model.GowthamStudent;
import com.example.gowthamknday8cw3.repository.GowthamStudentRepo;




@Service
public class GowthamStudentService {
    @Autowired
    private GowthamStudentRepo studentRepo;

    public boolean post(GowthamStudent student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GowthamStudent> getAll()
    {
        return studentRepo.findAll();
    }

    public List<GowthamStudent> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<GowthamStudent> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}
