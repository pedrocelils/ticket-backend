package com.pedrocelio.ticket.services;

import com.pedrocelio.ticket.entities.Ticket;
import com.pedrocelio.ticket.entities.User;
import com.pedrocelio.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findAll(){
        return ticketRepository.findAll();
    }
    public Ticket saveTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }
    public Ticket getTicketById(Long id) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        return optionalTicket.orElse(null);
    }
    public void deleteById(Long id){
        ticketRepository.deleteById(id);
    }
}
