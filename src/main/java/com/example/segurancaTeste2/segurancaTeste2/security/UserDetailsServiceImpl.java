package com.example.segurancaTeste2.segurancaTeste2.security;

import com.example.segurancaTeste2.segurancaTeste2.models.UserModel;
import com.example.segurancaTeste2.segurancaTeste2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UserModel user = userRepository.findByUsername(username).orElseThrow( ()  -> new UsernameNotFoundException("User not found with username: " + username));
            return new User(user.getUsername(), user.getPassword(), true, true, true, true, user.getAuthorities());

        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
