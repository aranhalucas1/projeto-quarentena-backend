package com.projeto.quarentena.services;

import com.projeto.quarentena.domain.Categoria;
import com.projeto.quarentena.domain.Produto;
import com.projeto.quarentena.repositories.CategoriaRepository;
import com.projeto.quarentena.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public void instantiateDatabaseTest() {
        Produto p1 = new Produto(null, "Computador", 2200.0);
        Produto p2 = new Produto(null, "Maquina de lavar", 1400.0);
        Produto p3 = new Produto(null, "Televisão", 3200.0);
        Produto p4 = new Produto(null, "Churrasqueira", 800.0);


        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "ELetrodomésticos");
        Categoria cat3 = new Categoria(null, "Lazer");
        p1.getCategorias().add(cat1);
        p2.getCategorias().add(cat2);
        p3.getCategorias().add(cat2);
        p4.getCategorias().add(cat3);

        cat1.getProdutos().add(p1);
        cat2.getProdutos().addAll(Arrays.asList(p2, p3));
        cat3.getProdutos().add(p4);



        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));






    }
}
