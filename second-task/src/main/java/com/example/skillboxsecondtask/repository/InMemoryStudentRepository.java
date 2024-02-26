package com.example.skillboxsecondtask.repository;

import com.example.skillboxsecondtask.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class InMemoryStudentRepository implements StudentRepository {

    private final Map<Long, Student> students = new HashMap<>();

    private final AtomicLong currentId = new AtomicLong(1);

    @Override
    public void addStudent(Student student) {
        Long id = currentId.getAndIncrement();
        student.setId(id);
        students.put(id, student);
    }

    @Override
    public void deleteStudent(Long id) {
        students.remove(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void clearStudents() {
        students.clear();
    }

}
