package by.htp.katokoleg.cycles.main;

//13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.

public class Task13 {

	public static void main(String[] args) {

		double a = -5;
		double b = 5;
		double h = 0.5;
		double y;

		for (double i = a; i <= b; i = i + h) {
			y = 5 - ((i * i) / 2);
			System.out.print(i + "  ");
			System.out.println(y);
		}

	}

}
