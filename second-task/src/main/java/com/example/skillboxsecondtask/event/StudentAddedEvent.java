package com.example.skillboxsecondtask.event;

import com.example.skillboxsecondtask.model.Student;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// класс генерации событий
@Getter
public class StudentAddedEvent extends ApplicationEvent {

    private final Student student;

    public StudentAddedEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }
}
