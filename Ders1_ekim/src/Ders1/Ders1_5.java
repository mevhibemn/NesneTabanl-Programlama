package Ders1;

import java.util.Scanner; 

public class Ders1_5 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 

        
        final double PI = 3.14159;

        
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        double yaricap = input.nextDouble();

        
        double alan = PI * yaricap * yaricap;

        
        System.out.printf("Dairenin alanı: %.2f\n", alan);

        input.close(); 
    }
}
