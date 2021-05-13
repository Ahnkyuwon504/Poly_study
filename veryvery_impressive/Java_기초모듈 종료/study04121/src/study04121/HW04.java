package study04121;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #4. 리포팅연습(영수증 출력 등) 4번 / 2125341020안규원
		// 영수증 출력 1
		////////////////////////////////////////////////////////////////////////
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // 쉼표 찍어주기위해 import
		Calendar k20_cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력 가능
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 현재시간 출력하는 포맷

		int k20_iPrice = 10000; // 총액 값 부여
		double k20_tax = 0.1; // 세율 값 부여. 10%이다
		// 만일 세율이 10%라면, 33,000원은 원가 30,000원과 세금 3,000원의 합계이다
		int k20_real_iPrice = (int) (k20_iPrice / (k20_tax + 1));
		// 원가를 구하기 위한 변수 정의
		// 총 합계액을 1+tax로 나눈 후, 1을 곱하여 원가 산출
		int k20_tax_iPrice = (int) Math.ceil(k20_iPrice * k20_tax / (k20_tax + 1));
		// 세금 변수 정의
		// 총 합계액을 1+tax로 나눈 후, tax를 곱하여 세금 산출

		System.out.printf("\n\n신용승인\n"); // 신용승인 출력. 맨 앞에서 줄바꿈 2번
		System.out.printf("단말기 : 2N68665898%18s\n", "전표번호 : 042317"); // 텍스트 출력
		System.out.printf("가맹점 : 한양김치찌개\n"); // 텍스트 출력
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 ,1층\n"); // 텍스트 출력
		System.out.printf("대표자 : 유창신\n"); // 텍스트 출력
		System.out.printf("사업자 : 752-53-00558%21s", "TEL : 7055695\n"); // 텍스트 출력
		System.out.printf("-----------------------------------------\n"); // 구분 줄 출력
		System.out.printf("%-8s%28s 원\n", "금  액", k20_df.format(k20_real_iPrice));
		// 금액 출력, 원가 부분
		System.out.printf("%-8s%27s 원\n", "부가세", k20_df.format(k20_tax_iPrice));
		// 부가세 출력, 세금 부분
		System.out.printf("%-8s%28s 원\n", "합  계", k20_df.format(k20_iPrice));
		// 총액 출력
		System.out.printf("-----------------------------------------\n"); // 구분 줄 출력
		System.out.printf("우리카드\n"); // 텍스트 출력
		System.out.printf("카드번호 : 5387-20**-****-4613(S) %4s\n", "일시불"); // 텍스트 출력
		System.out.printf("거래일시 : %s\n", k20_sdt.format(k20_cal.getTime())); // 텍스트 출력
		// 현재 시간을 아까 저장한 k20_cal 객체 이용하여 불러옴.
		// 출력 포맷은 k20_sdt로 지정하였음.
		System.out.printf("승인번호 : 70404427\n"); // 텍스트 출력
		System.out.printf("거래번호 : 357734873739\n"); // 텍스트 출력
		System.out.printf("매입 : 비씨카드사      가맹 : 720068568\n"); // 텍스트 출력
		System.out.printf("알림 : EDC매출표\n"); // 텍스트 출력
		System.out.printf("문의 : TEL)1544-4700\n"); // 텍스트 출력
		System.out.printf("-----------------------------------------\n"); // 구분 줄 출력
		System.out.printf("              * 감사합니다 *\n"); // 텍스트 출력
		System.out.printf("%39s", "표준V2.08_20200212"); // 텍스트 출력
	}
}
