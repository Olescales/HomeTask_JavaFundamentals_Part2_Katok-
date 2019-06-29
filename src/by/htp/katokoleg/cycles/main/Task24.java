package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

/*24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
сравнению с введенным числом.*/

public class Task24 {

	public static void main(String[] args) {
		
		int number;
		int mirrorNumber = 0;
		int recidue;
		int sum_even = 0;
		

		number = enterNumber("Введите число: ");

		for (int i = number; i > 0; i = i / 10) {
			
			recidue = i % 10;
			if (recidue % 2 == 0) {
				sum_even += recidue;
			} 
			mirrorNumber = mirrorNumber * 10 + recidue;
		}
		
		System.out.println(sum_even);
		System.out.print("Number: " + number);
		System.out.println(" And its mirror number " + mirrorNumber);
		
	}

	public static int enterNumber(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("Вы ввели не число: " + S);
			System.out.println("Введите число: ");
		}
		x = sc.nextInt();

		return x;
	}
	
}
