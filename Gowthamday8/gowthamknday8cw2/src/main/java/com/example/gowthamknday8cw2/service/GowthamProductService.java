package com.example.gowthamknday8cw2.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.gowthamknday8cw2.model.GowthamProduct;
import com.example.gowthamknday8cw2.repository.GowthamProductRepo;




@Service
public class GowthamProductService {
    @Autowired
    private GowthamProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(GowthamProduct person)
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

    public List<GowthamProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<GowthamProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<GowthamProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
