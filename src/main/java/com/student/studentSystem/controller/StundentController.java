package com.student.studentSystem.controller;

import com.student.studentSystem.model.Student;
import com.student.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StundentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student Added";
    }
    @GetMapping("/getAll")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
}
