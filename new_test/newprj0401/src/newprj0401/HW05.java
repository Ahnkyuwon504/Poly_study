package newprj0401;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #5. 사칙연산5번 / 2021.04.01. / 2125341020 안규원
		// 소수점 자리의 반올림 버림 처리
		
		int k20_MyVal;	// k20_MyVal 변수 정의
		k20_MyVal = 14/5;	// k20_MyVal 변수의 값을 14/5 지정. 2가 될것임.
		
		System.out.printf("#5-1 : %d\n" , k20_MyVal);	// k20_MyVal 출력
		
		double k20_MyValF;	// 이번엔 k20_MyVal 변수를 double형태로 지정하여 정의하였음.
		
		k20_MyValF = 14/5;	// k20_myValF의 값을 지정하였음.
		System.out.printf("#5-2 : %f\n" , k20_MyValF);	// double이지만 2.0 형태로 출력됨
		k20_MyValF = 14.0/5;							// 14.0으로 double형태로 연산을 실행하여 값 부여
		System.out.printf("#5-3 : %f\n" , k20_MyValF);	// int사이의 연산이 아니므로 2.8 출력될것임
		k20_MyValF = (14.0)/5+0.5;						// 나눗셈이 먼저 되고 0.5가 합해져 3.3000 될것임
		System.out.printf("#5-4 : %f\n" , k20_MyValF);	// 3.300000이 출력
		k20_MyValF = (int)((14.0)/5+0.5);				// 위와 같은 계산의 결과이지만, int형으로 변형
		System.out.printf("#5-5 : %f\n" , k20_MyValF);	// 따라서 3.3은 3.000000으로 바뀌어 출력됨.
	}
}
