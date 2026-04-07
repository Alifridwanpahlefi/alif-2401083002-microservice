package com.alif.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") // 🔥 FIX DISINI
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_produk;
    private Long id_pelanggan;
    private double harga;
    private int jumlah;
    private double total;
    private String tanggal;

    // ✅ TAMBAH status (karena dipakai di service)
    private String status;

    // =====================
    // GETTER & SETTER
    // =====================

    public Long getId() {
        return id;
    }

    public Long getId_produk() {
        return id_produk;
    }

    public void setId_produk(Long id_produk) {
        this.id_produk = id_produk;
    }

    public Long getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(Long id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", id_produk=" + id_produk +
                ", id_pelanggan=" + id_pelanggan +
                ", harga=" + harga +
                ", jumlah=" + jumlah +
                ", total=" + total +
                ", tanggal='" + tanggal + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}