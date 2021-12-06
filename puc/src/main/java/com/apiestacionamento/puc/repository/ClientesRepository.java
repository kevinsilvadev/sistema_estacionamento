package com.apiestacionamento.puc.repository;

import com.apiestacionamento.puc.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
}
