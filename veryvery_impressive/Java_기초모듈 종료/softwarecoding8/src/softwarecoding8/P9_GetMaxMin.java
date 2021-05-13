package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P9_GetMaxMin {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 7. 스스로 실습 / 삼성전자 2015년 종가의 최대값, 최소값
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// 데이터 읽어올 경로 지정
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\StockDailyPrice.csv");
		// 버퍼리더 객체 생성
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// 데이터 읽어와서 담을 String 선언
		String k20_readtxt;
		// Maximum이 될 Integer
		// 초기화 시에는 Integer의 최솟값 부여. 0보다 이게 안전하다.
		int k20_Max_2015_closing = Integer.MIN_VALUE;
		String k20_Max_2015_when = "";
		// Minimum이 될 Integer
		// 초기화 시에는 Integer의 최댓값 부여. 0보다 이게 안전하다.
		int k20_Min_2015_closing = Integer.MAX_VALUE;
		String k20_Min_2015_when = "";
		// 데이터 읽어올 조건문
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 마찬가지로 콤마로 쪼개줌
			String[] k20_field = k20_readtxt.split(",");
			// 만일 2015년에 해당하고, 삼성전자의 코드와 같다면
			if (k20_field[1].contains("2015") && k20_field[2].equals("A005930")) {
				// Maximum값을 초기화해줄 조건문
				if (Integer.parseInt(k20_field[3]) > k20_Max_2015_closing) {
					// 해당 필드값을 Max에 초기화
					k20_Max_2015_closing = Integer.parseInt(k20_field[3]);
					k20_Max_2015_when = k20_field[1];
				}
				// Minimum값을 초기화해줄 조건문
				if (Integer.parseInt(k20_field[3]) < k20_Min_2015_closing) {
					// 해당 필드값을 Min에 초기화
					k20_Min_2015_closing = Integer.parseInt(k20_field[3]);
					k20_Min_2015_when = k20_field[1];
				}
			}
		}
		// 작업 종료 후 close
		k20_br.close();
		// Max와 Min값 확인
		System.out.printf("Max : %d  / when? %s\nMin : %d  / when? %s\n",
				k20_Max_2015_closing, k20_Max_2015_when, k20_Min_2015_closing, k20_Min_2015_when);
	}
}
