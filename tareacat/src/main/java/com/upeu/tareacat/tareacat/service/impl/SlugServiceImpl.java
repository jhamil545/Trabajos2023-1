package com.upeu.tareacat.tareacat.service.impl;

import com.upeu.tareacat.tareacat.entity.Slug;
import com.upeu.tareacat.tareacat.repository.SlugRepository;
import com.upeu.tareacat.tareacat.service.ProductoService;

import com.upeu.tareacat.tareacat.service.SlugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SlugServiceImpl implements SlugService {

    @Autowired
    private SlugRepository slugRepository;
    @Override
    public List<Slug> list() {
        return slugRepository.findAll();
    }
    @Override
    public Slug save(Slug slug) {
        return slugRepository.save(slug);
    }
    @Override
    public Slug update(Slug slug) {
        return slugRepository.save(slug);
    }
    @Override
    public Optional<Slug> listById(Integer id) {
        return slugRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id) {
        slugRepository.deleteById(id);
    }
}
