package com.example.skillboxsecondtask.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.MessageFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return MessageFormat.format("Student {0} - {1} {2}, age: {3}", id, lastName, firstName, age);
    }
}
