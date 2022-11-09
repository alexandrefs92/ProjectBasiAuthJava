package com.example.segurancaTeste2.segurancaTeste2.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_cliente")
public class ClienteModel implements Serializable  {

    @Serial
    private static final long serialVersionUID = 8602953607052807752L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public ClienteModel() {

    }
    public ClienteModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteModel ClienteModel = (ClienteModel) o;
        return id.equals(ClienteModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
