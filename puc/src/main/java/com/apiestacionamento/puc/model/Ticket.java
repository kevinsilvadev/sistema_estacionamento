package com.apiestacionamento.puc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.security.CodeSigner;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_ticket")
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ticket;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant hora_entrada;

    @OneToOne
    private Pagamentos id_pagamento;

    @OneToOne
    private Totem id_totem;

    @OneToOne
    private Clients clients;

    public  Ticket() {
    }

    public Long getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(Long id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Instant getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Instant hora_entrada) {
        this.hora_entrada = hora_entrada;
    }


    public Pagamentos getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Pagamentos id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public Totem getId_totem() {
        return id_totem;
    }

    public void setId_totem(Totem id_totem) {
        this.id_totem = id_totem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id_ticket.equals(ticket.id_ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ticket);
    }
}
