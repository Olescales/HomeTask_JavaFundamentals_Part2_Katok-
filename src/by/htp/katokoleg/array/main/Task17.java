package by.htp.katokoleg.array.main;

import java.util.Random;

/*17. Дана последовательность целых чисел n aaa, , , 1 2  . Образовать новую
последовательность, выбросив из исходной те члены, которые равны ) , , , min( 1 2 n a a a  .*/

public class Task17 {

	public static void main(String[] args) {
		
		int n;
		int min = 20;

		Random rd = new Random();

		n = rd.nextInt(15) + 7;

		System.out.println("Number of elements in array : " + n);
		System.out.println("================================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { // записываем в массив
			a[i] = (int)(rd.nextDouble() * 10 - 5);
			System.out.print(a[i] + "   ");
		}

		for (int i = 0; i < n; i++) { // получаем мин значение в массиве
			if (a[i] < min ) {
				min = a[i];
			}
		}
		
		int counter = 0;
		for (int i = 0; i < n; i++) { // подсчитываем на сколько надо уменьшить текущий массив, чтобы получить новый
			if (a[i] == min ) {
				counter++;
			}
		}
		int m = n - counter;
		int[] b = new int[m]; //  создаем новый массив и закидываем туда значения
		for (int i = 0, j = 0; i < n; i++) { 
			if (a[i] != min ) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for (int j = 0; j < m; j++) { // выводим массив в консоль
			System.out.print(b[j] + "; ");
		}
	}

}
