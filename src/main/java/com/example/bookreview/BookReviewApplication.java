package com.example.bookreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookReviewApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookReviewApplication.class, args);
	}
}
