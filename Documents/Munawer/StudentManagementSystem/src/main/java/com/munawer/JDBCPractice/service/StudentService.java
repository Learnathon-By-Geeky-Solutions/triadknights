package com.munawer.JDBCPractice.service;

import com.munawer.JDBCPractice.model.Student;
import com.munawer.JDBCPractice.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s1) {
        repo.save(s1);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudentsList();
    }
}
