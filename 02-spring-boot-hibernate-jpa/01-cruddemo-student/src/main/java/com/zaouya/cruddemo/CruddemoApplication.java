package com.zaouya.cruddemo;

import com.zaouya.cruddemo.dao.StudentDAO;
import com.zaouya.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
		return runner -> {
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Create a new 3 student objects ... ");
		Student tmpStudent1 = new Student("Hamza", "Zaouya", "contact@zaouya.com");
		Student tmpStudent2 = new Student("Bahim", "Rawi", "b_rawi@gmail.com");
		Student tmpStudent3 = new Student("Salma", "Malki", "salma_malki2002@gmail.com");


		// save the student object
		System.out.println("Saving the Student ... ");
		studentDAO.save(tmpStudent1);
		studentDAO.save(tmpStudent2);
		studentDAO.save(tmpStudent3);

		// display id of the saved student
		System.out.println("Saved Student 1. Generated id: " + tmpStudent1.getId());
		System.out.println("Saved Student 2. Generated id: " + tmpStudent2.getId());
		System.out.println("Saved Student 3. Generated id: " + tmpStudent3 .getId());
	}
}
