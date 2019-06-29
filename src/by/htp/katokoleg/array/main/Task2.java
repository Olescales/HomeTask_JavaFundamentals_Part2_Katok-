package by.htp.katokoleg.array.main;

import java.util.Random;

//2. ¬ целочисленной последовательности есть нулевые элементы. —оздать массив из номеров этих элементов.

public class Task2 {

	public static void main(String[] args) {

		int n;
		int randomNumber;
		int number;

		Random rd = new Random();

		n = rd.nextInt(100);

		System.out.println("Number of elements in array - " + n);
		System.out.println("==============================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { //записываем в массив
			randomNumber = rd.nextInt(5);
			a[i] = randomNumber;
			System.out.print(a[i] + "   ");
		}

		int[] b = new int[20];
		int w = 0;

		for (int j = 0; j < n; j++) { // читаем из массива
			number = a[j];
			if (number == 0 ) {
				b[w] = j;
				System.out.print("\nArray " + w + " " + j);
				w = w + 1;
			}
		}
	}
}