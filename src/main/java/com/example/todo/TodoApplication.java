package com.example.todo;

import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	/*@Bean
	ApplicationRunner applicationRunner(TodoRepository todoRepository) {
		return args -> {
			todoRepository.save( new Todo("Test 1", "Test a description"));
			todoRepository.save( new Todo("Test 2", "Test a description"));
			todoRepository.save( new Todo("Test 3", "Test a description"));
		};
	}*/
}
