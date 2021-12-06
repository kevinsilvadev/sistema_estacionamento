package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Totem;
import com.apiestacionamento.puc.model.Vagas;
import com.apiestacionamento.puc.repository.TotemRepository;
import com.apiestacionamento.puc.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotemService {

    @Autowired
    private TotemRepository totem;

    public List<Totem> findAll() {
        return totem.findAll();
    }

    public Totem insert(Totem obj) {
        return totem.save(obj);
    }
}
