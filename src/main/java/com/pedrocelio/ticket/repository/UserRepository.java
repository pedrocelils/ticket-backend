package com.pedrocelio.ticket.repository;

import com.pedrocelio.ticket.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
