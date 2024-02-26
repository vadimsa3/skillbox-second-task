package com.example.skillboxsecondtask.shell;

import com.example.skillboxsecondtask.model.Student;
import com.example.skillboxsecondtask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
@RequiredArgsConstructor
public class StudentCommands {
    private final StudentService studentService;

    @ShellMethod("Add a new student")
    public void addStudent(@ShellOption String firstName, @ShellOption String lastName, @ShellOption int age) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        studentService.addStudent(student);
    }

    @ShellMethod("Delete a student")
    public void deleteStudent(@ShellOption Long id) {
        studentService.deleteStudent(id);
    }

    @ShellMethod("View all students")
    public void viewStudents() {
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @ShellMethod("Clear all students")
    public void clearStudents() {
        studentService.clearStudents();
    }
}
