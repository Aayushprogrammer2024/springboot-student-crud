package com.example.CRUDApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUDApp.Entity.student;
import com.example.CRUDApp.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepo;
    public Iterable<student> showAll()
    {
        return studentrepo.findAll();
    }
    public student insert(student st)
    {
        return studentrepo.save(st);
    }
    public void delete(int rollno)
    {
        studentrepo.deleteById(rollno);
    }
    public student get(int rollno)
    {
        return studentrepo.findById(rollno).get();
    }

}
