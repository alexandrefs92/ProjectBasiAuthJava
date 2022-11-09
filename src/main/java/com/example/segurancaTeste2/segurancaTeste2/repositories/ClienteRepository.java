package com.example.segurancaTeste2.segurancaTeste2.repositories;

import com.example.segurancaTeste2.segurancaTeste2.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<ClienteModel, Long> {

}
