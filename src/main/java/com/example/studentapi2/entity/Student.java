package com.example.studentapi2.entity;

import jakarta.persistence.*;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String dept;
    private int age;

    public Student(){
        //default constructor
    }

    public Student(String name, String dept, int age){
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    //getters
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public void setAge(int age){
        this.age = age;
    }
}