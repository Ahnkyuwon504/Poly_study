package softwarecoding2;

public class P9 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 9. Overflow Ex
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768; // 변수 선언 및 초기화
		short sMax = 32767; // 변수 선언 및 초기화
		char cMin = 0; // 변수 선언 및 초기화
		char cMax = 65535; // 변수 선언 및 초기화
		
		System.out.println("sMin  = " + sMin); // Min 출력
		System.out.println("sMin-1= " + (short)(sMin-1));
		// Min에서 1 빼면 short의 최솟값에서 빠져서 최댓값으로 간다..
		System.out.println("sMax  = " + sMax); // Max 출력
		System.out.println("sMax+1= " + (short)(sMax+1));
		// Max에서 1 더하면 short의 최댓값에서 빠져서 최솟값으로 간다..
		System.out.println("cMin  = " + (int)cMin); // Min 출력
		System.out.println("cMin-1= " + (int)--cMin); 
		// 마찬가지. 최솟값에서 1 빠져서 최댓값으로 간다..
		System.out.println("cMax  = " + (int)cMax); // Max 출력
		System.out.println("cMax+1= " + (int)++cMax);
		// 마찬가지. 최댓값에서 1 더해져서 최솟값으로 간다..
	}
}
