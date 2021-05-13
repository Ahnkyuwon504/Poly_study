package newprj0401;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #3. 사칙연산3번 / 2021.04.01. / 2125341020 안규원
		// 정수형 연산과 줄넘김
		
		int k20_ii; // k20_ii 이라는 변수를 정의해줌.
		
		k20_ii = 1000/3;	// k20_ii 변수에 1000/3의 값을 저장해줌. integer이기 때문에 333이 저장될것임.
		System.out.printf("#3-1 : %d\n" , k20_ii);	// k20_ii 변수의 값 화면에 출력
		
		k20_ii = 1000%3;	// k20_ii 변수에 1000%3의 값을 저장해줌. 1000을 3으로 나눈 나머지이므로 1이 저장됨.
		System.out.printf("#3-2 : %d\n" , k20_ii);	// k20_ii 변수의 값 출력
		
		for (int i = 0; i < 20; i++) {	// for문은 i가 0부터 19까지 20번 실시될것임.
			System.out.printf("#3-3 : %2d  " , i);	// 각 for문마다 i가 화면에 출력됨.
			
			if (((i+1)%5) == 0) {	// 이때 (i+1)을 5로 나눈 나머지가 0일때마다 어떤 특정한 명령이 실시됨.
									// i+1 인 이유는, for문의 i가 0부터 시작하기 때문임.
				System.out.printf("\n");	// (i+1)을 5로 나눈 나머지가 0일때마다 줄바꿈이 실시됨.
			}
		}
	}
}
