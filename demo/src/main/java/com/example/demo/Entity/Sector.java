package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class Sector {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idSector;

   @Enumerated(value=EnumType.STRING)
   private Sector sector;

   //como funciona esta relación??? Consultar duda?
    @OneToMany(mappedBy = "sector")
   List<Socio> socioList;

}
