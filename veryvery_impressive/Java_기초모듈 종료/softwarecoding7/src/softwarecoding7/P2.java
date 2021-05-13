///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 2. 고정길이에서 필드 추출/처리
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.text.DecimalFormat;

public class P2 {
	static String[] k20_oneRec = { // static String Array 생성
			// 예전에 뽑았던 영수증 목록들이다..
			"01 aaaaaaaa초코 a초      3,000  1     3,000",
			"02 자바는최고의학문  1,000,000  1 9,999,999",
			"03 @#%@#%@%#@%#$       800,000  1   800,000",
			"04 김 망고              20,000  2    40,000",
			"05 꽃aaa 드라마         10,000  5    50,000",
			"06 홈런볼은 야구장에     2,500  6    15,000",
			"07*아이스커피            3,000  7    21,000",
			"08*꼬북칩                2,200  8    17,600",
			"09 몽쉘은 다들먹어       1,800  1     1,800",
			"10 스윙운 과자           3,800  5    19,000",
			"11 빈츠는 황제           5,200 13    67,600",
			"12 동원                  1,800 14    25,200",
			"13 마이 미는지역명       4,000  5    20,000",
			"14*왕꿈틀이안에킹왕          1  6    26,400",
			"15*미니쉘미니미니        3,800  3    11,400",
			"16 짱 셔요              13,200  1    13,200",
			"17 초비초                3,800  3    11,400",
			"18 다이소다이제다그      2,700  5    13,500",
			"19 카라                    200 10     2,000",
			"20 비빔 면먹고아이셔       300  6     1,800",
			"21 유기농 초코송이       3,400  8    27,200",
			"22 계란 말이               180  8     1,440",
			"23 계란 말이계란말이     8,800  6    52,800",
			"24 에엥에               11,000  5    55,000",
			"25 주니어양말              500  8     4,000",
			"26 파이리                4,802 10    48,020",
			"27 도라에몽                800 12     9,600",
			"28 리자몽 꼬리도있나       900 14    12,600",
			"29 토게피 알주세요알     1,300 60    78,000",
			"30*카카오라고해짜나        643 80    51,440",
			"31 자 바                90,000  1    90,000",
	};
	
	static void print_WrongOperation() { // 계산 틀린 항목 프린트하는 메소드
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // 쉼표로 나누기 위해 import

		String k20_old_one_Line; String k20_old_one_Line_part; // 수정 전 한줄, 한줄 부분
		String k20_new_one_Line; String k20_new_one_TotalPrice; // 수정 후 한줄, 한줄 부분
		String k20_string_One_Price; String k20_string_One_Amount; String k20_string_One_TotalPrice;
		// 수정 전 가격, 수량, 총합(String)
		int k20_one_Price; int k20_one_Amount; int k20_one_TotalPrice;
		// 수정전 가격, 수량, 총합(integer)
		
		for (int k20_i = 0; k20_i < k20_oneRec.length; k20_i++) {
			// 영수증에 찍힌 개수만큼 for문 실시
			k20_old_one_Line = k20_oneRec[k20_i]; // 한 줄
			k20_string_One_TotalPrice = k20_old_one_Line.substring(k20_old_one_Line.length() - 10, k20_old_one_Line.length()); 
			k20_string_One_Amount = k20_old_one_Line.substring(k20_old_one_Line.length() - 13, k20_old_one_Line.length() - 10); 
			k20_string_One_Price = k20_old_one_Line.substring(k20_old_one_Line.length() - 23, k20_old_one_Line.length() - 13);
			// 개별품목 가격, 수량, 총합 
			// 현재는 String상태, 이것들은 고정길이라 substring으로 자른거임...
			k20_string_One_Price = k20_string_One_Price.replace(",", "");
			k20_string_One_Amount = k20_string_One_Amount.replace(",", "");
			k20_string_One_TotalPrice = k20_string_One_TotalPrice.replace(",", "");
			// 정제 작업... 콤마 날린다 
			k20_string_One_Price = k20_string_One_Price.trim();
			k20_string_One_Amount = k20_string_One_Amount.trim();
			k20_string_One_TotalPrice = k20_string_One_TotalPrice.trim();
			// 정제 작업...앞뒤 공백 날린다
			k20_one_Price = Integer.parseInt(k20_string_One_Price);
			k20_one_Amount = Integer.parseInt(k20_string_One_Amount);
			k20_one_TotalPrice = Integer.parseInt(k20_string_One_TotalPrice);
			// 정제 끝났으니 Integer로 바꿔서 계산해주자
			if ((k20_one_Price * k20_one_Amount) != k20_one_TotalPrice) { // 계산 틀릴때
				k20_one_TotalPrice = k20_one_Price * k20_one_Amount; // 맞는 가격 넣어주고
				k20_old_one_Line_part = k20_old_one_Line.substring(0, k20_old_one_Line.length() - 10);
				k20_new_one_TotalPrice = k20_cut(k20_df.format(k20_one_Price * k20_one_Amount), 10);
				k20_new_one_Line = k20_old_one_Line_part.concat(k20_new_one_TotalPrice);
				// 새롭게 만들어진 맞는 가격을 String으로 바꿔서 
				// 콤마 붙여주고 문장 뒤에 붙여준다...
				System.out.printf("*************************************************\n");
				System.out.printf("오류[%s]\n", k20_old_one_Line);
				System.out.printf("수정[%s]\n", k20_new_one_Line);
				System.out.printf("*************************************************\n");
				// 조건 만족할 때에만 수정사항 출력...
			}
		}
	}
	
	public static String k20_cut(String k20_str, int k20_len) {

		if (k20_str.getBytes().length <= k20_len) { // 길이 맞춰주는 메소드...
			// 영수증 때 사용하고 여전히 잘 사용중...
			int k20_blank = (k20_len) - k20_str.getBytes().length; // 블랭크 갯수...
			for (int k20_i = 0; k20_i < k20_blank; k20_i++) { 
				k20_str = " " + k20_str; // 블랭크 추가해준다...
			}
			return k20_str;
		} else {
			StringBuffer k20_sbStr = new StringBuffer(k20_len);
			// StringBuffer 사용..
			int k20_cnt = 0; // count 0으로 초기화...
			for (char k20_ch : k20_str.toCharArray()) {
				k20_cnt += String.valueOf(k20_ch).getBytes().length;
				// 바이트 숫자 세어주고..계속 카운트 올라간다....
				if (k20_cnt > k20_len)
					break;
				k20_sbStr.append(k20_ch);
				// 붙여 준다...
			}
			String k20_text = k20_sbStr.toString();
			int k20_blank = k20_len - k20_text.getBytes().length;
			// 공백 개수..

			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_text += " "; // 붙여 준다...
			}
			return k20_text;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_WrongOperation();

	}

}
