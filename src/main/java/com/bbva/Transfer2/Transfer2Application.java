package com.bbva.Transfer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.bbva.Transfer2.model")
public class Transfer2Application {

	public static void main(String[] args) {
		SpringApplication.run(Transfer2Application.class, args);
	}

}
