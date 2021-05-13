package newprj0401;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #2. 사칙연산2번 / 2021.04.01. / 2125341020 안규원
		// 누적하기, 합구하기
		
		int k20_sum; // k20_sum이라는 int형 변수를 정의하였음.
		
		k20_sum = 0; // k20_sum이라는 int형 변수에 0의 값을 저장
		
		for (int i = 1; i < 101; i++) {	// for문은 i가 1부터 100까지 100번 실시됨.
			k20_sum = k20_sum + i;	// 각 for문마다, k20_sum 변수의 값이 i씩 상승됨.
		}
		System.out.printf("#2 : %d\n", k20_sum); // k20_sum변수를 화면에 출력
		System.out.printf("#2-2 : %d\n", k20_sum/100);	// k20_sum변수를 100으로 나눈 값을 화면에 출력
		
		int[] k20_v = {1, 2, 3, 4, 5}; // k20_v라는 integer array를 정의하였음. 1부터 5까지 값이 저장됨.
		int k20_vSum; // k20_vSum이라는 integer 변수를 정의하였음.
		
		k20_vSum = 0; // k20_vSum이라는 변수에 0의 값을 저장
		
		for (int i = 0; i < 5; i++) {	// for문은 i가 0부터 4까지 5번 실시됨. array의 첫 번째 공간이
										// 0이므로 0에서 시작하는것임.
			k20_vSum = k20_vSum + k20_v[i]; // 각 for문마다, k20_vSum 변수의 값이 i번째에 해당하는
		}									// k20_v array의 값만큼 더해짐. 1부터 5까지 더해질것임.
		
		System.out.printf("#2-3 : %d\n", k20_vSum); // k20_vSum변수를 화면에 출력
	}
}
