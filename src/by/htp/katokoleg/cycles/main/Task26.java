package by.htp.katokoleg.cycles.main;

// 26. Вывести на экран соответствий между символами и их численными обозначениями в
//памяти компьютера (Таблицу ASCII).

public class Task26 {

	public static void main(String[] args) {
		
		char ch = 32;
		int i = 32;
		
		while (ch < 128) {
			System.out.print(i + "  ");
			System.out.println(ch);
			ch++;
			i++;
		}

	}

}
