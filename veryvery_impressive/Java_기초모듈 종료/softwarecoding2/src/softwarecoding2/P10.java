package softwarecoding2;

public class P10 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 10. Casting Ex1
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 85.4; // 변수 선언 및 초기화
		int score = (int)d; // 변수를 통해 형번환. 초기화
		
		System.out.println("score=" + score);
		// 85.4를 형변환 했으므로 85 출력
		System.out.println("d=" + d);
		// 85.4 그대로 출력
	}
}
