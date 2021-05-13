package newprj0311;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6Timer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(time);                            //System.out.println(dateAndTime);
		System.out.println("Input a time in second.");
		int N = sc.nextInt();
		
        int count = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				count++;
				if(count==N) {
					System.out.println(new Date());
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
