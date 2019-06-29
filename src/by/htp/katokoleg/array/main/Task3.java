package by.htp.katokoleg.array.main;

import java.util.Random;

/*3. ƒана последовательность целых чисел а1 а2,..., аn . ¬ы€снить, какое число встречаетс€
раньше - положительное или отрицательное.*/

public class Task3 {

	public static void main(String[] args) {

		int n;
		int randomNumber;
		int number;

		Random rd = new Random();

		n = rd.nextInt(10);

		System.out.println("Number of elements in array - " + n);
		System.out.println("==============================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { // записываем в массив
			randomNumber = rd.nextInt(100) - 50;
			a[i] = randomNumber;
			System.out.print(a[i] + "   ");
		}
		
		for ( int j = 0; j <a.length; j++ ) {
			if (a[j] > 0) {
				System.out.println("\nFirst element is positive");
				break;
			}
			else if (a[j] == 0) {
				System.out.println("\nThis element is 0");
			}
			else {
				System.out.println("\nFirst element is negative");
				break;
			}
		}
	}

}
