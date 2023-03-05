package com.aspanyndr.studentcrud.service;

import com.aspanyndr.studentcrud.model.Student;
import com.aspanyndr.studentcrud.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }


}
