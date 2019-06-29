package by.htp.katokoleg.cycles.main;

//33. Найдите наибольшую цифру данного натурального числа.

public class Task33 {

	public static void main(String[] args) {

		int x;
		int max = 0;
		int k;
		
		x =(int) (Math.random()*1000000);
		
		System.out.println(x);

		for (int i = x; i > 0; i = i / 10) {
			k = i % 10;
			if (k > max) {
				max = k;
			}
		}
		System.out.println("Maximum number: " + max);
	}

}
