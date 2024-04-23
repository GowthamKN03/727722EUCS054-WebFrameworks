package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.GowthamPerson;
import com.example.springapp.service.GowthamPersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
    
    @Autowired
    public GowthamPersonService personService;

    @PostMapping("/person")
    public ResponseEntity<GowthamPerson> getMeth(@RequestBody GowthamPerson person)
    {
        GowthamPerson p = personService.savePerson(person);
        if(p != null)
        {
            return ResponseEntity.status(HttpStatus.CREATED).body(p);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/person/byage/{age}")
    public ResponseEntity<List<GowthamPerson>> getBy(@PathVariable("age") int a)
    {
        List<GowthamPerson> p1 = personService.getAges(a);
        if(p1 != null)
        {
            return ResponseEntity.status(HttpStatus.OK).body(p1);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
