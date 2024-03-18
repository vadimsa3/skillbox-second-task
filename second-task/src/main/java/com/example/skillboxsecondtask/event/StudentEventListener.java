package com.example.skillboxsecondtask.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

// класс-слушатель событий StudentAddedEvent и StudentDeletedEvent
@Component
@Slf4j
public class StudentEventListener {

    // методы реализуются при публикации события

    @EventListener
    public void handleStudentAddedEvent(StudentAddedEvent event) {
        log.info("Student added: " + event.getStudent());
    }

    @EventListener
    public void handleStudentDeletedEvent(StudentDeletedEvent event) {
        log.info("Student deleted: " + event.getId());
    }
}