package com.example.skillboxsecondtask.event;

import org.springframework.context.ApplicationEvent;

public class StudentAllCleanedEvent extends ApplicationEvent {
    public StudentAllCleanedEvent(Object source) {
        super(source);
    }
}
