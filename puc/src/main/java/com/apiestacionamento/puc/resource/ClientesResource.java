package com.apiestacionamento.puc.resource;

import com.apiestacionamento.puc.model.Clientes;
import com.apiestacionamento.puc.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class ClientesResource {

    @Autowired
    private ClientesRepository repo;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Clientes>> findAll() {
        List<Clientes> clientes = repo.findAll();
        return ResponseEntity.ok().body(clientes);
    }
}
