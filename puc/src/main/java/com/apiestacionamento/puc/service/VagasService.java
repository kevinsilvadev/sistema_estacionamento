package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Vagas;
import com.apiestacionamento.puc.repository.ClientsRepository;
import com.apiestacionamento.puc.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagasService {

    @Autowired
    private VagasRepository vagas;

    public List<Vagas> findAll() {
        return vagas.findAll();
    }

    public Vagas insert(Vagas obj) {
        return vagas.save(obj);
    }
}
