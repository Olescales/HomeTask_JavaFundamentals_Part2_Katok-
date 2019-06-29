package by.htp.katokoleg.cycles.main;

//29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {

	public static void main(String[] args) {

		int a;
		int b;
		int residueA;
		int residueB;
		
		a =(int) (Math.random() * 1000000000 );
		b =(int) (Math.random() * 1000000000 );
		
		System.out.println("Number a = " + a);
		System.out.println("Number b = " + b);
		
		for (int i = a; i > 0; i = i / 10) {
			 residueA = i % 10;
			for (int j = b; j > 0; j = j / 10) {
				residueB = j % 10;
				if ( residueA == residueB) {
					System.out.println(residueA + " are in both numbers!" );
					break;
				}
			}
		}

	}

}
