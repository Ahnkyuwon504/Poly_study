package study04121;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #2. 리포팅연습(영수증 출력 등) 2번 / 2125341020안규원
		// 구구단 인쇄 2
		////////////////////////////////////////////////////////////////////////

		for (int k20_i = 1; k20_i < 4; k20_i++) { // i는 1부터 3까지 실시된다.
			// for문이 3번 실시되는 것은 같으나, 좀 전 문제와 다른 것은
			// i가 1, 2, 3일 때 실시되는 것이다.
			System.out.printf("************\t************\t************\n"); // 구구단 윗줄 출력
			System.out.printf(" 구구단 %d단   \t 구구단 %d단 \t 구구단 %d단 \n",
					// 동일하게, 구구단을 한 줄에 3개 출력한다.
					// 별의 개수를 동일하게 맞추는 것도 사소하지만 중요하다.
					k20_i, k20_i + 3, k20_i + 6);
			// i가 1일 때 1단, 4단, 7단을 출력하기 위해서 i, i+3, i+6으로 올라간다.
			// i가 2일 때는 2단, 5단, 8단이 출력된다.
			// i가 3일 때는 3단, 6단, 9단이 출력된다.
			System.out.printf("************\t************\t************\n"); // 구구단 아랫줄 출력
			for (int k20_j = 1; k20_j < 10; k20_j++) { // 각 i마다 i*1, i*2,,,,9까지 실시되며
				// 구구단을 출력해준다.
				// 이 때 사용되는 for문 구성은 앞전과 동일함.
				System.out.printf(" %d * %d = %2d\t %d * %d = %2d \t %d * %d = %2d\n",
				// 한 줄당 출력되는 텍스트. 동일하게 줄당 세 개의 구구단이 출력된다.
				// 마찬가지로, 곱셈 결과가 한 자리일 수도 있고 두 자리일 수도 있기 때문에
				// 우측 정렬하여 출력
						k20_i, k20_j, k20_i * k20_j, k20_i + 3, k20_j,
				// k20_가 1일 때는 1*1 = 1, 4*1 = 4, 7*1 = 7이 출력된다.
						(k20_i + 3) * k20_j, k20_i + 6, k20_j, (k20_i + 6) * k20_j);
			}
		}
	}
}
