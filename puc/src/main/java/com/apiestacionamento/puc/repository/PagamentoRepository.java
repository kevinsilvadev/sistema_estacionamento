package com.apiestacionamento.puc.repository;

import com.apiestacionamento.puc.model.Pagamentos;
import com.apiestacionamento.puc.model.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamentos, Long> {
}
