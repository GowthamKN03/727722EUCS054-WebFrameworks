package com.example.gowthamknday6cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.gowthamknday6cw1.model.GowthamChildren;


@Repository
public interface GowthamChildrenRepo extends JpaRepository<GowthamChildren,Integer>{
    
}
