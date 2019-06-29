package by.htp.katokoleg.array.main;

import java.util.Random;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task9 {

	public static void main(String[] args) {

		int n;
		double min = 0;
		double max = 0;

		Random rd = new Random();

		n = rd.nextInt(15) + 3;

		System.out.println("Number of elements in array : " + n);
		System.out.println("================================");

		double[] a = new double[n];
		for (int i = 0; i < n; i++) { // записываем в массив
			a[i] = rd.nextDouble() * 1000 - 500;
			System.out.print(a[i] + "   ");
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			} else if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.print("\n " + min);
		System.out.print("\n " + max + "\n");

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (min == a[i] & max == a[j]) {
					a[i] = max;
					a[j] = min;
				}

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "   ");
		}
	}

}
