package com.projeto.quarentena;

import com.projeto.quarentena.domain.Categoria;
import com.projeto.quarentena.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FiatluxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FiatluxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
