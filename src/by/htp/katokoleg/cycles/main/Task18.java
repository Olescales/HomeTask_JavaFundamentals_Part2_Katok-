package by.htp.katokoleg.cycles.main;

//18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//больше или равен заданному е. Общий член ряда имеет вид:

public class Task18 {

	public static void main(String[] args) {
		
		double e;
		double x;
		double result = 0;
		int n = 1;
		
		e = Math.random();
		System.out.println(e);
		System.out.println("-----------------");
		
		x = (Math.pow(-1, n-1)) / n;
		
		while ( x >= e) {
			result += x;
			n++;
			x = Math.abs((Math.pow((-1), n-1)) / n);
		}
		System.out.println(result);
	}

}
