package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P11_Where_CloseOrFar_Parking {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 4. 스스로 실습 / 특정지점과 가장 가까운 주자창/먼 주차장 찾아 인쇄
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// 마찬가지로 파일의 경로 입력해줌
		File k20_f = new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\8\\전국주차장정보.csv");
		// 버퍼리더를 사용할 것이기 때문에, 객체 생성
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// 읽어온 데이터를 담을 String 선언
		String k20_readtxt;
		// 융기원의 위도
		double k20_lat = 37.3860521;
		// 융기원의 경도
		double k20_lng = 127.1214038;
		// 가까운 곳의 거리를 저장할 double
		double closePARK = Double.MAX_VALUE;
		// 먼 곳의 거리를 저장할 double
		double farPARK = Double.MIN_NORMAL;
		// 가까운 곳의 거리명을 저장할 String
		String closePARK_location = "";
		// 먼 곳의 거리명을 저장할 String
		String farPARK_location = "";
		
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// 데이터를 읽어올 때 한 줄씩 읽어올 것임.
			String[] k20_field = k20_readtxt.split(",");
			// 이제 아까의 융기원 위도경도를 활용하여 거리를 계산할 것임.
			try {
				// try catch를 사용해 오류가 발생하더라도 continue 하도록 처리
				// 위도경도로 거리 계산
				double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[3]) - k20_lat, 2)
						+ Math.pow( Double.parseDouble(k20_field[2]) - k20_lng, 2));
				// 만일 계산된 거리가 크다면, 먼 거리에 저장할 것임. 조건 부여
				if (k20_dist > farPARK) {
					// farPARK 거리 초기화
					farPARK = k20_dist;
					// farPARK 거리명 초기화
					farPARK_location = "주차장명 - " + k20_field[1] + " / 주소 - " +  k20_field[6];
				} 
				// 만일 계산된 거리가 작다면, 가까운 거리에 저장할 것임. 조건 부여
				if (k20_dist < closePARK) {
					// closePARK 거리 초기화
					closePARK = k20_dist;
					// closePARK 거리명 초기화
					closePARK_location = "주차장명 - " + k20_field[1] + " / 주소 - " +  k20_field[6];
				}
				// 공백이거나 String이어서 double계산이 안되는 오류가 발생하였으므로,
				// 오류 발생시 continue
			} catch (NumberFormatException e) {
				continue;
			}
			  catch (Exception e) {
			}
		}
		// 마찬가지로 작업종료시 close하는 습관 들이기
		k20_br.close();
		// 가장 가까운 주차장 출력
		System.out.printf("가장 가까운 주차장 : %s , 현재지점과 거리 : %f\n",
						   closePARK_location, closePARK);
		// 가장 먼 주차장 출력
		System.out.printf("가장   먼   주차장 : %s , 현재지점과 거리 : %f\n",
						   farPARK_location, farPARK);

	}

}
