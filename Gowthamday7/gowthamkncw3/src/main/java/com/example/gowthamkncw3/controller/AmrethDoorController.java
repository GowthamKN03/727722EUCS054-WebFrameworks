package com.example.gowthamkncw3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowthamkncw3.model.AmrethDoor;
import com.example.gowthamkncw3.service.AmrethDoorService;

import java.util.*;

@RestController
public class AmrethDoorController {
    @Autowired
    private AmrethDoorService ser;
    
    @PostMapping("/api/door")
    public ResponseEntity<AmrethDoor> post(@RequestBody AmrethDoor door)
    {
        if(ser.post(door))
        {
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/door")
    public ResponseEntity<List<AmrethDoor>> getAll()
    {
        List<AmrethDoor> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<AmrethDoor>> getbyId(@PathVariable int doorId)
    {
        List<AmrethDoor> li = ser.getbyDoorId(doorId);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/door/accessType/{accessType}")
    public ResponseEntity<List<AmrethDoor>> getbyType(@PathVariable String accessType)
    {
        List<AmrethDoor> li = ser.getbyType(accessType);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

