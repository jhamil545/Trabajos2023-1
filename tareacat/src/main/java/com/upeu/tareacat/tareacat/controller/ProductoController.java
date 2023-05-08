package com.upeu.tareacat.tareacat.controller;

import com.upeu.tareacat.tareacat.entity.Producto;
import com.upeu.tareacat.tareacat.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public List<Producto> listar() {
        return productoService.list();
    }

    @PostMapping()
    public Producto guardar(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable(required = true) Integer id) {
        return productoService.listById(id).get();
    }

    @PutMapping()
    public Producto actualizar(@RequestBody Producto producto) {
        return productoService.update(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id) {
        productoService.deleteById(id);
    }
}
