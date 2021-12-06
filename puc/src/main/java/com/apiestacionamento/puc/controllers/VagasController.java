package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Vagas;
import com.apiestacionamento.puc.service.ClientsService;
import com.apiestacionamento.puc.service.VagasService;
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
@RequestMapping("/vagas")
public class VagasController {

    @Autowired
    private VagasService vagas;

    @GetMapping
    public ResponseEntity<List<Vagas>> findAll() {
        List<Vagas> list  = vagas.findAll();
        return ResponseEntity
                .ok()
                .body(list);
    }

    @PostMapping
    public ResponseEntity <Vagas> insert(
            @RequestBody
                    Vagas obj){
        obj = vagas
                .insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId_vaga())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
