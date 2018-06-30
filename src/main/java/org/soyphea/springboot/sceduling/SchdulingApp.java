package org.soyphea.springboot.sceduling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchdulingApp {

	public static void main(String args[]) {
		
		SpringApplication.run(SchdulingApp.class, args);
		
	}



}
