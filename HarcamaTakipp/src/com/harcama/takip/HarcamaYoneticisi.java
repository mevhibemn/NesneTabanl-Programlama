package com.harcama.takip;

import java.util.ArrayList;
import java.util.List;

// Harcamaların yönetimi için sınıf
public class HarcamaYoneticisi {
    private List<Harcama> harcamalar;

    public HarcamaYoneticisi() {
        harcamalar = new ArrayList<>();
    }

    // Yeni bir harcama ekler
    public void harcamaEkle(String kategori, double tutar) {
        harcamalar.add(new Harcama(kategori, tutar));
    }

    // Kategoriye göre filtrelenmiş harcamaları döndürür
    public List<Harcama> harcamalariGetir(String kategoriFiltre) {
        if (kategoriFiltre == null || kategoriFiltre.isEmpty()) {
            return harcamalar;
        }
        return harcamalar.stream()
                .filter(h -> h.getKategori().contains(kategoriFiltre))
                .toList();
    }

    // Toplam harcama tutarını hesaplar
    public double toplamHarcamayiHesapla() {
        return harcamalar.stream().mapToDouble(Harcama::getTutar).sum();
    }
}
