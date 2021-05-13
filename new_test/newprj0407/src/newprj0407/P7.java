package newprj0407;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P7 implements Runnable {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date time = new Date();
			String dateAndTime = format.format(time);
			System.out.println(dateAndTime);

			int N = sc.nextInt();
			Thread.sleep((N) * 1000);
			time = new Date();
			dateAndTime = format.format(time);
			cal.add(Calendar.SECOND, N);
			if (dateAndTime != format.format(cal.getTime())) {
				System.out.println("Time is already over " + dateAndTime);

				int N2 = sc.nextInt();
				Thread.sleep((N2) * 1000);
				time = new Date();
				dateAndTime = format.format(time);
				cal.add(Calendar.SECOND, N);
				System.out.println("Time is over " + dateAndTime);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}