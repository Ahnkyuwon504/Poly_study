package first;

public class Kopo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(30, "Kim");
		
		
		System.out.println(test.getA());    // test.getA() ���� A=0�� return�ǰ�, �̸� ���
		test.setA(10);                      // test.setA(10) �� A�� 10���� set
		System.out.println(test.getA());    // test.getA()���� A=10�� return�ǰ�, �̸� ���
		
		


	}

}
