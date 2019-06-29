package by.htp.katokoleg.cycles.main;

/*37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
 *  первое число получили путем написания сначала числа А, затем В. Для получения второго
 *   числа сначала записали число В, затем А. Найти числа А и В если известно , что первое
 *    четырехзначное число нацело делится на 99, а второе на 49.*/

public class Task37 {

	public static void main(String[] args) {
		
		int fourdigital;
		int fourdigitalConversely;

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				fourdigital = i * 100 + j;
				fourdigitalConversely = j * 100 + i;
				if (fourdigital % 99 == 0 & fourdigitalConversely % 49 == 0) {
					System.out.println("First number: " + i);
					System.out.println("Second number:" + j);
					System.out.println("---------------------------");

				}
			}
		}

	}

}
