package com.SpringJdbc.SimpleStudentManagement.Service;

import com.SpringJdbc.SimpleStudentManagement.Model.Student;
import com.SpringJdbc.SimpleStudentManagement.Repository.StudentRepo;
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

    public void addStudent(Student student) {
        repo.save(student);
    }

    public Student findByRollNo(int rollNo) {
        return repo.getStudent(rollNo);
    }
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
    public void deleteStudent(Student student) {
        repo.deleteStudent(student);
    }
}
