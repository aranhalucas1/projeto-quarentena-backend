package com.projeto.quarentena.services;

import com.projeto.quarentena.domain.Categoria;
import com.projeto.quarentena.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void instantiateDatabaseTest() {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "ELetrodomésticos");
        Categoria cat3 = new Categoria(null, "Lazer");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
