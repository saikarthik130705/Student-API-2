package com.example.studentapi2.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.studentapi2.entity.Student;
import com.example.studentapi2.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}