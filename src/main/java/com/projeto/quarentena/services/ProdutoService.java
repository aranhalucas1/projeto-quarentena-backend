package com.projeto.quarentena.services;

import com.projeto.quarentena.domain.Produto;
import com.projeto.quarentena.repositories.ProdutoRepository;
import com.projeto.quarentena.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto find(Integer id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("O produto id " + " não foi encontrado"));
    }
}
