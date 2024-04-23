package com.example.gowthamknday8cw1.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamknday8cw1.model.GowthamPerson;

import java.util.List;


@Repository
public interface GowthamPersonRepo extends JpaRepository<GowthamPerson,Integer>{

    List<GowthamPerson> findByNameStartingWith(String name);
    List<GowthamPerson> findByNameEndingWith(String name);
    
}
