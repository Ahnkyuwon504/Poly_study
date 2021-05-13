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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class P4 {
	public static void main(String[] args) throws IOException {
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\7\\부산광역시_북구_재난 이재민 수용시설 현황_20210219.csv");
		// 버퍼리더 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽은 데이터를 담을 String
		ArrayList<String> k20_data_ArrayList = new ArrayList<String>();
		// 데이터 크기가 얼만지 모르니까...ArrayList로...
		String k20_readtxt;
		// 데이터를 읽어올 때의 조건문. 원리 숙지할 것!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			k20_data_ArrayList.add(k20_readtxt); // List에 add한다...
		}
		// 작업 종료시 close하는 습관
		k20_br.close();
		
		String [] k20_OneRec = new String[k20_data_ArrayList.size()]; // 다시 Array에 담아야 해..
		// ArrayList size만큼의 크기 갖는 Array로...
		
		for (int k20_i = 0; k20_i < k20_data_ArrayList.size(); k20_i++) {
			k20_OneRec[k20_i] = k20_data_ArrayList.get(k20_i); // 담아준다..
		}
		// OneRec에 자료가 모두 담겼다...
		k20_OneRec[0] = k20_OneRec[0].replace("\"", "");
		String [] k20_field_name = k20_OneRec[0].split(","); // 쪼갠다..필드명
		for (int k20_i = 1; k20_i < k20_OneRec.length; k20_i++) { // 1부터 해야 필드명 안나오지..
			k20_OneRec[k20_i] = k20_OneRec[k20_i].replace("\"", "");
			String [] k20_field = k20_OneRec[k20_i].split(","); // 쪼갠다..필드
			
			k20_field[0] = P4_GetHanguel.get_Hanguel(Integer.parseInt(k20_field[0])); // 한글로변환
			k20_field[3] = P4_GetHanguel.get_Hanguel(Integer.parseInt(k20_field[3])); // 한글로변환
			k20_field[6] = P4_GetHanguel.get_Hanguel_FromPhone(k20_field[6]); // 전화번호..변환
			
			System.out.printf("*****************************************************\n");
			for (int k20_j = 0; k20_j < k20_field_name.length; k20_j++) { // 모든 원소 다 나오니까..0부터
				System.out.printf(" %s : %s\n", k20_field_name[k20_j], k20_field[k20_j]); // 출력해야 한다..
			}
			System.out.printf("*****************************************************\n");
		}
	}
}
