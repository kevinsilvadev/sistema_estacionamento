package com.apiestacionamento.puc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_pagamentos")
public class Pagamentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pagamento;

    private String modo;

    private Timestamp hora_data;

    private Double valor;

    public Pagamentos(){
    }

    public Pagamentos(Long id_pagamento, String modo, Timestamp hora_data, Double valor) {
        this.id_pagamento = id_pagamento;
        this.modo = modo;
        this.hora_data = hora_data;
        this.valor = valor;
    }

    public Long getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Long id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Timestamp getHora_data() {
        return hora_data;
    }

    public void setHora_data(Timestamp hora_data) {
        this.hora_data = hora_data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
