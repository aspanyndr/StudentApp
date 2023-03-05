package com.aspanyndr.studentcrud.service;

import com.aspanyndr.studentcrud.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAll();

}
