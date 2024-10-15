package Ders1;
import java.util.Scanner;
public class Ders1_6 {

	public static void main(String[] args) 
	{
	
		
		        Scanner input = new Scanner(System.in);

		        
		        System.out.print("Bir sayı giriniz: ");
		        int sayi = input.nextInt();

		        int tersSayi = 0;
		        int kalan;

		        
		        while (sayi != 0) {
		            kalan = sayi % 10;            
		            tersSayi = tersSayi * 10 + kalan; 
		            sayi /= 10;                   
		        }

		        
		        System.out.println("Sayının tersi: " + tersSayi);

		        
		    }


	}
