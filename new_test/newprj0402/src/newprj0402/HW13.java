package newprj0402;

public class HW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #13. 선택,반복,배열 13번 / 2021.04.01. / 2125341020 안규원
		// 비정형비교1
		///////////////////////////////////////////////////
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for문 활용하여 1월부터 12월까지 돌린다.
			System.out.printf(" %d월 => ",k20_i); // 월을 알려주는 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) { // 월별로 for문 활용하여 1일부터 그 달의 말일까지.
				System.out.printf("%d,", k20_j); // 일을 알려주는 출력
				
				if (k20_i == 1 && k20_j == 30) { // 1월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 2 && k20_j == 27) { // 2월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 3 && k20_j == 30) { // 3월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 4 && k20_j == 29) { // 4월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 5 && k20_j == 30) { // 5월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 6 && k20_j == 29) { // 6월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 7 && k20_j == 30) { // 7월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 8 && k20_j == 30) { // 8월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 9 && k20_j == 29) { // 9월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 10 && k20_j == 30) { // 10월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 11 && k20_j == 29) { // 11월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
				if (k20_i == 12 && k20_j == 30) { // 12월의 말일이 되면 break
					System.out.printf("%d", k20_j+1); break; // 말일에 콤마 들어가는게 싫어서 따로 설정
				}
			}
			System.out.printf("\n"); // 한달 입력 끝났으면 줄넘겨서 다음달로 넘어감
		}

	}

}
