package com.apiestacionamento.puc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_adm")
public class Adm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_adm;

    private String nome;

    private String senha;

    public Adm(){
    }

    public Adm(Long id_adm, String nome, String senha) {
        this.id_adm = id_adm;
        this.nome = nome;
        this.senha = senha;
    }

    public Long getId_adm() {
        return id_adm;
    }

    public void setId_adm(Long id_adm) {
        this.id_adm = id_adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adm adm = (Adm) o;
        return id_adm.equals(adm.id_adm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_adm);
    }
}
