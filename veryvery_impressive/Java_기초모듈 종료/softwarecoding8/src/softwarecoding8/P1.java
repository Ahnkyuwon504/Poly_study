package softwarecoding8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 1. 무식하게 읽고 쓰기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try { // try, catch 문으로 오류 발생하면 잡기
			File k20_f = new File("C:\\Users\\안규원\\Desktop\\Mytest.txt");
			// File 객체생성, 경로는 직접 찾아서 붙여넣기
			FileWriter k20_fw = new FileWriter(k20_f);
			// FileWriter 객체생성
			FileReader k20_fr = new FileReader(k20_f);
			// FileReader 객체생성
			k20_fw.write("안녕 파일\n"); // 안녕 파일이라는 String을 파일에 write
			k20_fw.write("hello 헬로\n"); // hello 헬로라는 String을 파일에 write
			k20_fw.close(); // 입력 후 반드시 close해야 함!
			
			int k20_n = -1; // -1로 초기화. 추후 -1이되면 읽어오는 반복문 break
			char [] k20_ch; // 읽어온 data를 담을 char Array 그릇
			
			while(true) {  // 반복문은 break조건이 성립될때까지 반복된다.
				k20_ch = new char[100]; // char Array 그릇의 크기를 100으로 지정
				k20_n = k20_fr.read(k20_ch); // 그 그릇에 읽어온 data를 담는다
				
				if (k20_n == -1) break; // 한번 읽은 후, 읽어올 게 없으면 -1이 되어
				// break된다. 이 조건이 없으면 프로그램이 끝나지 않는다.
				for (int k20_i = 0; k20_i < k20_n; k20_i++) {
				// for (char c : ch) {
				// 가져온 data를 담은 k20_n의 크기만큼 for문 실시
					System.out.printf("%c", k20_ch[k20_i]);
				} // for문을 돌리면서 char을 출력한다.
			}
			// 출력 종료 후 반드시 close 해야함! write와 마찬가지.
			k20_fr.close();
			// 파일 출력이 종료되었음은 while의 종료와 같다. 이 시점을 알려주는
			// END문장 출력
			System.out.printf("\n FILE READ END!");
		} catch (Exception k20_e) { // 만일 에러 발생시
			System.out.printf("나 에러[%s]\n", k20_e); // 에러 문구를 출력하여
			// 대비할 수 있도록 한다.
		}
	}
}
