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

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(FiatluxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "ELetrodomésticos");
		Categoria cat3 = new Categoria(null, "Lazer");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
