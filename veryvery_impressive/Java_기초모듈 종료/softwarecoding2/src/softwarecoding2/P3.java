package softwarecoding2;

public class P3 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 3. 변수 예제3
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; // 변수 선언 및 초기화
		int y = 20; // 변수 선언 및 초기화
		int tmp = 0; // 변수 선언 및 초기화
		// x값, y값 각각 콘솔 출력
		System.out.println("x : " + x + "  y : " + y);
		
		tmp = x; // 변수 값에 다른 값 저장
		x = y; // 변수 값에 다른 값 저장
		y = tmp; // 변수 값에 다른 값 저장
		// tmp값은 10, x값은 20, y 값은 바뀐 tmp 값이므로 10이 될것임
		System.out.println("x : " + x + "  y : " + y);
	}
}
