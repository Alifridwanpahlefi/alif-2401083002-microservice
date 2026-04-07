package com.alif.produk.service;

import com.alif.produk.model.Produk;
import com.alif.produk.repository.ProdukRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdukService {

    private final ProdukRepository repository;

    public ProdukService(ProdukRepository repository) {
        this.repository = repository;
    }

    public List<Produk> getAll() {
        return repository.findAll();
    }

    public Produk save(Produk produk) {
        return repository.save(produk);
    }
}