package Ders1;

import java.util.Scanner; 

public class Ders1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        
        System.out.print("Kilonuzu (kg) giriniz: ");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu (metre) giriniz: ");
        double boy = input.nextDouble();

        
        double vki = kilo / (boy * boy);

        
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", vki);

        
        if (vki < 18.5) {
            System.out.println("Zayıf");
        } else if (vki >= 18.5 && vki < 24.9) {
            System.out.println("Normal");
        } else if (vki >= 24.9 && vki < 29.9) {
            System.out.println("Şişman");
        } else {
            System.out.println("Obez");
        }

       
    }
}
