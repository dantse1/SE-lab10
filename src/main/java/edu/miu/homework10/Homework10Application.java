package edu.miu.homework10;

import edu.miu.homework10.services.implementations.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework10Application implements CommandLineRunner {
    @Autowired
    StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(Homework10Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
    }

}
