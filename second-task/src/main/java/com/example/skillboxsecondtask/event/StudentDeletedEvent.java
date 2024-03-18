package com.example.skillboxsecondtask.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// класс генерации событий
@Getter
public class StudentDeletedEvent extends ApplicationEvent {

    private final Long id;

    public StudentDeletedEvent(Object source, Long id) {
        super(source);
        this.id = id;
    }
}
