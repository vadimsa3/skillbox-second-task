package com.example.skillboxsecondtask.event;

import com.example.skillboxsecondtask.model.Student;
import com.example.skillboxsecondtask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
// активируется при true в файле свойств
@ConditionalOnProperty(name = "app.create-students-on-startup", havingValue = "true")
@RequiredArgsConstructor
public class StartupEventListener {

    private final StudentService studentService;

    @EventListener(ApplicationStartedEvent.class)
    public void createStudents() {
        studentService.addStudent(Student.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .age(18)
                .build());
        studentService.addStudent(Student.builder()
                .firstName("Andrey")
                .lastName("Petrov")
                .age(17)
                .build());
    }
}
