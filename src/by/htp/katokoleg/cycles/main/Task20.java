package by.htp.katokoleg.cycles.main;

//20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//больше или равен заданному е. Общий член ряда имеет вид:

public class Task20 {

	public static void main(String[] args) {
		
		double e;
		double x;
		double result = 0;
		double n = 1;
		
		e = Math.random()/1000;
		System.out.println(e);
		System.out.println("-----------------");
		
		x = ( 1 / ((3 * n - 2) * (3 * n + 1)));
		while ( x >= e) {
			result += x;
			n++;
			x = 1 / ((3 * n - 2) * (3 * n + 1));
			System.out.println(result);
		}
	}

}
