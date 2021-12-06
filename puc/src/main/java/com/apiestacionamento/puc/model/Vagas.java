package com.apiestacionamento.puc.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_vagas")
public class Vagas {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id_vaga;

    private Integer vagas_disponiveis;
    private Integer vagas_usadas;

    public Vagas (){
    }

    public Vagas(Long id_vaga, Integer vagas_disponiveis, Integer vagas_usadas) {
        this.id_vaga = id_vaga;
        this.vagas_disponiveis = vagas_disponiveis;
        this.vagas_usadas = vagas_usadas;
    }

    public Long getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(Long id_vaga) {
        this.id_vaga = id_vaga;
    }

    public Integer getVagas_disponiveis() {
        return vagas_disponiveis;
    }

    public void setVagas_disponiveis(Integer vagas_disponiveis) {
        this.vagas_disponiveis = vagas_disponiveis;
    }

    public Integer getVagas_usadas() {
        return vagas_usadas;
    }

    public void setVagas_usadas(Integer vagas_usadas) {
        this.vagas_usadas = vagas_usadas;
    }
}
