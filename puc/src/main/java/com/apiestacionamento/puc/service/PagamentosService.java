package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Pagamentos;
import com.apiestacionamento.puc.repository.ClientsRepository;
import com.apiestacionamento.puc.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentosService {

    @Autowired
    private PagamentoRepository pagamentosRepository;

    public List<Pagamentos> findAll() {
        return  pagamentosRepository.findAll();
    }

    public Pagamentos insert(Pagamentos obj) {
        return pagamentosRepository.save(obj);
    }
}
