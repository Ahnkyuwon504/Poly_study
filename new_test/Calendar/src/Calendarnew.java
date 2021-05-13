


import java.util.Calendar;
import java.util.Scanner;

public class Calendarnew {

	public static void main(String[] args, String p) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Year : ");
		int year = sc.nextInt();  // year input
		System.out.println("Month : ");
		int month = sc.nextInt();  // month input
		
		cal.set(Calendar.YEAR, year); // �Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, month); // �Է¹��� ���� ����
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("[" + year + "�� " + month + "�� ]");
		System.out.println("�� �� ȭ �� �� �� ��");
		
		cal.set(year, month-1,1);
		
		int end = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.println(" ");
				}
			}
			if(i<10) {
				System.out.println(" ");
			}
			System.out.println(" " + i + " ");
			if(dayOfWeek%7==0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		

	}

}