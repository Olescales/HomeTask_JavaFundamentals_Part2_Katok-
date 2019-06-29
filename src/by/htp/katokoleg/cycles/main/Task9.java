package by.htp.katokoleg.cycles.main;

//9. Найти сумму квадратов первых ста чисел.

public class Task9 {

	public static void main(String[] args) {
		
		int mult;
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			mult = i;
			mult *= mult;
			sum += mult;
			System.out.print(i);
			System.out.println("    " + sum);
		}
		
	}

}
