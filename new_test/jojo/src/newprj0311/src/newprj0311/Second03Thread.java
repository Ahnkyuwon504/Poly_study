package newprj0311;

public class Second03Thread {
	public static void main(String[] args) {
		Thread thread1 = new MultiThreadTest("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest("[ Thread " + 2 + " ]");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}

class MultiThreadTest extends Thread {
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start");
		
	}
}
