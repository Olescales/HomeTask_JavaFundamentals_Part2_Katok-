package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

// 6. Напишите программу, где пользователь вводит любое целое положительное число. А
// программа суммирует все числа от 1 до введенного пользователем числа.

public class Task6 {

	public static void main(String[] args) {
	
		int n = -1;
		int sum = 0;
		
		while (n <= 0) {
			n = enterInt ("Enter number > 0 : ");
		}
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.println("sum: " + sum);
		}
	}

	public static int enterInt (String message) {
		
		int a;
		
		System.out.println(message);
		
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextInt()) {
			String s;
			s = sc.next();
			System.out.println("Incorrect!  " + s);
			System.out.println(message);
		}
		a = sc.nextInt();
		return a;
	}
	
}
