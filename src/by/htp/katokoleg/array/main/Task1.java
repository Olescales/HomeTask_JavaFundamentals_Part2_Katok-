package by.htp.katokoleg.array.main;

import java.util.Random;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

	public static void main(String[] args) {

		int k;
		int n;
		int randomNumber;
		int number;

		Random rd = new Random();

		k = rd.nextInt(15) + 1;
		n = rd.nextInt(20);

		System.out.println("k = " + k);
		System.out.println("n = " + n);
		System.out.println("==============================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			randomNumber = rd.nextInt(100);
			a[i] = randomNumber;
			System.out.print(a[i] + "   ");	
		}
		for (int i = 0; i < n; i++) {
			number = a[i];
			if (number % k == 0) {
				System.out.print("\nNumber: " + number);
			}
		}
	}

}
