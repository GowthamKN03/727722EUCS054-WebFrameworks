package com.example.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.one.model.GowthamProduct;
import com.example.one.repository.GowthamProductRepo;

@Service
public class GowthamProductService {

    @Autowired
    public GowthamProductRepo collegeRepository;

    public GowthamProduct saveCollege(@RequestBody GowthamProduct college)
    {
        return collegeRepository.save(college);
    }
    public GowthamProduct getCollege(int id)
    {
        return collegeRepository.findById(id).orElse(null);
    }

    public void DeleteStudent(int a)
    {
        collegeRepository.deleteById(a);
    }
}
