package by.htp.katokoleg.array2.main;

import java.util.Random;

/*3. Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется
переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый
- на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать
алгоритм сортировки выбором.*/

public class Task3 {

	public static void main(String[] args) {

		
		
		Random rd = new Random();

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) { // записываем в массив
			a[i] = rd.nextInt(10);
			System.out.print(a[i] + "   ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for (int i = 0; i < 10; i++) { // сортируем массив
			int max = 0;
			for (int j = i; j < 10; j++) {
				if (a[j] > max) {
					max = a[j];
				}
			}
			for (int k = i; k < 10; k++) {
				if (a[k] == max) {
					
					a[k] = a[i];
					a[i] = max;
					break;
				}
			} 	
				System.out.print(a[i] + "   ");
			}
		

	}

}
