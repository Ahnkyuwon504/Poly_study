///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 4. 구분자된 필드 추출/처리 2
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P4_GetHanguel {
	static String get_Hanguel(int N) {
		int k20_iNumVal = N; // 받아온 숫자...
		String k20_sNumVal = String.valueOf(k20_iNumVal); // 우선 String으로 변환...

		String k20_sNumVoice = ""; // 발음 담을 String 생성..
		int k20_i, k20_j; // index들..

		String[] k20_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 발음들..
		String[] k20_unitsX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 자릿수들..

		k20_i = 0; // 0부터 시작..그래야 앞부터 읽는다..
		k20_j = k20_sNumVal.length() - 1; // 큰거부터 시작..억쪽부터 시작해야한다..

		while (true) { 
			if (k20_i >= k20_sNumVal.length()) // 다읽으면 break
				break;

			if (k20_sNumVal.substring(k20_i, k20_i + 1).equals("0")) { // 만약 0이 나오면
				if (k20_unitsX[k20_j].equals("만") || k20_unitsX[k20_j].equals("억")) {
					// 만이나 억이면.. 읽어 줘야함..
					k20_sNumVoice = k20_sNumVoice + "" + k20_units[k20_j];
					// 추가해준다
				} else { // 만 억 아니면 필요 없다..
				}
			} else { // 0 없으면 간단히..
				k20_sNumVoice = k20_sNumVoice + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]
						+ k20_unitsX[k20_j];
				// 자릿수 + 계수 읽어준다..
			}
			k20_i++; // 앞에서 뒤로
			k20_j--; // 큰수에서 작은수로..
		}
		return k20_sNumVoice; // 리턴 String
	}

	static String get_Hanguel_FromPhone(String temp) {
		// 전화번호는 읽는법이 다르다..
		String[] k20_section_temp = temp.split("-"); // 우선 -기준으로 split
		String k20_phone_section = ""; String k20_phoneVoice = ""; // 담을 그릇
		// 담을 그릇의 앞, 중간, 뒤를 담을 작은그릇
		String[] k20_units = { "공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 영은 공으로 읽는다.
		for (int i = 0; i < k20_section_temp.length; i++) { // 각 자리수에 맞게..
			String k20_sNumVal = k20_section_temp[i]; // split된 Array의 원소..
			k20_phone_section = ""; // 발음 담을 그릇... 초기화 안해주면 쌓인다
			int k20_i; // 자릿수 이동시켜줄 index

			k20_i = 0; // 0에서 시작

			while (true) {
				if (k20_i == k20_sNumVal.length()) break; // 다읽으면 break

				k20_phone_section = k20_phone_section + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))];
				// 전화번호의 한 부분을 완성..
				k20_i++; // index 증가하여 break조건까지..
			}
			
			k20_phoneVoice = k20_phoneVoice + k20_phone_section + " ";
			// 전화번호의 부분을 쌓아서 전화번호 완성..
		}
		
		return k20_phoneVoice; // String return한다..
	}
}
