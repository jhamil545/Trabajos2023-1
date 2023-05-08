package com.example.venta.service.impl;

import com.example.venta.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VentaServiceImpl implements VentaService {
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> list() {
        return productoRepository.findAll();
    }
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Optional<Producto> listById(Integer id) {
        return productoRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }
}
