package com.example.studentapi2.repository;

import org.springframework.data.jpa.repository.*;
import com.example.studentapi2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{}