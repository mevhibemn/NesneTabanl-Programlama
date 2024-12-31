module HarcamaTakipp {
    requires transitive javafx.graphics; // Stage ve sahne yönetimi için gerekli
    requires javafx.controls;           // Button, Label gibi JavaFX bileşenleri için gerekli
    requires javafx.fxml;               // FXML desteği için gerekli
    requires java.sql;                  // Veritabanı işlemleri için gerekli

    exports com.harcama.takip;          // Uygulamanızın ana paketi
}
