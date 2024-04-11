package com.example.cw_4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cw_4.model.Address;


@RestController
public class ApiController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("Amrutha A");
        obj.setDoorNo(123);
        obj.setStreetName("Main St");
        obj.setPincode(600123);
        obj.setArea("Street");
        obj.setDistrict("Chennai");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}

