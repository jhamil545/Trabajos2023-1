package com.upeu.tareacat.tareacat.service;

import com.upeu.tareacat.tareacat.entity.Producto;
import com.upeu.tareacat.tareacat.entity.Slug;

import java.util.List;
import java.util.Optional;

public interface SlugService {
    public List<Slug> list();

    Slug save(Slug slug);

    Slug update(Slug slug);

    Optional<Slug> listById(Integer id);

    void deleteById(Integer id);
}
