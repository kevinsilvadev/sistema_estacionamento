package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Adm;
import com.apiestacionamento.puc.repository.AdmRepository;
import com.apiestacionamento.puc.repository.ClientsRepository;
import com.apiestacionamento.puc.service.AdmService;
import com.apiestacionamento.puc.service.ClientsService;
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
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    private AdmService adm;


    @GetMapping
    public ResponseEntity<List<Adm>> findAll() {
        List<Adm> list = adm.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity <Adm> insert( @RequestBody Adm obj){
        obj = adm
                .insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId_adm())
                .toUri();
        return ResponseEntity
                .created(uri)
                .body(obj);
    }
}
