package by.htp.katokoleg.cycles.main;

/*36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное
 *  число, которое делится на их произведение. Найти эти числа.*/

public class Task36 {

	public static void main(String[] args) {

		int fourdigital;
		int divider;

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				divider = j * i;
				fourdigital = i * 100 + j;
				if (fourdigital % divider == 0) {
					System.out.println("First number: " + i);
					System.out.println("Second number:" + j);
					System.out.println("---------------------------");

				}
			}
		}
	}
}
