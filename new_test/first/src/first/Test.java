package first;

public class Test {
	int a;                  // 초깃값을 넣는건 별다른 의미가있다기보단, 설명 정도. 다르게쓰지않도록.?
	String b;
	
	public Test(int a, String b) {         // 생성자
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {          
		this.a = a;
	}
			

}
