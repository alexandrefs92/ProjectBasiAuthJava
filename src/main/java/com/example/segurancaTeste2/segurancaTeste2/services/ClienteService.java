package com.example.segurancaTeste2.segurancaTeste2.services;

import com.example.segurancaTeste2.segurancaTeste2.models.ClienteModel;
import com.example.segurancaTeste2.segurancaTeste2.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> findAll() {
        return repository.findAll();
    };

    public ClienteModel findById(Long id) {
        Optional<ClienteModel> obj = repository.findById(id);
        return obj.get();
    }
}
