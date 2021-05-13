package newprj0311;

public class P6Timer3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6Timer3 thread = new P6Timer3();
		thread.start();

	}
	
	public void run() {
		int cnt = 0;
		while (true) {
			if ((cnt>0) && (cnt%10==0)) {
				System.out.println();
			} 
			try {
				Thread.sleep(100);
				System.out.print("*");
				cnt++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
