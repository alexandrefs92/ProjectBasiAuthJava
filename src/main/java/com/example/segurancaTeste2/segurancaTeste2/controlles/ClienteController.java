package com.example.segurancaTeste2.segurancaTeste2.controlles;

import com.example.segurancaTeste2.segurancaTeste2.models.ClienteModel;
import com.example.segurancaTeste2.segurancaTeste2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<ClienteModel>> findAll() {
        List<ClienteModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteModel> findById(@PathVariable Long id) {
        ClienteModel obj  = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
