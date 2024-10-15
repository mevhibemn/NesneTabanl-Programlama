package Ders1;

import java.util.Scanner; 

public class Ders1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Beş basamaklı bir sayı giriniz: ");
        int sayi = input.nextInt(); 

        
        int BesinciBasamak = sayi % 10;
        int DorduncuBasamak = (sayi / 10) % 10;
        int UcuncuBasamak = (sayi / 100) % 10;
        int IkinciBasamak = (sayi / 1000) % 10;
        int BirinciBasamak = (sayi / 10000) % 10;

        
        System.out.printf("Birinci basamak: %d\n", BirinciBasamak);
        System.out.printf("İkinci basamak: %d\n", IkinciBasamak);
        System.out.printf("Üçüncü basamak: %d\n", UcuncuBasamak);
        System.out.printf("Dördüncü basamak: %d\n", DorduncuBasamak);
        System.out.printf("Beşinci basamak: %d\n", BesinciBasamak);

        
    }
}
