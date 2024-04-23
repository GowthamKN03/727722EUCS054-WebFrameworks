package com.example.gowthamkncw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamkncw3.model.AmrethDoor;

import java.util.List;

@Repository
public interface AmrethDoorRepo extends JpaRepository<AmrethDoor,Integer>{

    List<AmrethDoor> findByDoorId(int doorId);
    List<AmrethDoor> findByAccessType(String accessType);
    
}
