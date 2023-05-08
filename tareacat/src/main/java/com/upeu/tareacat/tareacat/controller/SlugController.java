package com.upeu.tareacat.tareacat.controller;

import com.upeu.tareacat.tareacat.entity.Producto;
import com.upeu.tareacat.tareacat.entity.Slug;
import com.upeu.tareacat.tareacat.service.ProductoService;
import com.upeu.tareacat.tareacat.service.SlugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/slug")
public class SlugController {
    @Autowired
    private SlugService slugService;

    @GetMapping()
    public List<Slug> listar() {
        return slugService.list();
    }

    @PostMapping()
    public Slug guardar(@RequestBody Slug slug) {
        return slugService.save(slug);
    }

    @GetMapping("/{id}")
    public Slug buscarPorId(@PathVariable(required = true) Integer id) {
        return slugService.listById(id).get();
    }

    @PutMapping()
    public Slug actualizar(@RequestBody Slug slug) {
        return slugService.update(slug);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id) {
        slugService.deleteById(id);
    }
}
