package com.alif.pelanggan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alif.pelanggan.model.Pelanggan;

public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {
}
