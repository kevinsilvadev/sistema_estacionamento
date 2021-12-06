package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsService {

    @Autowired
    private ClientsRepository repository;

    public List<Clients> findAll(){
        return repository.findAll();
    }

    public Clients insert(Clients obj) {
        return repository.save(obj);
    }

    public Clients findById(Long id) {
        Optional<Clients> obj = repository.findById(id);
        return obj.orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Clients update(Long id, Clients obj) {

            Clients entity = repository.getOne(id);
            updateData(entity, obj);
            return repository.save(entity);
    }

    private void updateData(Clients entity, Clients obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setCpf(obj.getCpf());
        entity.setCpf(obj.getSenha());

    }
}
