package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Pagamentos;
import com.apiestacionamento.puc.service.ClientsService;
import com.apiestacionamento.puc.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@Controller
@RequestMapping("/pagamentos")
public class PagamentosController {

    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping
    public ResponseEntity<List<Pagamentos>> findAll() {
        List<Pagamentos> list  = pagamentosService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity <Pagamentos> insert(@RequestBody Pagamentos obj){
        obj = pagamentosService.insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId_pagamento())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
