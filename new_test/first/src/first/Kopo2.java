package first;

public class Kopo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(30, "Kim");
		
		
		System.out.println(test.getA());    // test.getA() 에서 A=0이 return되고, 이를 출력
		test.setA(10);                      // test.setA(10) 은 A를 10으로 set
		System.out.println(test.getA());    // test.getA()에서 A=10이 return되고, 이를 출력
		
		


	}

}
