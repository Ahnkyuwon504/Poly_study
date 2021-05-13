package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P5 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 5. 파일 훑어보고 감잡기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// 마찬가지로 파일 경로 지정
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\day_data\\THTSKS010H00.dat");
		// 버퍼리더를 사용할 것임.
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽어온 데이터를 저장할 String 선언
		String k20_readtxt;
		// 한 줄 한 줄 읽어올 때마다 LineCnt 상승됨
		int k20_LineCnt = 0;
		// k20_n은 읽어온 데이터의 String size 저장.
		// 읽어온 데이터가 없다면, 그 값이 -1이 되어 break조건 충족됨.
		int k20_n = -1;
		// 읽어온 데이터를 담을 StringBuffer 선언 및 생성
		StringBuffer k20_s = new StringBuffer();
		while(true) { // break조건 만족시까지 무한 반복
			// 담을 크기가 1000 size의 char Array
			char[] k20_ch = new char[1000];
			// 읽어온 데이터가 없으면 break됨
			k20_n = k20_br.read(k20_ch);
			// 읽어온 데이터가 없으면 k20_n이 -1이 되어 break됨
			if(k20_n == -1) break;
			// 읽어온 k20_ch는 char Array이기 때문에 
			// 그 개별 char을 생성하면서 for문 실시
			for (char k20_c : k20_ch) { // for문은 k20_ch에 있는 char 개수만큼 실시
				// 줄넘김을 만나게 된다면,
				// 즉 한 데이터가 끝난다면
				if (k20_c == '\n') {
					// *** 표시
					System.out.printf("[%s]***\n", k20_s.toString());
					// 한 줄이 끝났으므로 delete
					k20_s.delete(0, k20_s.length());
					// 끝나기 전까지는 계속 append해줌. 최종 한줄이 끝날 때 
					// 완성된 k20_s가 출력될것임
				} else {
					k20_s.append(k20_c);
				}
			}
			// 한 줄 할 때마다 Cnt 상승
			k20_LineCnt++;
		}
		System.out.printf("[%s]***\n", k20_s.toString());
		// 마찬가지로 종료시 close!!
		k20_br.close();
	}
}
