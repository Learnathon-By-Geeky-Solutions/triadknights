package com.triad_knights.agri_connect.service;


import com.triad_knights.agri_connect.model.User;
import com.triad_knights.agri_connect.model.UserPrincipal;
import com.triad_knights.agri_connect.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);
    private final UserRepo repository;

    @Autowired
    public MyUserDetailsService(UserRepo repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = repository.findByUsername(username);

        if (user.isEmpty()) {
            logger.warn("User not found: {}", username);
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user.orElse(null));
    }
}

