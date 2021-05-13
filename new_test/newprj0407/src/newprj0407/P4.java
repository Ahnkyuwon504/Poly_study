package newprj0407;

public class P4 {
	public static void main(String[] ar) throws Exception{
		Money money = new Money(); //�� ��ü�� ������ 3������ ���
		MyThread thread1 = new MyThread("�� ��",money);
		MyThread thread2 = new MyThread("�� ��",money);
		
		thread1.start();
		thread2.start();
	}
}

class Money {
	
	public void open(String name){
		System.out.println(name+" 500�� ����");
	}
	
	public void close(String name){
		System.out.println(name+" 1000�� ����");
	}
	
	public void nothing(String name){
		System.out.println(name+" ���� ����.");
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
