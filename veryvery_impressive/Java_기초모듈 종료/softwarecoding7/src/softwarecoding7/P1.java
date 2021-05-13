///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 1. 한글 계산
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		// 뒤부터 정렬하는 메소드 호출
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		// 뒤부터 정렬하는 메소드 호출
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15));
		// 앞부터 정렬하는 메소드 호출
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));
		// 앞부터 정렬하는 메소드 호출
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
		// 한글 개수 출력하는 메소드 호출

	}

	static String HanBlankForeword(String k20_temp, int k20_numberOfbytes) {
		// parameter는 문장과 바이트 수
		String k20_blankstring = k20_temp;
		// 새롭게 생성될 String 초기화
		for (int k20_i = 0; k20_i < k20_numberOfbytes - k20_temp.getBytes().length; k20_i++) {
			k20_blankstring = " " + k20_blankstring;
			// 바이트 수 세고 부족한 만큼 스페이스 바 추가...
		}

		return k20_blankstring; // 리턴
	}

	static String HanBlankBackword(String k20_temp, int k20_numberOfbytes) {
		// parameter는 문장과 바이트 수
		String k20_blankstring = k20_temp;
		// 새롭게 생성될 String 초기화
		for (int k20_i = 0; k20_i < k20_numberOfbytes - k20_temp.getBytes().length; k20_i++) {
			k20_blankstring = k20_blankstring + " ";
			// 바이트 수 세고 부족한 만큼 스페이스 바 추가...뒤에..
		}

		return k20_blankstring; // 리턴
	}

	static int HanCount(String k20_temp) { // 한글 개수세기
		int k20_number_KOR = k20_temp.getBytes().length - k20_temp.length();
		// 한글은 개당 2바이트. 그외는 개당 1바이트.
		// 총 바이트 수는 2*한글 + 1*그외
		// 총 길이는 1*한글 + 1*그외...
		// 따라서 바이트에서 길이 빼면 한글 수 나옴.
		int k20_number_notKOR = k20_temp.length() - k20_number_KOR;
		// 사용하지는 않는데 구해 봤음.
		return k20_number_KOR; // 한글 수 리턴..
	}
}
