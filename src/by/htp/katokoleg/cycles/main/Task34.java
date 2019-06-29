package by.htp.katokoleg.cycles.main;

//34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {
		
		int residue;
		int iterator = 0;
		
		for (int i = 1000; i <10000; i++) {
			int sum = 0;
			for (int j = i; j > 0; j = j / 10) {
				residue = j % 10;
				sum += residue;
			}
			if (sum == 15) {
				System.out.println(i);
				iterator++;
			}
		}
		System.out.println(iterator);

	}

}
