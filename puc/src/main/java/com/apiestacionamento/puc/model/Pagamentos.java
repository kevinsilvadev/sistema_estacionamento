package com.apiestacionamento.puc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "tb_pagamentos")
public class Pagamentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pagamento;

    private String status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-3")
    private Instant hora_saida;

    private Double valor;

    public Pagamentos(){
    }

    public Pagamentos(Long id_pagamento, String status, Instant hora_saida, Double valor) {
        this.id_pagamento = id_pagamento;
        this.status = status;
        this.hora_saida = hora_saida;
        this.valor = valor;
    }

    public Long getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Long id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public String getModo() {
        return status;
    }

    public void setModo(String status) {
        this.status = status;
    }

    public Instant getHora_data() {
        return hora_saida;
    }

    public void setHora_data(Instant hora_data) {
        this.hora_saida = hora_saida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
