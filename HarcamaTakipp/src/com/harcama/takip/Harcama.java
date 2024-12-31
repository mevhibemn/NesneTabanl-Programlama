package com.harcama.takip;

// Harcamaları temsil eden model sınıfı
public class Harcama {
    private String kategori; // Harcama kategorisi
    private double tutar;    // Harcama tutarı

    // Yapıcı metod: Harcama bilgilerini başlatır
    public Harcama(String kategori, double tutar) {
        this.kategori = kategori;
        this.tutar = tutar;
    }

    // Kategori bilgisini döndüren metod
    public String getKategori() {
        return kategori;
    }

    // Tutar bilgisini döndüren metod
    public double getTutar() {
        return tutar;
    }
}
