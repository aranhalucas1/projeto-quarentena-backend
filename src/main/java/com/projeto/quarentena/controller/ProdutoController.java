package com.projeto.quarentena.controller;

import com.projeto.quarentena.domain.Produto;
import com.projeto.quarentena.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> list = produtoService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
