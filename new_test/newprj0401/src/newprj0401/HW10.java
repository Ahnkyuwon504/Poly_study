package newprj0401;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW10 {
	///////////////////////////////////////////////////
	// #10. 사칙연산10번 / 2021.04.01. / 2125341020 안규원
	// 수수료 포함 환전 계산(1)
	///////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_MyWon, k20_usd, k20_remain; // int변수들 정의
		double k20_MoneyEx, k20_commission; // double변수들 정의
		
		k20_MyWon = 1000000; // 100만원을 투입할 것임.
		k20_MoneyEx = 1238.21; // 현재 환율은 1238.21
		k20_commission = 0.003; // 환전수수료는 0.3퍼센트
		
		k20_usd = (int) (k20_MyWon/k20_MoneyEx); // 내 100만원을 환율로 나눈, 즉 내가 받을 달러
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx); // 달러를 받고 1달러가 안되는 돈은 한화로.
		
		double k20_ComPerOne = k20_MoneyEx * k20_commission; // 1달러당 수수료
		double k20_totalcom = k20_usd * k20_ComPerOne; // 내가 받을 달러와 수수료를 곱한, 즉 지불할 수수료
		
		System.out.printf("************************************************************\n"); // 영수증 출력
		System.out.printf("*             수수료 계산                                     *\n"); // 글자 출력
		System.out.printf(" 총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", // 수수료, 미화, 지불할 수수료
				k20_totalcom, k20_usd, k20_ComPerOne);
		System.out.printf("************************************************************\n"); // 영수증 출력
		
		
		
		
		
		
		
		///////////////////////////////////////////////////
		// #11. 사칙연산11번 / 2021.04.01. / 2125341020 안규원
		// 수수료 포함 환전 계산(2)
		///////////////////////////////////////////////////
		
		int k20_i_totalcom; // int변수를 정의, 올림처리할 수수료임.
		
		if (k20_totalcom != (double) ((int)k20_totalcom)) { // 버림되었을 때는
			k20_i_totalcom = (int) k20_totalcom + 1; // 1을 더해주고
		} else { // 버림되지 않고 같을 때는
			k20_i_totalcom = (int) k20_totalcom; // 그대로 정의해준다.
		}
		
		System.out.printf("************************************************************\n"); // 영수증 출력
		System.out.printf("*             수수료 적용환전                                  *\n"); // 글자 출력
		System.out.printf(" 총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", // 총 수수료
				k20_i_totalcom, k20_usd, k20_ComPerOne);                    // 미화액수랑 달러당수수료곱
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // 잔돈 정의
		System.out.printf(" 총 한화환전금액: %d원 => 미화: %d달러, 수수료청구:%d원 잔돈: %d원\n", // 수수료, 미화, 지불할 수수료
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain); // 정의된 잔돈도 출력
		System.out.printf("************************************************************\n"); 
		
		///////////////////////////////////////////////////
		// #12. 사칙연산12번 / 2021.04.01. / 2125341020 안규원
		// 수수료 포함 환전 계산(3)
		///////////////////////////////////////////////////
		
		k20_usd = (int) (k20_MyWon / (k20_MoneyEx + k20_ComPerOne)); // 환전달러
		k20_totalcom = k20_usd * k20_ComPerOne; // 총 수수료
		
		if (k20_totalcom != (double)((int)k20_totalcom)) { // 총 수수료를 올림처리하기 위한 if문
			k20_i_totalcom = (int) k20_totalcom +1; // double과 int가 다를시, 즉 버림처리시 +1
		} else {
			k20_i_totalcom = (int) k20_totalcom; // 동일하면 그대로!
		}
		
		System.out.printf("************************************************************\n"); // 영수증 출력
		System.out.printf("*            (정확한)수수료 적용환전                             *\n"); // 글자 출력
		System.out.printf(" 총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", // 총 수수료
				k20_i_totalcom, k20_usd, k20_ComPerOne);                    // 미화액수랑 달러당수수료곱
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // 잔돈 재정의
		System.out.printf(" 총 한화환전금액: %d원 => 미화: %d달러, 수수료청구:%d원 잔돈: %d원\n", // 수수료, 미화, 지불할 수수료
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain); // 재정의된 잔돈도 출력
		System.out.printf("************************************************************\n"); 
		
		
		///////////////////////////////////////////////////
		// #14. 사칙연산14번 / 2021.04.01. / 2125341020 안규원
		// 현재 날짜, 시간 찍기
		//////////////////////////////////////////////////
		
		Calendar calt = Calendar.getInstance(); // Calendar 라이브러리를 import하여 날짜 표시할것임.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); // 날짜 표시하는 포맷!
		DecimalFormat df = new DecimalFormat ( "###,###,###,###,###" ); // DecimalFormat을 이용하여 콤마찍을것임. 이 행에서는 import하였음.
		
		System.out.printf("************************************************************\n"); // 영수증 출력
		System.out.printf("*            콤마찍기, 날짜 적용                                *\n"); // 글자 출력
		System.out.printf(" 총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", // 총 수수료
				df.format(k20_i_totalcom), df.format(k20_usd), k20_ComPerOne); // 미화액수랑 달러당수수료곱
		
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // 잔돈 정의
		System.out.printf(" 총 한화환전금액: %s원 => 미화: %s달러, 수수료청구:%s원 잔돈: %s원\n", // 수수료, 미화, 지불할 수수료, 잔돈 출력
				df.format(k20_MyWon), df.format(k20_usd), 
				df.format(k20_i_totalcom), df.format(k20_remain)); 
		System.out.printf(" 최종실행시간: %s\n", sdt.format(calt.getTime())); // 영수증 마지막 행에 출력날짜를 기입할 것임.
		System.out.printf("************************************************************\n"); // 영수증 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
