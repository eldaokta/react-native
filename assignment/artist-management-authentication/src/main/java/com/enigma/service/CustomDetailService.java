package com.enigma.service;

import com.enigma.enitity.User;
import com.enigma.exception.UserNotFound;
import com.enigma.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User userFound = userRepository.findUserByUserName(userName);
        if (userFound == null) {
            throw new UserNotFound();
        }
        userFound.setPassword(passwordEncoder().encode(userFound.getPassword()));
        return new org.springframework.security.core.userdetails.User(userFound.getUserName(), userFound.getPassword(), new ArrayList<GrantedAuthority>());

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
