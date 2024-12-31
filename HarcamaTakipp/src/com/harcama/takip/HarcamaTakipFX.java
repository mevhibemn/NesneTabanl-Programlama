package com.harcama.takip;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HarcamaTakipFX extends Application {
    private HarcamaYoneticisi harcamaYoneticisi = new HarcamaYoneticisi();
    private VeritabaniYoneticisi veritabaniYoneticisi = new VeritabaniYoneticisi();

    @Override
    public void start(Stage primaryStage) {
        // Veritabanına bağlantı
        veritabaniYoneticisi.baglan();  // Veritabanı bağlantısını başlatıyoruz

        // Ana Layout
        BorderPane root = new BorderPane();
        VBox menu = new VBox(10);
        menu.setPadding(new Insets(10));

        // Menü Butonları
        Button harcamaGirisButon = new Button("Harcama Gir");
        Button grafikButon = new Button("Harcamaları Gör");
        Button raporButon = new Button("Aylık Raporlar");

        menu.getChildren().addAll(harcamaGirisButon, grafikButon, raporButon);
        root.setLeft(menu);

        // Harcama Giriş Ekranı
        harcamaGirisButon.setOnAction(e -> {
            VBox harcamaPanel = new VBox(10);
            harcamaPanel.setPadding(new Insets(10));

            Label kategoriLabel = new Label("Kategori:");
            TextField kategoriField = new TextField();
            Label tutarLabel = new Label("Tutar:");
            TextField tutarField = new TextField();

            Button kaydetButon = new Button("Kaydet");

            kaydetButon.setOnAction(ev -> {
                String kategori = kategoriField.getText();
                double tutar;
                try {
                    tutar = Double.parseDouble(tutarField.getText());
                    harcamaYoneticisi.harcamaEkle(kategori, tutar);
                    veritabaniYoneticisi.harcamaKaydet(kategori, tutar);
                    kategoriField.clear();
                    tutarField.clear();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Harcama başarıyla kaydedildi!");
                    alert.showAndWait();
                } catch (NumberFormatException ex) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "Geçersiz tutar!");
                    alert.showAndWait();
                }
            });

            harcamaPanel.getChildren().addAll(kategoriLabel, kategoriField, tutarLabel, tutarField, kaydetButon);
            root.setCenter(harcamaPanel);
        });

        // Sahne ve Pencere Ayarları
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Harcama Takip Sistemi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
