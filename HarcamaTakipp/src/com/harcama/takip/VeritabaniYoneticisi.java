package com.harcama.takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeritabaniYoneticisi {
    private Connection baglanti;

    // Veritabanına bağlanır
    public void baglan() {
        try {
            // SQLite veritabanına bağlantı kuruyoruz
            baglanti = DriverManager.getConnection("jdbc:sqlite:harcamalar.db");
            String tabloOlusturSQL = "CREATE TABLE IF NOT EXISTS harcamalar (kategori TEXT, tutar REAL)";
            baglanti.createStatement().execute(tabloOlusturSQL);
            System.out.println("Veritabanına başarıyla bağlanıldı!");
        } catch (SQLException e) {
            System.err.println("Veritabanına bağlanırken hata oluştu: " + e.getMessage());
        }
    }

    // Yeni bir harcama kaydeder
    public void harcamaKaydet(String kategori, double tutar) {
        String sql = "INSERT INTO harcamalar (kategori, tutar) VALUES (?, ?)";
        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setString(1, kategori);
            pstmt.setDouble(2, tutar);
            pstmt.executeUpdate();
            System.out.println("Harcama başarıyla kaydedildi.");
        } catch (SQLException e) {
            System.err.println("Veritabanına veri kaydedilirken hata oluştu: " + e.getMessage());
        }
    }

    // Veritabanı bağlantısını kapatır
    public void baglantiyiKapat() {
        try {
            if (baglanti != null) {
                baglanti.close();
                System.out.println("Veritabanı bağlantısı kapatıldı.");
            }
        } catch (SQLException e) {
            System.err.println("Bağlantı kapatılırken hata oluştu: " + e.getMessage());
        }
    }
}
