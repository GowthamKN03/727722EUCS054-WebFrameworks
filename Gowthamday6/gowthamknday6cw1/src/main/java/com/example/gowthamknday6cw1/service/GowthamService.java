package com.example.gowthamknday6cw1.service;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.gowthamknday6cw1.model.GowthamChildren;
import com.example.gowthamknday6cw1.repository.GowthamChildrenRepo;



@Service
public class GowthamService {
    public GowthamChildrenRepo childrenRepo;
    public GowthamService(GowthamChildrenRepo c)
    {
        this.childrenRepo =  c;
    }
    public boolean postChildren(GowthamChildren children)
    {
        try{

            childrenRepo.save(children);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GowthamChildren> getSortedChildrens(String field)
    {
        return childrenRepo.findAll(Sort.by(field));
    }
    public List<GowthamChildren> getPaginationChildrens(int offset,int size)
    {
        return childrenRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<GowthamChildren> getSortedPaginationChildrens(int offset,int size,String field)
    {
        return childrenRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}