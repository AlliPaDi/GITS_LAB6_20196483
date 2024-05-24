package com.example.gtics_lab6_20196483.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "mesas")
public class Mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmesas;
    @Column(nullable = false)
    private String nombremesas;
    @Column(nullable = false)
    private int capacidad;
    @Column(nullable = false)
    private String ubicacion;
}




