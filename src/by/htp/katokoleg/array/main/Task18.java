package by.htp.katokoleg.array.main;

import java.util.Random;

/*18*. Ђ—уперзамокї. —екретный замок дл€ сейфа состоит из 10 расположенных в рад €чеек, в
которые надо вставить игральные кубики. Ќо дверь открываетс€ только в том случае, когда
в любых трех соседних €чейках сумма точек на передних гран€х кубиков равна 10.
(»гральный кубик имеет на каждой грани от 1 до 6 точек). Ќапишите программу, котора€
разгадывает код замка при условии, что два кубика уже вставлены в €чейки.*/

public class Task18 {

	public static void main(String[] args) {

		Random rd = new Random();

		System.out.println("Number of elements in array : " + 10);
		System.out.println("================================");

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) { // записываем в массив
			a[i] = 0;
		}
		int x = rd.nextInt(5) + 5; // генерируем номера 2 случайных €чеек в массиве, куда будут записаны случайные
									// числа
		int y = rd.nextInt(x - 2);

		a[x] = rd.nextInt(6)+1; // записываем случайные числа от 0 до 6
		a[y] = rd.nextInt(6)+1;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		for (int i = 0; i < a.length; i++) { // выводим массив
			System.out.print(a[i] + "   ");
		}

		if (y>=1 & x<=8) {
			for (int i = y; i <= x ; i++) {
				for (int j = i; j <= i + 1; j++) {
					if (a[j] + a[j + 1] + a[j - 1] == 10) {
						break;
					} else {
						if (a[j] == 0 & a[j + 1] == 0 & a[j - 1] == 0) {
							a[j] = 3;
							a[j + 1] = 3;
							a[j - 1] = 10 - a[j] - a[j + 1];
							break;
						} else if (a[j] != 0 & a[j + 1] == 0 & a[j - 1] == 0) {
							a[j + 1] = 3;
							a[j - 1] = 10 - a[j] - a[j + 1];
							break;
						} else if (a[j + 1] != 0 & a[j] == 0 & a[j - 1] == 0) {
							a[j] = 3;
							a[j - 1] = 10 - a[j] - a[j + 1];
							break;
						} else if (a[j - 1] != 0 & a[j] == 0 & a[j + 1] == 0) {
							a[j] = 3;
							a[j + 1] = 10 - a[j] - a[j - 1];
							break;
						} else if (a[j] != 0 & a[j + 1] != 0 & a[j - 1] == 0) {
							a[j - 1] = 10 - a[j] - a[j + 1];
							break;
						}
						else if (a[j] != 0 & a[j + 1] == 0 & a[j - 1] != 0) {
							a[j + 1] = 10 - a[j] - a[j - 1];
							break;
						}
						else if (a[j] == 0 & a[j + 1] != 0 & a[j - 1] != 0) {
							a[j] = 10 - a[j + 1] - a[j - 1];
							break;
						}
					}
				}
			}			
		}
		
		
		
		
		
		System.out.println("-------------------------------------------");
		for (int i = 0; i < a.length; i++) { // выводим массив
			System.out.print(a[i] + "   ");
		}
	}

}
