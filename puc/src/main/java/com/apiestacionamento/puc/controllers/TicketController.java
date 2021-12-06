package com.apiestacionamento.puc.controllers;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Ticket;
import com.apiestacionamento.puc.service.ClientsService;
import com.apiestacionamento.puc.service.TicketService;
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
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> findAll() {
        List<Ticket> list  = ticketService.findAll();
        return ResponseEntity.ok().body(list);
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
