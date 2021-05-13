package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 2. Buffered 읽고 쓰기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void k20_FileWrite() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		// 아까는 char Array를 생성하여 거기에 담은 후 읽었지만,
		// 이번에는 버퍼를 가지고 읽을 것이다.
		BufferedWriter k20_bw = new BufferedWriter(new FileWriter(k20_f));
		// 몇 바이트인진 상관없이 버퍼가 알아서 읽어줄 것이다.
		k20_bw.write("안녕 파일"); // 안녕 파일이라는 String 입력
		k20_bw.newLine();		   // 새로운 라인을 찾아주고
		k20_bw.write("hello 헬로");// 다시 hello 헬로라는 String 입력
		k20_bw.newLine();		   // 또다시 새로운 라인을 찾아준다.
		
		k20_bw.close();	// 마찬가지로, 입력활동이 끝나면
		// 반드시 close를 해야함. close 안하면 계속 파일이 열려 있기 때문에
		// 제어할 수가 없고 프로그램에도 좋지 않음. 습관화 하자...
	}
	
	public static void k20_FileRead() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		// 마찬가지로 버퍼를 사용할 것임.
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// 파일을 읽기 전에 String을 선언해줌.
		String k20_readtxt; // 이 String에 버퍼에서 읽어오는 data를 
		// 한 줄 한 줄 담을 것임.
		while((k20_readtxt = k20_br.readLine()) != null) {
		// data를 읽어오는 조건문은 더이상 읽을 줄이 없어서
		// String의 값이 null이 될 때까지 실시될 것임.
			System.out.printf("%s\n", k20_readtxt);
		// 한 줄 한 줄 읽을 때마다 바로 출력
		}
		k20_br.close();
		// 역시 출력활동이 끝나면 반드시 close.
	}

	public static void main(String[] args) throws IOException {
		k20_FileWrite(); // 앞전에 만든 Write기능의 메소드 호출.
		// static이기 때문에 별도의 객체 생성 없이 호출 가능
		k20_FileRead(); // 앞전에 만든 Read기능의 메소드 호출.
		// static이기 때문에 별도의 객체 생성 없이 호출 가능
	}
}
