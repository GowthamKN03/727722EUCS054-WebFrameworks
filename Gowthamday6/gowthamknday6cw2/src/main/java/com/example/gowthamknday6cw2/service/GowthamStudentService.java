package com.example.gowthamknday6cw2.service;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.gowthamknday6cw2.model.GowthamStudent;
import com.example.gowthamknday6cw2.repository.GowthamRepo;




@Service
public class GowthamStudentService {
    public GowthamRepo studentRepo;
    public GowthamStudentService(GowthamRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }
    public boolean postStudent(GowthamStudent student)
    {
        try{

            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GowthamStudent> paginationStudents(int pageno,int size)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<GowthamStudent>  sortPaginationStudents(int pageno,int size,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
