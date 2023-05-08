package com.upeu.tareacat.tareacat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Slug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SlugId;
    private String SlugName;
}
