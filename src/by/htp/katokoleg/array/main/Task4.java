package by.htp.katokoleg.array.main;

import java.util.Random;

//4. ƒана последовательность действительных чисел а1 а2 ,..., аn . ¬ы€снить, будет ли она возрастающей.

public class Task4 {

	public static void main(String[] args) {

		int n;

		Random rd = new Random();

		n = rd.nextInt(7) + 3;

		System.out.println("Number of elements in array : " + n);
		System.out.println("================================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { // записываем в массив
			a[i] = rd.nextInt(100) - 50;
			System.out.print(a[i] + "   ");
		}

		int counter = 1;

		for (int i = 0, j = 1; i <= a.length - 2; i++, j++) {
			if (a[i] < a[j]) {
				counter++;
			}
		}

		System.out.println("\n" + counter);
		System.out.println(a.length);

		if (counter == a.length) {
			System.out.println("\nYes");
		} else {
			System.out.println("\nNOT");
		}
	}
}
