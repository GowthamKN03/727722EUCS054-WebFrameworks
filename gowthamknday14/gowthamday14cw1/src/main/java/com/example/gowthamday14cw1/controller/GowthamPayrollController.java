package com.example.gowthamday14cw1.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowthamday14cw1.model.GowthamPayroll;
import com.example.gowthamday14cw1.service.GowthamPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class GowthamPayrollController {
    @Autowired
    public GowthamPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public GowthamPayroll addPayroll(@PathVariable Long employeeId,@RequestBody GowthamPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<GowthamPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
