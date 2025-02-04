package com.munawer.JDBCPractice;

import com.munawer.JDBCPractice.model.Student;
import com.munawer.JDBCPractice.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcPracticeApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(148);
		s1.setName("Mamun");
		s1.setMarks(99);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s1);

		List<Student> allStudents =  service.getAllStudents();
		System.out.println(allStudents);

	}

}
