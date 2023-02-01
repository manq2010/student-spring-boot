package com.example.bookreview.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
           Student mancoba = new Student(
              "Mancoba",
              "man@gmail.com",
              LocalDate.of(2000, JANUARY, 5),
              21
            );

            Student test = new Student(
                    "Test",
                    "test@gmail.com",
                    LocalDate.of(2004, JANUARY, 5),
                    21
            );

            repository.saveAll(
                    List.of(mancoba, test)
            );
        };
    }
}
