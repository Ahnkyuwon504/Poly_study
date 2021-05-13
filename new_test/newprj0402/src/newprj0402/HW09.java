package newprj0402;

import java.util.ArrayList;

public class HW09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #9. 선택,반복,배열 9번 / 2021.04.01. / 2125341020 안규원
		// 배열
		///////////////////////////////////////////////////
		
		int[] k20_score = {100, 90, 80, 70, 60}; // array인 변수 정의법 1
		int[] k20_score1 = new int[] {100, 90, 80, 70, 60}; // array인 변수 정의법 2
		int[] k20_score3; // array인 변수 정의법 3
		k20_score3 = new int[] {100, 90, 80, 70, 60}; // array는 칸이 정해져 있기 때문에 이렇게 해야함
		
		ArrayList<Integer> k20_result = new ArrayList<Integer> (); // add 이용해서 array를 만들고싶다면, ArrayList 사용하자.
		k20_result.add(100); // 100 추가
		k20_result.add(80); // 80 추가
		k20_result.add(60); // 60 추가
		k20_result.add(40); // 40 추가
		k20_result.add(20); // 20까지 추가 완료.
		System.out.printf("First : %d\nSecond : %d\nThird : %d\nFourth : %d\nFifth : %d\n", 
				k20_result.get(0), k20_result.get(1), k20_result.get(2), k20_result.get(3), k20_result.get(4));
		// ArrayList의 원소들을 이와 같이 불러오고 싶을 때는 for문을 사용하거나 모두 나열하면 된다. 
		
	}

}
