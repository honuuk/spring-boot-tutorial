package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jony = new Student("Jony", "gonyy22@gmail.com", LocalDate.of(1994, Month.MAY, 2), 2);
            Student wookgu = new Student("Wookgu", "jewook3617@gmail.com", LocalDate.of(1994, Month.AUGUST, 17), 28);
            repository.saveAll(List.of(jony, wookgu));
        };
    }

}
