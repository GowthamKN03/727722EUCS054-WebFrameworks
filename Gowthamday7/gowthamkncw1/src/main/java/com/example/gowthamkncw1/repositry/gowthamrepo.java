package com.example.gowthamkncw1.repositry;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gowthamkncw1.model.gowthammodel;
import java.util.List;


@Repository
public interface gowthamrepo extends JpaRepository<gowthammodel,Integer>{

    List<gowthammodel> findByAge(int age);
    
}
