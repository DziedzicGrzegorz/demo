package com.example.demo.MongoDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void saveUser(User user) {
        repository.save(user);
    }

    //get
    public User getUser(String id) {
        return repository.findById(id).orElse(null);
    }

    //getAll
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    //delete
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
