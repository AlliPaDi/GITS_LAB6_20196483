package com.example.gtics_lab6_20196483.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreservas;
    @Column(nullable = false)
    private String fechainicio;
    @Column(nullable = false)
    private String fechafinal;
}
