package com.apiestacionamento.puc.service;

import com.apiestacionamento.puc.model.Clients;
import com.apiestacionamento.puc.model.Ticket;
import com.apiestacionamento.puc.repository.ClientsRepository;
import com.apiestacionamento.puc.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findAll() {
        return  ticketRepository.findAll();
    }

    public Ticket insert(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
