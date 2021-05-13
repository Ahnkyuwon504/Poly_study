package newprj0407;

public class P4 {
	public static void main(String[] ar) throws Exception{
		Money money = new Money(); //이 객체를 쓰레드 3개에서 사용
		MyThread thread1 = new MyThread("내 돈",money);
		MyThread thread2 = new MyThread("니 돈",money);
		
		thread1.start();
		thread2.start();
	}
}

class Money {
	
	public void open(String name){
		System.out.println(name+" 500원 감소");
	}
	
	public void close(String name){
		System.out.println(name+" 1000원 감소");
	}
	
	public void nothing(String name){
		System.out.println(name+" 이제 없어.");
	}
	
	public synchronized void useToilet(String name){
		open(name);
		close(name);
		nothing(name);
	}
}

class MyThread extends Thread{
	String name;
	Money key = new Money();
	
	public MyThread(String name,Money key){
		this.name=name;
		this.key=key;
	}
	
	public void run(){
		key.useToilet(name);
	}
}
