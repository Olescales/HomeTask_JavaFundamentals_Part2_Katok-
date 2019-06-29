package by.htp.katokoleg.array.main;

import java.util.Random;

/*8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
отрицательных, положительных и нулевых элементов.*/

public class Task8 {

	public static void main(String[] args) {
		
		int N;
		int counterPos = 0;
		int counterNeg = 0;
		int counterZero = 0;
		
		Random rd = new Random();

		N = rd.nextInt(20);
		
		System.out.println("Number of elements in array : " + N);
		System.out.println("================================");

		int[] a = new int[N];
		for (int i = 0; i < N; i++) { // записываем в массив
			a[i] = rd.nextInt(100) - 50;
			System.out.print(a[i] + "   ");
		}
		
		for (int i = 0; i<a.length; i++) {
			if (a[i] > 0) {
				counterPos++;
			}
			else if (a[i] == 0) {
				counterZero++;
			}
			else if (a[i] < 0) {
				counterNeg++;
			}
			
			
			System.out.print("\n" + a[i]);
		}
		System.out.println("Number of positive elements: " + counterPos);
		System.out.println("Number of zero elements: " + counterZero);
		System.out.println("Number of negative elements: " + counterNeg);

	}

}
