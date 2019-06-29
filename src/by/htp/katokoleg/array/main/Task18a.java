package by.htp.katokoleg.array.main;

import java.util.Random;

public class Task18a {

	public static void main(String[] args) {

		Random rd = new Random();

		System.out.println("Number of elements in array : " + 10);
		System.out.println("================================");

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) { // записываем в массив
			a[i] = 0;
		}
		int x = rd.nextInt(5) + 5; // генерируем номера 2 случайных ячеек в массиве, куда будут записаны случайные
									// числа
		int y = rd.nextInt(x - 2);

		a[x] = rd.nextInt(7); // записываем случайные числа от 0 до 6
		a[y] = rd.nextInt(7);

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		for (int i = 0; i < a.length; i++) { // выводим массив
			System.out.print(a[i] + "   ");
		}

		for (int i = 1; i < a.length - 2; i++) {
			for (int j = i - 1; j < i + 1; j++) {
				if (a[j] + a[j + 1] + a[j + 2] == 10) {
					break;
				} else {
					if (a[j] == 0 & a[j + 1] == 0 & a[j + 2] == 0) {
						a[j] = 3;
						a[j + 1] = 3;
						a[j + 2] = 10 - a[j] - a[j + 1];
						break;
					} else if (a[j] != 0 & a[j + 1] == 0 & a[j + 2] == 0) {
						a[j + 1] = 3;
						a[j + 2] = 10 - a[j] - a[j + 1];
						break;
					} else if (a[j + 1] != 0 & a[j] == 0 & a[j + 2] == 0) {
						a[j] = 3;
						a[j + 2] = 10 - a[j] - a[j + 1];
						break;
					} else if (a[j + 2] != 0 & a[j] == 0 & a[j + 1] == 0) {
						a[j] = 3;
						a[j + 1] = 10 - a[j] - a[j + 2];
						break;
					} else if (a[j] != 0 & a[j + 1] != 0 & a[j + 2] == 0) {
						a[j + 2] = 10 - a[j] - a[j + 1];
						break;
					}
					else if (a[j] != 0 & a[j + 1] == 0 & a[j + 2] != 0) {
						a[j + 1] = 10 - a[j] - a[j + 2];
						break;
					}
					else if (a[j] == 0 & a[j + 1] != 0 & a[j + 2] != 0) {
						a[j] = 10 - a[j + 1] - a[j + 2];
						break;
					}
					
				}
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		for (int i = 0; i < a.length; i++) { // выводим массив
			System.out.print(a[i] + "   ");
		}

	}

}
