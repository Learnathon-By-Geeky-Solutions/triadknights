package com.munawer.JDBCPractice.repo;

import com.munawer.JDBCPractice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student (roll, name, marks) values(?,?,?)";
        int rowsAffected = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("Rows affected: " + rowsAffected);
        System.out.println("Student with name: " + student.getName() + " is added successfully.");
    }

    public List<Student> getAllStudentsList() {
        List<Student> studentList = new ArrayList<>();
        String sql = "select * from student";

        return jdbc.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("roll"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student student = new Student();
//                student.setRollNo(rs.getInt("roll"));
//                student.setName(rs.getString("name"));
//                student.setMarks(rs.getInt("marks"));
//                return student;
//            }
//        };
//
//        return jdbc.query(sql, mapper);

    }
}
