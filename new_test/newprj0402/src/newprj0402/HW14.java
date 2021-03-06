package newprj0402;

public class HW14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #14. 선택,반복,배열 14번 / 2021.04.01. / 2125341020 안규원
		// 비정형비교 2,3
		///////////////////////////////////////////////////
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for문은 1월부터 12월까지 실시
			System.out.printf(" %d월 => ", k20_i); // 월별로 월을 알려주는 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) { // for문은 1일부터 최대 31일까지 실시
				System.out.printf("%d.", k20_j); // 일을 알려주는 출력
				
				if (k20_i==1 | k20_i==3 | k20_i==5 | k20_i==7 | // 1,3,5,7월과
						k20_i==8 | k20_i==10 | k20_i==12) { // 8,10,12월에 대한 조건
					if(k20_j==30) { // 말일에 점 들어가는게 싫어서 추가하였음.
						System.out.printf("%d", k20_j+1); // k20_j가 30일때 31일 출력하고 끝.
						break; // break
					}
				}
				
				if (k20_i==4 | k20_i==6 | k20_i==9 | k20_i==11) { // 4, 6, 9, 11월에 대해
					if(k20_j==29) { // 말일에 점 들어가는게 싫어서 추가하였음.
						System.out.printf("%d", k20_j+1); // k20_j가 29일때 30일 출려갛고 끝.
						break; // break
					}
				}
				
				if (k20_i==2) { // 2월은 28일까지이므로
					if(k20_j==27) { // 말일 28일에 점 들어가는게 싫어서
						System.out.printf("%d", k20_j+1); // 28일 출력하고 끝
						break; // 탈출
					}
				}
			}
			System.out.printf("\n"); // 월별로 끝났으면 줄바꿔주기.
		}
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // 좀더 세련되게 하려고 함. 똑같이 월로 진행한다.
			System.out.printf(" %d월 => ", k20_i); // 월 출력해줌.
			for (int k20_j = 1; k20_j < 32; k20_j++) { // 모든 월은 31일까지가 최대이므로, 이같이 설정
				System.out.printf("%d.", k20_j); // 밑의 조건을 만족하지 않으면 31일까지 모두 출력될 것이다.
				if (k20_j == 30) { // 말일에 점 들어가는게 보기 싫어서 만들어줌.
					System.out.printf("%d", k20_j+1); // j=30일때 점 없이 31 출력하고 break
					break; // break
				}
				if ((k20_i == 4 | k20_i == 6 | k20_i == 9 | k20_i == 11) && (k20_j == 29)) { // 30일까지 있는 월
					System.out.printf("%d", k20_j+1); // j=29일때 점 없이 30 출력하고 break
					break; // 30일까지 있는 월
				}
				if (k20_i == 2 && k20_j == 27) { // 2월은 28일까지이므로
					System.out.printf("%d", k20_j+1); // j가 27일때 점 없이 27 출력하고 break
					break; // 28일까지 있는 2월
				}
			}
			System.out.printf("\n"); // 공백출력
									 // 단 이 방법은, 좀전 방법에서 내가 만들었던 방법과는 다르게
									 // 말일에서 점을 제거하려면 더 로직을 넣어줘야 한다.
									 // 그래서 로직을 짜서 넣었다. 정상 작동 
									 
		}

		
		
		
		
		
		
		
		
	}

}
