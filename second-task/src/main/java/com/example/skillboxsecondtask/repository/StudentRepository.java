package com.example.skillboxsecondtask.repository;

import com.example.skillboxsecondtask.model.Student;

import java.util.List;

public interface StudentRepository {

    void addStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getAllStudents();

    void clearStudents();

    Student getStudentById(Long id);
}