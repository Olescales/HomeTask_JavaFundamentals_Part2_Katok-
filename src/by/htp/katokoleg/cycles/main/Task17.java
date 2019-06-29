package by.htp.katokoleg.cycles.main;

//17. ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {
		
		double a;
		int n;
		double result;
		
		a = (Math.random() * 10);
		n = (int)(Math.random() * 10);
		System.out.println(a);
		System.out.println(n);
		System.out.println("------------------------------");


		result = a;
				
		for (int i = 1; i <= (n-1); i++) {
			result *= (a + i);
			System.out.println(i);
			System.out.println(result);
		}
	}

}
