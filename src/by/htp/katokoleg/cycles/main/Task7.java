package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

//7. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task7 {

	public static void main(String[] args) {

		int a;
		int b;
		double h;
		double y;

		a = enterInt("Enter beginning of the segment: ");
		b = enterInt("Enter end of the segment(b must be > a): ");
		h = enterDouble("Enter step: ");
		

		for (double i = a; i <=b; i = i + h) {
			if (i <= 2) {
				y = -i;
				System.out.println("In point x = " + i + ", y = " + y);
			}
			
			else if (i > 2) {
				y = i;
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
