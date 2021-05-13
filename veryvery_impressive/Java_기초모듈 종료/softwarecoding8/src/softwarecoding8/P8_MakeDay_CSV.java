package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P8_MakeDay_CSV {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 7. 스스로 실습 / 19951124의 모든 종목 파일 만들기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// 읽어올 파일의 경로 지정
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\StockDailyPrice.csv");
		// 버퍼리더 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 입력할 파일의 경로 지정
		File k20_f1 = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\19951124.csv");
		// 버퍼라이터 객체 생성
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// 읽어올 데이터를 한 줄 한 줄 담을 String 선언
		String k20_readtxt;
		// 입력할 데이터를 몇 줄 입력할지 확인할 Integer 생성, 현재 당연히 0
		int k20_cnt = 0;
		int k20_wcnt = 0;
		// 데이터 읽어올 조건문 생성
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 마찬가지로 콤마 기준으로 쪼개서 String Array에 넣어줌
			String[] k20_field = k20_readtxt.split(",");
			// 1995년 11월 24일에 해당하는 모든 종목을 가져오기 위해
			// 조건문 부여
			// 이건 내 생일임.
			if (k20_field[1].equals("19951124")) {
				// 데이터 입력. 입력 후 다음 라인으로 토스
				k20_bw1.write(k20_readtxt); k20_bw1.newLine();
				k20_wcnt++;
			}
			// 한 줄 읽어올 때마다 카운트 상승
			k20_cnt++;
		}
		// 작업 종료시 close
		k20_br.close();
		k20_bw1.close();
		// 작업 종료시 몇 줄 읽었는지 확인
		System.out.printf("Program End[%d][%d]records\n", k20_cnt, k20_wcnt);
	}
}
