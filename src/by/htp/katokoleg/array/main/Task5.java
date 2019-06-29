package by.htp.katokoleg.array.main;

import java.util.Random;

/*5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.*/

public class Task5 {

	public static void main(String[] args) {

		int n;
		int number;
		int number1;

		Random rd = new Random();

		n = rd.nextInt(5) + 5;

		int[] array = new int[n];
		int[] array1 = new int[10];

		System.out.println("Array's length " + n);
		System.out.println("========================");

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(50);
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			number = array[i];
			number1 = number;
			if (number % 2 == 0 & number != 0) {

				array1[counter] = number1;
				System.out.print("\n" + array1[counter]);
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("There is no need numbers");
		}
	}

}
