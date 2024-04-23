package com.example.gowthamkncw3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamkncw3.model.AmrethDoor;
import com.example.gowthamkncw3.repository.AmrethDoorRepo;



@Service
public class AmrethDoorService {
    @Autowired
    private AmrethDoorRepo rep;

    public boolean post(AmrethDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmrethDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AmrethDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AmrethDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
