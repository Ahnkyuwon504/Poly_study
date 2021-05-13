package newprj0402;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #4. 선택,반복,배열 4번 / 2021.04.01. / 2125341020 안규원
		// for문
		///////////////////////////////////////////////////
		
		int k20_sum; // 변수 정의
		
		k20_sum = 0; // sum에 0값 부여
		for (int k20_index = 0; k20_index < 10; k20_index++) { // for문은 i가 0부터 9까지 9번 실시될것임
			k20_sum = k20_sum + k20_index; // 각 for문마다, sum에 i값 더해줌. 0부터 9까지 더해주는 것이므로 45 출력될것임.
		}
		System.out.printf("sum : %d\n", k20_sum); // sum 출력
		
		for (int k20_index = 1; k20_index < 10; k20_index++) { // for문은 i가 1부터 9까지 9번 실시
			System.out.printf("*********************************\n", k20_index); // 표 윗부분 출력
			System.out.printf("           구구단 %d단\n", k20_index); // 몇 단인지 알려줌
			System.out.printf("*********************************\n", k20_index); // 표 아랫부분 출력
			for (int k20_j = 1; k20_j < 10; k20_j++) { // 실제 구구단이 출력되는 for문
				System.out.printf("         %d * %d = %d\n", k20_index, k20_j, k20_index*k20_j); // 구구단 출력
			}
			
		}

	}

}
