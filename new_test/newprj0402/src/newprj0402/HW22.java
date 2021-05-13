package newprj0402;

import java.text.DecimalFormat;

public class HW22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #22. 선택,반복,배열 20번 / 2021.04.01. / 2125341020 안규원
		// 칸 맞추기 실습
		///////////////////////////////////////////////////
		
		String k20_item = "사과"; // 출력할 품목의 이름 선언
		int k20_unit_price = 5000; // 출력할 품목의 단가 선언
		int k20_num = 500; // 출력할 품목의 수량 선언
		int k20_total = 0; // 출력할 품목의 수량*단가로 총액 계산할것임. 현재는 0으로 셋팅
		
		DecimalFormat df = new DecimalFormat ( "###,###,###,###,###" ); // 소숫점 찍어주는 library import
		
		System.out.printf("=====================================================\n"); // 영수증 상단 출력
		System.out.printf("%15.15s%8.8s%9.9s%14.14s\n", "품목", "단가", "수량", "합계"); // 영수증 항목 출력
		System.out.printf("=====================================================\n"); // 영수증 중단 출력
		/* 여기서 간격을 잘 볼 것! 한글만 맞출 거면 같은 숫자로 하면 되지만, 숫자와 한글을 맞출 때는
		 * 한글의 간격과 숫자의 간격이 다르기 때문에 한글1개당 숫자2개로 맞춰 줘야 오와열이 딱딱 맞는다.
		 * 단가와 5,000원을 맞추는 것을 주목하여 학습하기 
		 */
		System.out.printf("%15.15s%10.10s%10.10s%16.16s\n", // 한글의 개수당 한개씩 더 빼줘야 딱딱 맞는다.
				k20_item, df.format(k20_unit_price), df.format(k20_num), df.format(k20_unit_price * k20_num)); // 계산서의 항목들
		System.out.printf("=====================================================\n"); // 영수증 하단 출력

	}

}
