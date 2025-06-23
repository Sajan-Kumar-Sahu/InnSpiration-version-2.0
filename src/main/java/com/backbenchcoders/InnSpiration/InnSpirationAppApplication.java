package com.backbenchcoders.InnSpiration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InnSpirationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnSpirationAppApplication.class, args);
	}

}
