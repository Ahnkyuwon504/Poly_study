package project1;

public class Test1 {
	int a;                  // �ʱ갪�� �ִ°� ���ٸ� �ǹ̰��ִٱ⺸��, ���� ����. �ٸ��Ծ����ʵ���.?
	
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
