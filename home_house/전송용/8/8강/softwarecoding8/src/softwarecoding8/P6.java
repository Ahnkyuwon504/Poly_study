package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P6 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 6. 감 잡은 내용으로 파일정제
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
 	public static void main(String[] args) throws IOException {
 		// 마찬가지로 파일의 경로 지정, 데이터를 읽어올 파일임.
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\day_data\\THTSKS010H00.dat");
		// 버퍼리더를 사용할 것임.
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 마찬가지로 파일의 경로 지정, 새로 입력할 파일임. 
		File k20_f1 = new File("E:\\Download\\새 폴더 (2)\\day_data\\StockDailyPrice.csv");
		// 버퍼라이터를 사용할 것임.
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// 읽어올 때 사용할 k20_readtxt String 선언
		String k20_readtxt;
		// 두 개의 Integer 생성
		// k20_cnt는 읽어올 파일의 데이터 갯수
		// k20_wcnt는 새로 입력할 파일의 데이터 갯수
		int k20_cnt = 0; int k20_wcnt = 0;
		// 마찬가지로 데이터 읽어올 때의 조건문
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 한 줄 읽을 때마다 내용을 담아줄 StringBuffer 생성
			StringBuffer k20_s = new StringBuffer();
			// 구분자를 %_%로 잡고 split하여 k20_field String Array에 담아줌.
			String[] k20_field = k20_readtxt.split("%_%");
			// 1조건 : 구분자를 매개로 split된 각 String들의 크기가 2보다 크다.
			// 2조건 : 각 필드에서 ^를 날리고 앞뒤 공백을 제거한 후 첫글자가 A랑 같은 경우
			// 이 때, trim()메소드는 문자열의 앞뒤 공백을 날려버리는 역할을 한다.
			if (k20_field.length > 2 && k20_field[2].replace("^", "").
					trim().substring(0,1).equals("A")) {
				// k20_s에 추가해준다. 
				// 뭘 추가하냐면, 0번째 필드에서 ^를 날리고 앞뒤 공백을 날려준 결과를.
				k20_s.append(k20_field[0].replace("^", "").trim());
				// 이후 1번째부터 마지막 필드까지
				for (int j = 1; j < k20_field.length; j++) {
				// 쉼표 + 그 필드에서 ^를 날린 결과를 추가해준다.
				// 이 때도 당연히 trim하여 앞뒤 공백 날려주었음.
					k20_s.append("," + k20_field[j].replace("^", "").trim());
				}
				// 이제 k20_s가 완성되었다! 이것을 bw1 객체를 통해 write한다.
				k20_bw1.write(k20_s.toString());k20_bw1.newLine();
				// write 할때마다 write count 상승
				k20_wcnt++;
			}
			// 읽어올 때마다 count 상승
			// count와 write count는 다르다. 당연히 조건을 걸어서 
			// 그 때마다 write해주었기 때문이다...
			k20_cnt++;
		}
		// 작업 종료 후 읽어온 파일과 입력한 파일 모두 close한다.
		k20_br.close();
		k20_bw1.close();
		// 작업 종료 후 읽어온 파일의 행 개수, 입력한 파일의 행 개수 출력
		System.out.printf("Program End[%d][%d]records\n", k20_cnt, k20_wcnt);
	}
}
