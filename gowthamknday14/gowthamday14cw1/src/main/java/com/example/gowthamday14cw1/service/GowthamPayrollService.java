package com.example.gowthamday14cw1.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamday14cw1.model.GowthamPayroll;
import com.example.gowthamday14cw1.repository.GowthamPayRollRepo;


@Service
public class GowthamPayrollService {
    @Autowired
    GowthamPayRollRepo payrollRepo;

    public GowthamPayroll addPayroll(Long id,GowthamPayroll payroll)
    {
        GowthamPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<GowthamPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
