package com.upeu.tareacat.tareacat.service;

import com.upeu.tareacat.tareacat.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public List<Producto> list();

    Producto save(Producto producto);

    Producto update(Producto producto);

    Optional<Producto> listById(Integer id);

    void deleteById(Integer id);
}
