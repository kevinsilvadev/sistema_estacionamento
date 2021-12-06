package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Adm;
import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.repository.AdmRepository;
import com.apiestacionamento.puc.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmService {

    @Autowired
    private AdmRepository adm;

    public List<Adm> findAll(){
        return adm.findAll();
    }

    public Adm insert(Adm obj) {
        return adm.save(obj);
    }
}
