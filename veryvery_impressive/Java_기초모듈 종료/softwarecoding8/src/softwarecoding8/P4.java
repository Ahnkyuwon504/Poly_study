package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class P4 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 4. 거리계산
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		// 마찬가지로 파일의 경로 입력해줌
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\전국무료와이파이표준데이터.txt");
		// 버퍼리더를 사용할 것이기 때문에, 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽어온 데이터를 담을 String 선언
		String k20_readtxt;
		// 마찬가지로, 데이터를 읽어올 때의 조건문임.
		// 지금은 if문으로 단 한번 실시되기 때문에, 첫 번째 줄에 대해서만 해당됨.
		if ((k20_readtxt = k20_br.readLine()) == null) {
			// 첫 번째 줄이 비어있으면 빈 파일이라고 알려주도록 함.
			System.out.printf("빈 파일입니다.\n");
			// 조건문 빠져나옴.
			return;
		}
		// 무료와이파이 데이터의 첫 번째 줄에서
		// 데이터가 무엇으로 분류되었는지 이름을 가져올 것임.
		// 또한 이 데이터가 굉장히 이상하기 때문에,
		// 탭으로 분리되는 txt파일로 저장하여 가져왔음. 따라서 \t으로 split함.
		String[] k20_field_name = k20_readtxt.split("\t");
		// 융기원의 위도
		double k20_lat = 37.3860521;
		// 융기원의 경도
		double k20_lng = 127.1214038;
		// 융기원의 위도경도를 활용하여 전국무료와이파이 제공 장소 중
		// 어느 곳이 거리가 가장 가까운지 확인 가능.
		// 정확한 거리는 아니지만, 위경도 차이의 피타고라스 합을 비교함으로써
		// 가까운지 먼지는 비교할 수 있음.
		int k20_LineCnt = 0; // 이 Integer을 이용해 몇 번째 항목인지 표시할 것임
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 데이터를 읽어올 때 한 줄씩 읽어올 것임.
			// 마찬가지로 \t으로 쪼개줌. 3번 실습과 다르다!
			String[] k20_field = k20_readtxt.split("\t");
			// 몇 번째 항목인지 표시하는 줄
			System.out.printf("**[%d번째 항목]***************\n", k20_LineCnt);
			// 소재지 지번 주소와 그 세부내용을 표시
			System.out.printf(" %s : %s\n", k20_field_name[9], k20_field[9]);
			// 소재지의 위도를 표시
			System.out.printf(" %s : %s\n", k20_field_name[12], k20_field[12]);
			// 소재지의 경도를 표시
			System.out.printf(" %s : %s\n", k20_field_name[13], k20_field[13]);
			// 이제 아까의 융기원 위도경도를 활용하여 거리를 계산할 것임.
			// k20_dist는 피타고라스 정리를 활용한 위도경도 차이임.
			double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[12]) - k20_lat, 2)
					+ Math.pow( Double.parseDouble(k20_field[13]) - k20_lng, 2));
			// 현재지점과의 거리를 각 데이터마다 표시
			System.out.printf(" 현재지점과 거리 : %f\n", k20_dist);
			// 한 줄이 종료되었음을 알려주는 줄 표시
			System.out.printf("*****************************\n");
			// 한 줄 읽어올 때마다 Cnt 상승
			k20_LineCnt++;
		}
		// 마찬가지로 작업종료시 close하는 습관 들이기
		k20_br.close();
	}
}
