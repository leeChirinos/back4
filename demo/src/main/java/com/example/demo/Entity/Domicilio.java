package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="domicilios")
public class Domicilio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_domicilio;

    @Column(name="cuit_empresa", nullable=false, length = 12)
    private String cuit_empresa;

    @Column(name="nombre_empresa", nullable=false, length = 50)
    private String nombre_empresa;
}
