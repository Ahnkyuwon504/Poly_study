///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 5. 파일쓰기 미리 맛보기
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter k20_fw = new FileWriter("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\a.txt", true);
		BufferedWriter k20_bw = new BufferedWriter(k20_fw);
		StringBuffer k20_sf = new StringBuffer();
		
		BufferedReader k20_br = new BufferedReader(new InputStreamReader(System. in));
		String k20_str = "";
		
		while(!(k20_str=k20_br.readLine()).startsWith("s")) {
			k20_sf.append(k20_str + "\n");
		}
		
		k20_br.close();
		k20_fw.write(k20_sf.toString());
		k20_fw.flush();
		k20_fw.close();
		System.out.println("저장이 완료되었습니다.");

	}

}
