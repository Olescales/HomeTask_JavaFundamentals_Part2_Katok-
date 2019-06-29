package by.htp.katokoleg.cycles.main;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//больше или равен заданному е. Общий член ряда имеет вид:

public class Task19 {

	public static void main(String[] args) {
		
		double e;
		double x;
		double result = 0;
		int n = 1;
		
		e = Math.random()/100;
		System.out.println(e);
		System.out.println("-----------------");
		
		x = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
		
		while ( x >= e) {
			result += x;
			n++;
			x = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			System.out.println(result);
		}

	}

}
