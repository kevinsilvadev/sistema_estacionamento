package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Ticket;
import com.apiestacionamento.puc.service.ClientsService;
import com.apiestacionamento.puc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@Controller
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> findAll() {
        List<Ticket> list  = ticketService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Ticket> findById(@PathVariable Long id){
        Ticket obj = ticketService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity <Ticket> insert(@RequestBody Ticket obj){
        obj = ticketService
                .insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId_ticket())
                .toUri();
        return ResponseEntity
                .created(uri)
                .body(obj);
    }

}
