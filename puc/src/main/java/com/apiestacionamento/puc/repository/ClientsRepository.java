package com.apiestacionamento.puc.repository;


import com.apiestacionamento.puc.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
}
