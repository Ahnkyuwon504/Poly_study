package newprj0406;

import java.util.Calendar;
import java.util.Scanner;

public class k20_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = inputYear();
		int month = inputmonth();
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		cal.set(year, month-1, 1);
		
		int end = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i <= end; i++) { // Actual date
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if ((dayOfWeek % 7) == 0) {
				System.out.println();
			}
			dayOfWeek++;				// for blank!
		}
	}
	
	
	public static int inputYear() {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("year : ");	
		year = sc.nextInt();
		return year;
	}
	
	public static int inputmonth() {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("month : ");
		month = sc.nextInt();
		return month;
	}
}
