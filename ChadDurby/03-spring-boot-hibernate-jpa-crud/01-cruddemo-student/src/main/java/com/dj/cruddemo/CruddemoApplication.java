package com.dj.cruddemo;

import com.dj.cruddemo.dao.StudentDAO;
import com.dj.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			createMulitpleStudents(studentDAO);
//			findStudents(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create student obj
		Student student = new Student("Dhirendra Kumar", "Jaiswal", "dkjaiswal771999@gmail.com");

		// save student obj
		studentDAO.save(student);

		// display id of the saved student obj
		System.out.println("saved student, generated id: " + student.getId());
	}

	private void createMulitpleStudents(StudentDAO studentDAO) {
		// create multiple students objects
		Student std1 = new Student("Shubham", "Jaiswal", "Shubham@gmail.com");
		Student std2 = new Student("Soham", "Jaiswal", "Soham@gmail.com");
		Student std3 = new Student("Rishu", "Jaiswal", "Rishu@gmail.com");

		// save created student objects
		studentDAO.save(std1);
		studentDAO.save(std2);
		studentDAO.save(std3);
	}

	private void findStudents(StudentDAO studentDAO) {
		Student std1 = studentDAO.findById(1);
		System.out.println(std1);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> students = studentDAO.findAll();

		// display list of students
		for (Student std : students) {
			System.out.println(std);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Jaiswal");

		for (Student std: students) {
			System.out.println(std);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		// find student by id: primary key
		Student std = studentDAO.findById(1);
		// change first name to "Scooby"
		std.setFirstName("Scooby");
		// update student
		studentDAO.update(std);
		// display updated student
		System.out.println(std);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		Integer id = 1;
		studentDAO.delete(id);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int deletedRowsCount = studentDAO.deleteAll();
		System.out.println("deleted rows count: " + deletedRowsCount);
	}
}
