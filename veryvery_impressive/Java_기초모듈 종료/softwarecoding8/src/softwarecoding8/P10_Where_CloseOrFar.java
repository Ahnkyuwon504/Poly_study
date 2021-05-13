package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class P10_Where_CloseOrFar {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 4. 스스로 실습 / 융기원에서 가장 가까운 곳, 먼 곳 찾아 인쇄
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		// 마찬가지로 파일의 경로 입력해줌
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\전국무료와이파이표준데이터.txt");
		// 버퍼리더를 사용할 것이기 때문에, 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽어온 데이터를 담을 String 선언
		String k20_readtxt;
		// 융기원의 위도
		double k20_lat = 37.3860521;
		// 융기원의 경도
		double k20_lng = 127.1214038;
		// 융기원의 위도경도를 활용하여 전국무료와이파이 제공 장소 중
		// 어느 곳이 거리가 가장 가까운지 확인 가능.
		// 정확한 거리는 아니지만, 위경도 차이의 피타고라스 합을 비교함으로써
		// 가까운지 먼지는 비교할 수 있음.
		
		// 가까운 곳의 거리를 저장할 double
		double k20_closeWIFI = Double.MAX_VALUE;
		// 먼 곳의 거리를 저장할 double
		double k20_farWIFI = Double.MIN_NORMAL;
		
		// 가까운 곳의 거리명을 저장할 String
		String k20_closeWIFI_location = "";
		// 먼 곳의 거리명을 저장할 String
		String k20_farWIFI_location = "";
		
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 데이터를 읽어올 때 한 줄씩 읽어올 것임.
			// 마찬가지로 \t으로 쪼개줌.
			String[] k20_field = k20_readtxt.split("\t");
			// 이제 아까의 융기원 위도경도를 활용하여 거리를 계산할 것임.
			// k20_dist는 피타고라스 정리를 활용한 위도경도 차이임.
			try {
				// try catch를 사용해 오류가 발생하더라도 continue 하도록 처리
				// 대형 데이터 특성상 일일히 수정할 수가 없음.
				// 위도경도로 거리 계산
				double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[12]) - k20_lat, 2)
						+ Math.pow( Double.parseDouble(k20_field[13]) - k20_lng, 2));
				// 만일 계산된 거리가 크다면, 먼 거리에 저장할 것임. 조건 부여
				if (k20_dist > k20_farWIFI) {
					// farWIFI 거리 초기화
					k20_farWIFI = k20_dist;
					// farWIFI 거리명 초기화
					k20_farWIFI_location = k20_field[9];
				} 
				// 만일 계산된 거리가 작다면, 가까운 거리에 저장할 것임. 조건 부여
				if (k20_dist < k20_closeWIFI) {
					// closeWIFI 거리 초기화
					k20_closeWIFI = k20_dist;
					// closeWIFI 거리명 초기화
					k20_closeWIFI_location = k20_field[8];
				}
				// 공백이거나 String이어서 double계산이 안되는 오류가 발생하였으므로,
				// 오류 발생시 continue
			} catch (NumberFormatException k20_e) {
				continue;
			}
			  catch (Exception k20_e) {
			}
		}
		// 마찬가지로 작업종료시 close하는 습관 들이기
		k20_br.close();
		// 가장 가까운 곳 출력
		System.out.printf("가장 가까운 곳 : %s , 현재지점과 거리 : %f\n",
						   k20_closeWIFI_location, k20_closeWIFI);
		// 가장 먼 곳 출력
		System.out.printf("가장   먼   곳 : %s , 현재지점과 거리 : %f\n",
						   k20_farWIFI_location, k20_farWIFI);
	}
}

