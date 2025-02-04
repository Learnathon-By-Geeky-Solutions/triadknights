package com.SpringJdbc.SimpleStudentManagement.Repository;

import com.SpringJdbc.SimpleStudentManagement.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "insert into student values(?,?,?)";
        int rowsAffected = jdbcTemplate.update(sql,student.getRollNo(),student.getName(), student.getMarks());
        System.out.println(rowsAffected + " rows affected");
    }

    public List<Student> findAll() {
       String sql = "select * from student";
        RowMapper<Student> mapper = (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollno"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        };
        return jdbcTemplate.query(sql, mapper);
    }
    public void deleteStudent(Student student) {
        String sql = "delete from student where rollNo = ?";
        jdbcTemplate.update(sql,student.getRollNo());
    }

    public Student getStudent(int rollNo) {
        String sql = "select * from student where rollNo = ?";
        RowMapper<Student> mapper = (rs, rowNum) ->{
            Student st = new Student();
            st.setRollNo(rs.getInt("rollno"));
            st.setName(rs.getString("name"));
            st.setMarks(rs.getInt("marks"));
            return st;
        };
        return jdbcTemplate.queryForObject(sql,mapper,rollNo);
    }
}
