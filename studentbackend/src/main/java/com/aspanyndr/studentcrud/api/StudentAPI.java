package com.aspanyndr.studentcrud.api;


import com.aspanyndr.studentcrud.model.Student;
import com.aspanyndr.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentAPI {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public  String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }
}
