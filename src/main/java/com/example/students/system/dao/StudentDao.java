package com.example.students.system.dao;

import com.example.students.system.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface StudentDao extends JpaRepository<Student, Long> {

    //IgnoreCase for Case Insensitive Queries
    public List<Student> findAll();

    public List<Student> findById(int stuId);

    public void deleteById(int stuId);

    //public Student findByStuIdIgnoreCase(String stuId);


}
