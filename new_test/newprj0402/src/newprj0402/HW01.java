package newprj0402;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #1. 선택,반복,배열 1번 / 2021.04.01. / 2125341020 안규원
		// if문
		///////////////////////////////////////////////////
		
		int k20_score, k20_num, k20_score1; // 변수 정의
		
		k20_score = 70; // score은 70점
		k20_num = 0; // num은 0
		k20_score1 = 95; // score1은 95점 부여
		
		if (k20_score > 60) { // score가 60점 초과일 경우
			System.out.println("합격입니다."); // 합격입니다 출력
		}
		if (k20_score < 90) { // score가 90점 미만일 경우
			System.out.println("불합격입니다."); // 불합격입니다 출력
		}
		if (k20_score > 60) { // score가 60점 초과일 경우
			System.out.println("합격입니다."); // 합격입니다 출력
		} else { // 그렇지 않은 경우, 즉 60점 이하일 경우
			System.out.println("불합격입니다."); // 불합격입니다 출력
		}
		
		if (k20_num > 0) { // num가 0 초과일 경우
			System.out.println("양수입니다."); // 양수입니다 출력
		} else if (k20_num < 0) { // 0 미만일 경우
			System.out.println("음수입니다."); // 음수입니다 출력
		} else { // 0초과도 아니고 0미만도 아닌, 즉 0일 때 
			System.out.println("0 입니다."); // 0입니다 출력
		}
		
		if (k20_score1 >= 90) { // score1이 90점 이상일 경우
			System.out.println("A등급"); // A등급 출력
		} else if (k20_score1 >= 80 && k20_score1 < 90) { // 80점 이상, 90점 미만일 경우
			System.out.println("B등급"); // B등급 출력
		} else if (k20_score1 >= 70 && k20_score1 < 80) { // 70점 이상, 80점 미만일 경우
			System.out.println("C등급"); // C등급 출력
		} else { // 그 외, 즉 70점 미만일 경우
			System.out.println("F등급"); // F등급 출력
		}
	}

}
