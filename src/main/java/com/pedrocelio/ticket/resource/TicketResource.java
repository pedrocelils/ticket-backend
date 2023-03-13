package com.pedrocelio.ticket.resource;

import com.pedrocelio.ticket.entities.Ticket;
import com.pedrocelio.ticket.entities.User;
import com.pedrocelio.ticket.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketResource {

    @Autowired
    public TicketService ticketService;
    @GetMapping
    public ResponseEntity<List<Ticket>> getAllUsers() {
        List<Ticket> tickets = ticketService.findAll();
        return ResponseEntity.ok(tickets);
    }
    @PostMapping
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket){
        Ticket savedTicket = ticketService.saveTicket(ticket);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedTicket);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Ticket> findById(@PathVariable Long id) {
        Ticket obj = ticketService.getTicketById(id);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicketById(@PathVariable Long id) {
        ticketService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
