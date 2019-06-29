package by.htp.katokoleg.cycles.main;

//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {

	public static void main(String[] args) {
		
		double sum = 0;
		double decimal;
		int n;
		
		n = (int)(Math.random() * 100);
		System.out.println(n);
		
		
		for (int i = 1; i <= n; i++) {
			decimal = (double) 1/i;
			sum += decimal; 
			System.out.println(sum);
		}

	}

}
