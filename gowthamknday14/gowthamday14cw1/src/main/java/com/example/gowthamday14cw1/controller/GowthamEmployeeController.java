package com.example.gowthamday14cw1.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowthamday14cw1.model.GowthamEmployee;
import com.example.gowthamday14cw1.service.GowthamEmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
 @Tag(name = "employee controller", description = "emp controller spin")
public class GowthamEmployeeController {
    @Autowired
    GowthamEmployeeService employeeService;

    @PostMapping("/employee")
    public GowthamEmployee addEmployee(@RequestBody GowthamEmployee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<GowthamEmployee> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<GowthamEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
