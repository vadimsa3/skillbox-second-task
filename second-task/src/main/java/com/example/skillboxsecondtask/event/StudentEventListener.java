package com.example.skillboxsecondtask.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

// класс-слушатель событий StudentAddedEvent и StudentDeletedEvent
@Component
public class StudentEventListener {

    // методы реализуются при публикации события

    @EventListener
    public void handleStudentAddedEvent(StudentAddedEvent event) {
        System.out.println("Student added: " + event.getStudent());
    }

    @EventListener
    public void handleStudentDeletedEvent(StudentDeletedEvent event) {
        System.out.println("Student deleted: " + event.getId());
    }
}