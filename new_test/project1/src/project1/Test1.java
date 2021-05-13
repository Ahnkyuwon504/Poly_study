package project1;

public class Test1 {
	int a;                  // 초깃값을 넣는건 별다른 의미가있다기보단, 설명 정도. 다르게쓰지않도록.?
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String printPrice (int a) {
		if (a==1) {
			return ("1,000Won.");
		} else if (a==2) {
			return ("2,000Won.");
		} else if (a==3) {
			return ("4,000Won.");
		} else {
			return ("5,000Won.");
		}
	}
	
	public void printMenu() {
		System.out.println("Price\n1. Apple\n2. Strawberry\n3. Grape\n4. Watermelon");
	}
}
