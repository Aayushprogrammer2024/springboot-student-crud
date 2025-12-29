package com.example.CRUDApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUDApp.Entity.student;

@Repository
public interface  StudentRepository  extends CrudRepository<student, Integer>{
    
}
