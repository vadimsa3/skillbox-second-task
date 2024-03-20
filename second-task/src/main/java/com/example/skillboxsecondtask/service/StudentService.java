package com.example.skillboxsecondtask.service;

import com.example.skillboxsecondtask.event.StudentAddedEvent;
import com.example.skillboxsecondtask.event.StudentAllCleanedEvent;
import com.example.skillboxsecondtask.event.StudentDeletedEvent;
import com.example.skillboxsecondtask.model.Student;
import com.example.skillboxsecondtask.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ApplicationEventPublisher eventPublisher; // бин, отвечающий за обработку событий

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
        eventPublisher.publishEvent(new StudentAddedEvent(this, student));
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);
        eventPublisher.publishEvent(new StudentDeletedEvent(this, id));
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void clearStudents() {
        studentRepository.clearStudents();
        eventPublisher.publishEvent(new StudentAllCleanedEvent(this));
    }
}