package com.unciadroolsnotin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UnciaDroolsNotinApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnciaDroolsNotinApplication.class, args);
		System.out.println("Testing demo!");
	}

    @Bean
    public List<String> excludedNames() {
        List<String> excludedNames = new ArrayList<>();
        // Add names to exclude
        excludedNames.add("John");
        excludedNames.add("Alice");
        return excludedNames;
    }
    
}
