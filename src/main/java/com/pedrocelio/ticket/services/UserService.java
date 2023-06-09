package com.pedrocelio.ticket.services;

import com.pedrocelio.ticket.entities.User;
import com.pedrocelio.ticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User id){
        return userRepository.save(id);
    }
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
