package newprj0311;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Second01Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);

		System.out.println(dateAndTime);
		System.out.println("start");
		
		
        int count = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.print("*");
				count++;
				if(count%10==0) {
					System.out.println();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
