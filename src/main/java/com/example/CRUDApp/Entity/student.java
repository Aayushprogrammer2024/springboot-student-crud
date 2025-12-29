package com.example.CRUDApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class student {
    @Id
    int rollno;
    String name;
    int age;
    String address;

    public student()
    {

    }

    public student(String address, int age, String name, int rollno) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
   public String getName()
   {
    return name;
   }

   public void setName(String name)
   {
    this.name=name;
   }
   public int getAge()
   {
    return age;
   }

   public void setAge(int age)
   {
    this.age=age;
   }

   public String getAddress()
   {
    return address;
   }
   public void setAddress(String address){
    this.address=address;
   }
}
