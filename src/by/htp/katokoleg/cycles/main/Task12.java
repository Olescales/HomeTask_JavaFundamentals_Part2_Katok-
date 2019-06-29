package by.htp.katokoleg.cycles.main;

//12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте
//программу нахождения произведения первых 10 членов этой последовательности.

public class Task12 {

	public static void main(String[] args) {
		
		int i;
		int an = 1;
		int sum = 0;
		
		for (i = 1; i < 11; i++) {
			sum += an;
			System.out.print(i + " ");
			System.out.println(sum);
			an += 6; 
		}
		

	}

}
