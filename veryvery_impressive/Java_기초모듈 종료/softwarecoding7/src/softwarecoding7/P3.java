///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 3. 구분자된 필드 추출/처리
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

public class P3 {

	public static void main(String[] args) throws IOException {
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\7\\대구광역시 북구_수경시설_20200501.csv");
		// 버퍼리더 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽은 데이터를 담을 String
		ArrayList<String> data_ArrayList = new ArrayList<String>();
		// 데이터 크기가 얼만지 모르니까...ArrayList로...
		String k20_readtxt;
		// 데이터를 얼마나 입력했는지 나타낼 Integer 초기화. 현재값은 당연히 0
		int k20_cnt = 0;
		// 데이터를 읽어올 때의 조건문. 원리 숙지할 것!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			data_ArrayList.add(k20_readtxt); // List에 add한다...
			k20_cnt++; // 사용할 일은 없지만..습관화 하자...
		}
		// 작업 종료시 close하는 습관
		k20_br.close();
		
		String [] OneRec = new String[data_ArrayList.size()]; // 다시 Array에 담아야 해..
		// ArrayList size만큼의 크기 갖는 Array로...
		
		for (int i = 0; i < data_ArrayList.size(); i++) {
			OneRec[i] = data_ArrayList.get(i); // 담아준다..
		}
		// OneRec에 자료가 모두 담겼다...
		String [] field_name = OneRec[0].split(","); // 쪼갠다..필드명
		for (int i = 1; i < OneRec.length; i++) { // 1부터 해야 필드명 안나오지..
			String [] field = OneRec[i].split(","); // 쪼갠다..필드
			System.out.printf("*********************************************\n");
			for (int j = 0; j < field_name.length; j++) { // 모든 원소 다 나오니까..0부터
				System.out.printf(" %s : %s\n", field_name[j], field[j]); // 출력해야 한다..
			}
			System.out.printf("*********************************************\n");
		}
		

	}

}
