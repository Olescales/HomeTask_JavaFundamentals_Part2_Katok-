package by.htp.katokoleg.cycles.main;

//12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 ���������
//��������� ���������� ������������ ������ 10 ������ ���� ������������������.

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
