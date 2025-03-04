package com.triad_knights.agri_connect.service;


import com.triad_knights.agri_connect.model.User;
import com.triad_knights.agri_connect.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepository;
    @Autowired
    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user) ;
    }
}
