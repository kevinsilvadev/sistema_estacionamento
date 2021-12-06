package com.apiestacionamento.puc.repository;


import com.apiestacionamento.puc.model.Adm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmRepository extends JpaRepository<Adm, Long> {
}
