package com.apiestacionamento.puc.repository;


import com.apiestacionamento.puc.model.Totem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotemRepository extends JpaRepository<Totem, Long> {
}
