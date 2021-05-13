package study04121;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #6. 리포팅연습(영수증 출력 등) 6번 / 2021. 04. 22. / 2125341020안규원
		// 영수증 출력 3
		////////////////////////////////////////////////////////////////////////
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // 쉼표로 나누기 위해 import
		Calendar k20_cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 현재시간 출력 포맷
		
		// 구입한 상품의 이름을 저장하는 String Array
		String[] k20_name_Array = new String[] { "초코", "바 난나나나나솨나나나나나나나나나", "건포도", "김 망고", "꽃aaa 드라마",
				"홈런볼은 야구장에서", "아이스커피", "꼬북칩", "몽쉘은 다들먹어", "스윙운 과자", "빈츠는 황제", "동원", "마이 미는지역명",
				"*왕꿈틀이안에킹왕캬캬캬캬", "미니쉘미니미니", "짱 셔요", "초비초", "다이소다이제다그런거지", "카라", "비빔 면먹고아이셔",
				"유기농 초코송이", "계란 말이", "계란 말이계란말이", "에엥에", "주니어양말", "파이리", "도라에몽",
				"리자몽 꼬리도있나", "토게피 알주세요알", "카카오라고해짜나요", "자 바는최고의학문" };
		// 구입한 상품이 면세상품인지 과세상품인지 boolean으로 표현 
		boolean[] k20_tax_Array = new boolean[] {
				false, true, true, true, true, true, false, false, true, true, true, true, true, false, false, true,
				true, true, true, true, true, true, true, true, true, true, true, true, true, false, true };
		// 구입한 상품이 면세상품이라면 false값의 boolean을 가지고, 그 앞에 *을 붙이는 메소드
		for (int k20_i = 0; k20_i < k20_name_Array.length; k20_i++) { // String Array의 갯수만큼 for문 실시
			if (k20_tax_Array[k20_i] == false) {	// 만약 면세물품이라면
				k20_name_Array[k20_i] = "*" + k20_name_Array[k20_i];	// 앞에 *을 붙여 구분한다.
			}
		}
		// 구입한 상품의 이름을 9글자로 제한. 9글자보다 작을 시 뒤에 byte를 붙인다.
		// 따라서 모든 구입상품은 같은 길이를 가지게 된다.
		for (int k20_i = 0; k20_i < k20_name_Array.length; k20_i++) { // String Array의 갯수만큼 for문 실시
			if (k20_name_Array[k20_i].getBytes().length > 27 || k20_name_Array[k20_i].length() > 9) {
				// Byte 크기가 27 초과 혹은 길이가 9 초과일 경우.
				k20_name_Array[k20_i] = k20_name_Array[k20_i].substring(0, 9);
				// 9자릿수만큼 잘라준다. substring 이용
			}
			int k20_Korean = (k20_name_Array[k20_i].getBytes().length - k20_name_Array[k20_i].length()) / 2;
			// 한글의 갯수. byte 길이에서 실제 length를 빼고 2로 나눠준다.
			int k20_byte = k20_name_Array[k20_i].length() - k20_Korean;
			// 한글이 아닌 문자의 갯수. 전체 length에서 한글의 갯수를 빼준다.
			int k20_num = 18 - (2 * k20_Korean + k20_byte); // 9글자로 길이를 제한하고 싶기 때문에, 18에서 빼준다.
			for (int k20_j = 0; k20_j < k20_num; k20_j++) { // 그 빈 칸의 갯수만큼
				k20_name_Array[k20_i] = k20_name_Array[k20_i] + " "; // 공백을 더해 줌으로써 같은 길이로 만든다.
			}
		}
		// 개별 상품의 가격을 저장한 Integer Array
		int[] k20_price_Array = new int[] { // 배열 생성
				3000, 1000, 1000, 20000, 10000, 2500, 3000, 2200, 1801, 3800, 5200, 1800, 4000, 4400, 3800, 13200, 3800,
				2700, 200, 300, 3400, 180, 8800, 10000, 500, 4801, 800, 900, 1300, 200, 9999999 };
		// 개별 상품의 개수를 저장한 Integer Array
		int[] k20_how_Many_Array = new int[] { // 배열 생성
				1, 1, 1, 2, 5, 6, 7, 8, 1, 5, 13, 14, 5, 6, 3, 1, 3, 5, 10, 6, 8, 8, 6, 5, 8, 10, 12, 14, 60, 80, 1 };
		// 개별 상품의 가격*개수, 즉 개별 상품에 쓴 금액을 저장하는 integer array
		int[] k20_total_Price_Array = new int[k20_name_Array.length];
		// integer array의 원소를 생성해준다.
		for (int i = 0; i < k20_total_Price_Array.length; i++) { // 상품 개수만큼 for문 실시
			k20_total_Price_Array[i] = k20_price_Array[i] * k20_how_Many_Array[i]; // 개별 상품의 가격*개수가 곱해져서
		} // 원소로 들어간다.
		int price_Of_Taxfree = 0; // 면세상품의 가격 선언
		int price_Of_Tax = 0; // 과세상품의 가격 선언
		for (int i = 0; i < k20_name_Array.length; i++) { // 개별 상품의 개수만큼 for문 실시
			if (k20_tax_Array[i] == false) { // 만약 면세상품이라면
				price_Of_Taxfree += k20_price_Array[i] * k20_how_Many_Array[i]; // 면세상품 총액에 더해진다
			} else { // 만약 과세상품이라면
				price_Of_Tax += k20_price_Array[i] * k20_how_Many_Array[i]; // 과세상품 총액에 더해진다
			}
		}
		double tax = 0.1; // 세율 생성하여 10퍼센트
		int real_Price_Of_Tax = (int) Math.ceil(price_Of_Tax / (tax + 1)); // 원가는 올림해주고
		int how_Much_Tax = (int) (price_Of_Tax * tax / (tax + 1)); // 세금은 1원이하 절삭한다
		int price_Of_Total = price_Of_Taxfree + price_Of_Tax; // 상품의 총액은 면세가격 + 과세가격 총액
		System.out.printf("\n\n             이마트 죽전점 (031)888-1234\n"); // 텍스트 출력
	      // 맨 앞에 두 줄 띄어 줌으로써 읽기 쉽도록.
	      System.out.printf("             206-86-50913 강희석\n"); // 텍스트 출력
	      System.out.printf("             용인 수지구 포은대로 552\n"); // 텍스트 출력
	      System.out.printf("영수증 미지참시 교환/환불 불가\n"); // 텍스트 출력
	      System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n"); // 텍스트 출력
	      System.out.printf("*일부 브랜드매장 제외(매장 고지물참조)\n"); // 텍스트 출력
	      System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n"); // 텍스트 출력
	      System.out.printf("[구매]%s   POS:0011-9861\n", k20_sdt.format(k20_cal.getTime()));
	      // 현재시간 출력. 포맷형태는 k20_sdt 활용
	      System.out.printf("-----------------------------------------\n"); // 줄 출력. 이제 시작됨.
	      System.out.printf("상품명                단 가  수량    금액\n"); // 상품명/단가/수량/금액
	      for (int i = 0; i < k20_name_Array.length; i++) { // 상품 가짓수만큼 for문이 실시됨.
	         System.out.printf("%s%9s%3s%11s\n", // 각 상품별 출력문마다의 간격을 맞춰주기 위함이다.
	      // 또한 상품명이 길 경우 8칸으로 잘라버리기 위해 .8이 들어갔음.
	      // -14는 14칸 간격 설정 후 앞에서부터 왼쪽 정렬한다는 의미. 마이너스 없으면 오른쪽 정렬.
	               k20_name_Array[i], k20_df.format(k20_price_Array[i]), // 상품명, 가격 출력. 쉼표찍어줌.
	               k20_how_Many_Array[i], k20_df.format(k20_total_Price_Array[i])); // 수량, 총액 출력.
	         if (((i+1)%5) == 0) { // 상품이 5개씩 찍힐 때마다 점선을 출력하여 구분해줌.
	            System.out.printf("-----------------------------------------\n"); // 점선 출력
	         }
	      }
	      System.out.printf("\n"); // 줄 넘기고 다시 진행
	      System.out.printf("%22s%14d\n",  "총  품목  수량", k20_name_Array.length); // 총 품목 수량은 상품가짓수
	      System.out.printf("%23s%14s\n", "(*)면  세  물  품", k20_df.format(price_Of_Taxfree));
	      // 면세물품 : 면세상품의 총액 합계
	      System.out.printf("%23s%14s\n", "과  세  물  품", k20_df.format(real_Price_Of_Tax));
	      // 과세물품 : 과세상품의 원가 총액 합계
	      System.out.printf("%24s%14s\n", "부    가    세", k20_df.format(how_Much_Tax));
	      // 부가세 : 과세상품의 세금 합계
	      System.out.printf("%25s%14s\n", "합          계", k20_df.format(price_Of_Total));
	      // 합계 : 지불한 총액
	      System.out.printf("%s%24s\n", "결 제 대 상 금 액", k20_df.format(price_Of_Total));
	      // 결제대상금액 : 합계와 동일
	      System.out.printf("-----------------------------------------\n"); // 줄 출력
	      System.out.printf("0012 KEB 하나  %26s\n", "541707**0484/35860658"); // 텍스트 출력
	      System.out.printf("카드결제(IC)%16s%s\n", "일시불 / ", k20_df.format(price_Of_Total)); // 텍스트 출력
	      System.out.printf("-----------------------------------------\n"); // 줄 출력
	      System.out.printf("            [신세계포인트 적립]\n"); // 텍스트 출력
	      System.out.printf("홍*두 고객님의 포인트 현황입니다.\n"); // 텍스트 출력
	      System.out.printf("금회발생포인트           9350**9995   164\n"); // 텍스트 출력
	      System.out.printf("누계(가용)포인트             5,637(5,473)\n"); // 텍스트 출력
	      System.out.printf("*신세계포인트 유효기간은 2년입니다.\n"); // 텍스트 출력
	      System.out.printf("-----------------------------------------\n"); // 줄 출력
	      System.out.printf("    구매금액기준 무료주차시간 자동부여\n"); // 텍스트 출력
	      System.out.printf("차량번호 : %29s\n", "34저****"); // 텍스트 출력
	      System.out.printf("입차시간 : %30s\n", k20_sdt.format(k20_cal.getTime())); // 현재시간 출력
	      System.out.printf("-----------------------------------------\n"); // 줄 출력
	      System.out.printf("캐셔:084599 양00 %25s", "1150\n"); // 텍스트 출력
	      System.out.printf("  lliliililililillilililiililiilililili\n"); // 바코드 출력
	      System.out.printf("      20210303/00119861/00164980/31\n"); // 영수증 마무리
	}
}
