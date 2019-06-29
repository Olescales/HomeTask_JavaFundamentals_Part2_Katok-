package by.htp.katokoleg.array.main;

import java.util.Random;

//6. ƒана последовательность чисел а1 ,а2 ,..., ап. ”казать наименьшую длину числовой оси, содержащую все эти числа.

public class Task6 {

	public static void main(String[] args) {

		int n;
		int min = 0;
		int max = 0;
		int delta;
		
		Random rd = new Random();

		n = rd.nextInt(7) + 3;

		System.out.println("Number of elements in array : " + n);
		System.out.println("================================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { // записываем в массив
			a[i] = rd.nextInt(100) - 50;
			System.out.print(a[i] + "   ");
		}

		// int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.print("\n " + min);
		System.out.print("\n " + max);
		
		delta = max - min;
		
		System.out.println("\nThe smallest length is: " + delta);
	}

}
