package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

//30. Написать программу, переводящую римские цифры в арабские.

public class Task30 {

	public static void main(String[] args) {
		
		String romanNumber;
		int arabian = 0;
		char intermediate;
		
		Scanner sc = new Scanner(System.in);
		
		romanNumber = sc.next().toUpperCase();
		
		for (int i = 0; i < romanNumber.length(); i++ ) {
			
			intermediate = romanNumber.charAt(i);
			System.out.println(intermediate);
			if (intermediate == 'I') {
				arabian += 1; 
			}
			else if (intermediate == 'V') {
				if (intermediate == 'V' & romanNumber.charAt(i-1) == 'I') {
					arabian += -2;
				}
				arabian += 5;
			}
			else if (intermediate == 'X') {
				if (intermediate == 'X' & romanNumber.charAt(i-1) == 'I') {
					arabian += -2;
				}
				arabian += 10;
			}
			else if (intermediate == 'L') {
				if (intermediate == 'L' & romanNumber.charAt(i-1) == 'X') {
					arabian += -20;
				}
				arabian += 50;
			}
			else if (intermediate == 'C') {
				if (intermediate == 'C' & romanNumber.charAt(i-1) == 'X') {
					arabian += -20;
				}
				arabian += 100;
			}
			else if (intermediate == 'D') {
				arabian += 500;
			}
			else if (intermediate == 'M') {
				arabian += 1000;
			}
			System.out.println("Roman number " + romanNumber + " correspond arabian number" + arabian);
		}
			
	}

}
