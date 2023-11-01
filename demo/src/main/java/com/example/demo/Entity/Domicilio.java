package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="domicilios")
public class Domicilio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idDomicilio;

    @Column(name="calle", nullable=false, length = 12)
    private String calle;

    @Column(name="altura", nullable=false, length = 50)
    private String altura;

    @Column(name="piso", nullable=false, length = 50)
    private String piso;
}
