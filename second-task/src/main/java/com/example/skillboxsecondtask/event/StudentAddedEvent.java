package com.example.skillboxsecondtask.event;

import com.example.skillboxsecondtask.model.Student;
import org.springframework.context.ApplicationEvent;

public class StudentAddedEvent extends ApplicationEvent {

    private final Student student;

    public StudentAddedEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
