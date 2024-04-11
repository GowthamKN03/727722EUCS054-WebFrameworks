package com.example.cy_1.controller;

import com.example.cy_1.model.Family;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class FamilyController {

    @GetMapping("/family")
    public List<Family> fam(){
        List<Family> l=new ArrayList<>();
        Family f=new Family();
        f.setName(" John");
        f.setAge(90);
        f.setRelation("Grandpa");
        l.add(f);
        return l;
    }
    
}

