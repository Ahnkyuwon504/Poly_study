package newprj0407;

public class k20_synchro {

	public static void main(String args[]) {
		Runnable r = new A();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class Account {
	int balance = 1000;
	
	public synchronized void withdraw(int money) { // synchronized 키워드를 붙이기만 하면 간단히 동기화가 된다.
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			balance -= money;
		}
	} // withdraw
}

class A implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.balance > 0) {
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.balance);
		}
	} 
}
