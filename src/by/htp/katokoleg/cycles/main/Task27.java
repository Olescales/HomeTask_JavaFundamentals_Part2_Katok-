package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

//27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме
//единицы и самого числа. m и n вводятся с клавиатуры.

public class Task27 {

	public static void main(String[] args) {

		int m;
		int n;
		int divider;

		m = enterInt("Enter number m: ");
		n = enterInt("Enter number n(n > m ): ");
		
		for (int i = m; i<=n; i++) {
			for (int j = 2; j<=i-1; j++) {
				if ( i % j == 0 ) {
					divider = j;
				System.out.println(divider + " divider for " + i);
				}
			}
			System.out.println("-------------------------------------");
		}

	}

	public static int enterInt(String message) {

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