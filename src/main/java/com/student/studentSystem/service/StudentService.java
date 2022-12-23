package com.student.studentSystem.service;

import com.student.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getStudentList();
}
