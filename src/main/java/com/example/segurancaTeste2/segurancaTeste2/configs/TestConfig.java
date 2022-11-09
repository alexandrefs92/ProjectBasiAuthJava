package com.example.segurancaTeste2.segurancaTeste2.configs;

import com.example.segurancaTeste2.segurancaTeste2.enums.RoleName;
import com.example.segurancaTeste2.segurancaTeste2.models.ClienteModel;
import com.example.segurancaTeste2.segurancaTeste2.models.RoleModel;
import com.example.segurancaTeste2.segurancaTeste2.models.UserModel;
import com.example.segurancaTeste2.segurancaTeste2.repositories.ClienteRepository;
import com.example.segurancaTeste2.segurancaTeste2.repositories.RoleRepository;
import com.example.segurancaTeste2.segurancaTeste2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {





    /*    ClienteModel cli1 = new ClienteModel(null, "Alexandre");

        clienteRepository.save(cli1);

        UserModel user1 = new UserModel(null, "alexandre", new BCryptPasswordEncoder().encode("senha123"));
        userRepository.save(user1);*/

    }
}
