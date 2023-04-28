package com.kshrd.oauth2.service;

import com.kshrd.oauth2.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserService implements UserDetailsService {

//    private final UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        GrantedAuthority authority = new SimpleGrantedAuthority("read");
//        return new org.springframework.security.core.userdetails.User("username", "$2a$10$62sB9ONzgIFT0AXQi7KD6e/bUVQikszVzXwYVGCGVlzUTQI0u3GVq", List.of(authority));
        return new org.springframework.security.core.userdetails.User("username", "123", List.of(authority));

    }
}
