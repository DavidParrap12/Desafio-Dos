package com.challenger.DesafioDos;

import com.challenger.DesafioDos.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
