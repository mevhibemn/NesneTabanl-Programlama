package Ders1;

import java.util.Scanner;

public class Ders1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enet first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
		
		

	}

}
