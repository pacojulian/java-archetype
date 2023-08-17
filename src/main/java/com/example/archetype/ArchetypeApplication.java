package com.example.archetype;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ArchetypeApplication {

	public static void main(String[] args) {

		if(Arrays.stream(args).anyMatch("dbinit"::equals)) {
			new SpringApplicationBuilder(LiquiBaseInit.class)
					.contextFactory(ApplicationContextFactory.ofContextClass(AnnotationConfigApplicationContext.class))
					.profiles("dbinit")
					.run(args);
			return;
		}
		SpringApplication.run(ArchetypeApplication.class, args);
	}
}
