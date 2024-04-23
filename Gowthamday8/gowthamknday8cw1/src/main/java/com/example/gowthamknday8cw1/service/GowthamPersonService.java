package com.example.gowthamknday8cw1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamknday8cw1.model.GowthamPerson;
import com.example.gowthamknday8cw1.repository.GowthamPersonRepo;




@Service
public class GowthamPersonService {
    @Autowired
    private GowthamPersonRepo rep;

    public boolean post(GowthamPerson person)
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

    public List<GowthamPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<GowthamPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}