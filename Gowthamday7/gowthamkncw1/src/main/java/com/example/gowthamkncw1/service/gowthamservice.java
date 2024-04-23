package com.example.gowthamkncw1.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamkncw1.model.gowthammodel;
import com.example.gowthamkncw1.repositry.gowthamrepo;


@Service
public class gowthamservice {
    @Autowired
    private gowthamrepo rep;

    public boolean post(gowthammodel person)
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

    public List<gowthammodel> getAll()
    {
        return rep.findAll();
    }

    public List<gowthammodel> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}

