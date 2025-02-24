package com.SpringJdbc.SimpleStudentManagement;

import com.SpringJdbc.SimpleStudentManagement.Model.Student;
import com.SpringJdbc.SimpleStudentManagement.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleStudentManagementApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SimpleStudentManagementApplication.class, args);
		Student student = context.getBean( Student.class);
		student.setName("Naim Mollah");
		student.setMarks(98);
		student.setRollNo(1);

		Student student2 = context.getBean(Student.class);
		student2.setName("Taj");
		student2.setMarks(99);
		student2.setRollNo(3);

		StudentService studentService = (StudentService) context.getBean("studentService");

		studentService.deleteStudent(student);

		System.out.println("Here is the output of a all students:\n");
		System.out.println(studentService.getAllStudents());

		studentService.addStudent(student);
		studentService.addStudent(student2);
		System.out.println("Here is the output of a all students:\n");
		System.out.println(studentService.getAllStudents());

		System.out.println("Here is the output of a particular student:\n");
		System.out.println(studentService.findByRollNo(student2.getRollNo()));
	}

}
