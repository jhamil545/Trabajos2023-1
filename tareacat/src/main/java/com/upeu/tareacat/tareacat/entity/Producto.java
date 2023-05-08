package com.upeu.tareacat.tareacat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ProductoId;
    private String ProductoName;
    private String ProductoColor;
    private String ProductoMarca;
    private String ProductoDetalle;
    @ManyToOne
    @JoinColumn(name = "SlugId") // Columna que establece la relación con Cliente
    private Slug Slug;
    }
