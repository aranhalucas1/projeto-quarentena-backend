package com.projeto.quarentena.controller;

import com.projeto.quarentena.domain.Categoria;
import com.projeto.quarentena.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias", method = RequestMethod.GET)
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<Categoria>> findAll() {
        List<Categoria> categorias = categoriaService.findAll();
        return ResponseEntity.ok().body(categorias);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private ResponseEntity<?> find(@PathVariable Integer id) {
        var obj = categoriaService.findById(id);
        if(!obj.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(obj);
    }
}
