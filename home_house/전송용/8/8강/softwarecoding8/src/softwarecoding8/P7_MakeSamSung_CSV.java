package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7_MakeSamSung_CSV {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 7. 스스로 실습 / 삼성전자 파일 만들기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException  {
		// 파일 읽어올 경로 지정
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\day_data\\StockDailyPrice.csv");
		// 버퍼리더 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 파일 입력할 경로 지정
		File k20_f1 = new File("E:\\Download\\새 폴더 (2)\\day_data\\A005930.csv");
		// 버퍼라이터 객체 생성
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// 읽어온 데이터를 담을 String 선언
		String k20_readtxt;
		// 데이터를 얼마나 입력했는지 나타낼 Integer 초기화. 현재값은 당연히 0
		int k20_cnt = 0;
		// 데이터를 읽어올 때의 조건문. 원리 숙지할 것!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 읽어온 데이터를 콤마로 쪼갤 것임.
			// 이것은 앞에서 콤마 기준 csv파일을 만들어 주었으므로 가능한 것
			String[] k20_field = k20_readtxt.split(",");
			// 조건문. 삼성전자의 코드값에 해당할 때만 실시됨.
			if (k20_field[2].equals("A005930")) {
				// 조건을 만족할 때마다 bw1 객체를 매개로 데이터 입력
				// newLine을 통해 그 다음 줄로 이동하여 입력하도록 함.
				k20_bw1.write(k20_readtxt); k20_bw1.newLine();
			}
			// 한 줄 입력시마다 cnt 상승.
			// 몇 줄 입력했는지 이 Integer을 통해 확인 가능
			k20_cnt++;
		}
		// 작업 종료시 close하는 습관
		k20_br.close();
		k20_bw1.close();
		// 작업 종료시 몇 줄을 읽었는지 확인하는 요도
		System.out.printf("Program End[%d]records\n", k20_cnt);
	}
}
