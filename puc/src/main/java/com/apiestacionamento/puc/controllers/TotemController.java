package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Totem;
import com.apiestacionamento.puc.model.Vagas;
import com.apiestacionamento.puc.service.TotemService;
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
@RequestMapping("/totem")
public class TotemController {

    @Autowired
    private TotemService totem;

    @GetMapping
    public ResponseEntity<List<Totem>> findAll() {
        List<Totem> list = totem.findAll();
        return ResponseEntity
                .ok()
                .body(list);
    }

    @PostMapping
    public ResponseEntity <Totem> insert(
            @RequestBody
                    Totem obj){
        obj = totem
                .insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
