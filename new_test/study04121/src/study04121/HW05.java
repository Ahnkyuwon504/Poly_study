package study04121;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #5. 리포팅연습(영수증 출력 등) 5번 / 2021. 04. 22. / 2125341020안규원
		// 영수증 출력 2
		////////////////////////////////////////////////////////////////////////
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // 쉼표 찍기위해 import
		Calendar k20_cal = Calendar.getInstance(); // calendar로 현재시간 불러오기위해 import
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 현재시간 출력 포맷
		// 구입할 물품의 이름이 저장된 Array
		String[] k20_name_Array = new String[] { "퓨어에어 비말차단용마스크(최고급형)",
				"슬라이드식명찰 (최고급 가로형)", "매직흡착 인테리어후크(알루미늄타입)" };
		// 구입한 물품의 code 번호가 저장된 Array
		String[] k20_code_Array = new String[] { "[1031615]", "[1008152]", "[1020800]" };
		// 구입한 물품의 가격이 저장된 Array
		int[] k20_price_Array = new int[] { 3000, 1000, 1800 };
		// 구입한 물품의 수량이 저장된 Array
		int[] k20_how_Many_Array = new int[] { 1, 1, 1 };
		int k20_iPrice = 0; // 상품의 총액을 계산하기 위해 변수 선언 및 초기화 
		for (int k20_i = 0; k20_i < 3; k20_i++) { // for문은 상품의 개수만큼 실시되고
			k20_iPrice += k20_price_Array[k20_i]; // 각 for문마다 금액이 더해짐
		} // for문이 종료되면, 상품의 총액이 저장됨
		double k20_tax = 0.1; // 세율 10%
		int k20_real_iPrice = (int) (k20_iPrice / (k20_tax + 1)); // 원가를 저장하는 변수 선언 및 초기화 
		int k20_tax_iPrice = (int) (k20_iPrice * k20_tax / (k20_tax + 1)) + 1; // 세금을 저장하는 변수

		System.out.printf("\n\n            \"국민가게, 다이소\"\n"); // 텍스트 출력
		// 맨 앞줄 줄 넘겨줌으로써 보기 쉽도록!
		System.out.printf("(주)아성다이소_분당서현점\n"); // 텍스트 출력
		System.out.printf("전화:031-702-6016\n"); // 텍스트 출력
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n"); //텍스트 출력 
		System.out.printf("대표:박정부,신호섭 213-61-52063\n"); // 텍스트 출력
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11\n서현동\n"); // 텍스트 출력 
		System.out.printf("==========================================\n"); // 줄로 구분할 수 있도록
		System.out.printf("       소비자중심경영(CCM) 인증기업\n"); // 텍스트 출력
		System.out.printf("     ISO 001 품질경영시스템 인증기업\n"); //  텍스트 출력
		System.out.printf("==========================================\n"); // 줄로 구분
		System.out.printf("       교환/환불 14일(03월12일)이내,\n"); // 텍스트 출력
		System.out.printf("  영수증, 카드 지참 후 구입매장에서 가능\n"); // 텍스트 출력
		System.out.printf("    포장/가격 택 훼손시 교환/환불 불가\n"); // 텍스트 출력
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n"); // 텍스트 출력
		System.out.printf("==========================================\n"); // 줄로 구분할 수 있도록
		System.out.printf("[POS 1058231]   %25s\n", k20_sdt.format(k20_cal.getTime())); // 텍스트 출력
		// 현재 시간 출력해줌. 출력 포맷은 아까 정의한 k20_sdt 이용
		System.out.printf("==========================================\n"); // 줄로 구분
		// 본격적인 영수증 내용 시작
		System.out.printf("%.14s %s  %d %s\n", k20_name_Array[0], k20_df.format(k20_price_Array[0]),
				k20_how_Many_Array[0], k20_df.format(k20_price_Array[0] * k20_how_Many_Array[0]));
		// 실제 출력물 확인시, 같은 자릿수에서 모든 name이 끊어서 출력됨을 확인 가능
		// 이름, 금액 출력
		System.out.printf("%s\n", k20_code_Array[0]); // 0번째 코드번호 출력 
		System.out.printf("%.14s  %s  %d %s\n", k20_name_Array[1], k20_df.format(k20_price_Array[1]),
				k20_how_Many_Array[1], k20_df.format(k20_price_Array[1] * k20_how_Many_Array[1]));
		// 동일하게, String의 길이에 상관없이 끊어서 출력함
		System.out.printf("%s\n", k20_code_Array[1]); // 1번째 코드번호 출력
		System.out.printf("%.14s %s  %d %s\n", k20_name_Array[2], k20_df.format(k20_price_Array[2]),
				k20_how_Many_Array[2], k20_df.format(k20_price_Array[2] * k20_how_Many_Array[2]));
		// 동일하게, String의 길이에 상관없이 끊어서 출력함
		System.out.printf("%s\n", k20_code_Array[2]); // 2번째 코드번호 출력
		System.out.printf("            과세합계%21s\n", k20_df.format(k20_real_iPrice)); // 텍스트 출력
		// 과세합계 : 원가 출력
		System.out.printf("              부가세%21s\n", k20_df.format(k20_tax_iPrice)); // 텍스트 출력
		// 부가세 : 세금 출력
		System.out.printf("------------------------------------------\n"); // 줄로 구분 
		System.out.printf("판매합계%33s\n", k20_df.format(k20_iPrice)); // 텍스트 출력 
		System.out.printf("==========================================\n"); // 줄로 구분
		System.out.printf("신용카드%33s\n", k20_df.format(k20_iPrice)); // 텍스트 출력
		System.out.printf("------------------------------------------\n"); // 줄로 구분
		System.out.printf("우리카드%33s\n", "538720************");// 텍스트 출력
		System.out.printf("승인번호 7798243(0)%12s %s\n", "승인금액", k20_df.format(k20_iPrice));
		// 승인금액 출력
		System.out.printf("==========================================\n"); // 줄로 구분 
		System.out.printf("       %s 분당서현점\n", k20_sdt.format(k20_cal.getTime()));
		// 텍스트 출력, 현재시간 출력
		System.out.printf("상품 및 기타 문의 : 1522-4400\n"); // 텍스트 출력 
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n"); // 텍스트 출력
		System.out.printf("         1l1il1i1li1li1li1l1il1\n"); // 텍스트 출력
		System.out.printf("            211282061015821\n"); // 텍스트 출력
		System.out.printf("------------------------------------------\n"); // 줄로 구분
		System.out.printf(" * 다이소 멤버십 홈페이지에 접속하셔서\n"); // 텍스트 출력
		System.out.printf("   회원가입 후 다양한 혜택을 누려보세요! *\n"); // 텍스트 출력
	}
}
