package com.example.gowthamday14cw1.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamday14cw1.model.GowthamEmployee;
import com.example.gowthamday14cw1.repository.GowthamEmployeeRepo;


@Service

public class GowthamEmployeeService {
    @Autowired
    GowthamEmployeeRepo employeeRepo;

    public GowthamEmployee addEmployee(GowthamEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GowthamEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<GowthamEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
