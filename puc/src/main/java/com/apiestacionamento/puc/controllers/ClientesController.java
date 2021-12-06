package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Adm;
import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.repository.ClientsRepository;
import com.apiestacionamento.puc.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;


@RestController
public class ClientesController {

    @Autowired
    private ClientsService service;

    @GetMapping("/clientes")
    public ResponseEntity<List<Clients>> findAll() {
        List<Clients> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Clients> findById(@PathVariable Long id){
        Clients obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping (value = "/clientes")
    public ResponseEntity <Clients> insert( @RequestBody Clients obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_cliente()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Clients> update(@PathVariable Long id, @RequestBody Clients obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
