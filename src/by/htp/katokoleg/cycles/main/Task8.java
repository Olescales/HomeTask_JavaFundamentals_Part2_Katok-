package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

//8. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task8 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		double h;
		double y;

		a = enterInt("Enter beginning of the segment: ");
		b = enterInt("Enter end of the segment(b must be > a): ");
		
		
		c = (int) (Math.random() * 100) ;
		System.out.println(c);
		h = enterDouble("Enter step: ");

		for (double i = a; i <= b; i = i + h) {
			if (i == 15) {
				y = (i + c) * 2;
				System.out.println("In point x = " + i + ", y = " + y);
			}

			else if (i != 15) {
				y = (i - c) + 6;
				System.out.println("In point x = " + i + ", y = " + y);
			}
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

	public static double enterDouble(String message) {

		double a;

		System.out.println(message);

		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			String s;
			s = sc.next();
			System.out.println("Incorrect!  " + s);
			System.out.println(message);
		}
		a = sc.nextDouble();
		return a;
	}
	
}
