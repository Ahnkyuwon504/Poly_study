package newprj0402;

public class HW18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #18. 선택,반복,배열 18번 / 2021.04.01. / 2125341020 안규원
		// 숫자읽기 고급
		// 매우 복잡한 로직이므로 주석처리한 것을 반복 복습해야함
		///////////////////////////////////////////////////
		
		int k20_iNumVal = 1001034567; // 변수인 숫자가 주어짐. 스캐너로도 활용할 수 있을 듯.
		String k20_sNumVal = String.valueOf(k20_iNumVal); // 숫자를 String으로 바꿈.
												  // substring으로 써먹으려고 바꾼 것임.
		String k20_sNumVoice = ""; // String변수 선언. 공백으로 시작해서 계속 채워질것임.
		System.out.printf("==> %s [%d자리]\n", k20_sNumVal, k20_sNumVal.length()); // 최초 숫자가
		// 몇 자리로 구성되어 있는지 보여주는 용도임.
		
		int k20_i, k20_j; // 변수 선언
		 		  // i는 0부터 시작하게 되는데, 숫자의 자릿수만큼 while문을 실시시키고 종료하는 용도임.
		          // j는 숫자의 자릿수-1 로 값을 부여받게 될텐데, 이는 array의 원소가 0번째부터 시작하기 때문임.
		
		String [] k20_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};		
		// 1001034567의 각 자릿수에서 계수를 읽어주는 용도. array로 선언하였음. String 배열임.
		String [] k20_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		// 1001034567의 각 자릿수에서 십의 자리수인지 천의 자리수인지 억의 자리수인지 읽어주는 용도.
		// 이 array의 0번째 원소는 공백으로 저장되어있다. 이는 1001034567을 한글로 읽을 때 마지막 숫자를 칠로
		// 읽기 때문이다. 또한 십-백-천 만, 십-백-천 억, 등 만과 억만 다르게 되어있는데,
		// 이는 1001034567을 한글로 읽을 때 만과 억을 반드시 읽어 주기 때문이다.밑의 while문에서 추가설명하겠음.
		
		k20_i = 0; // i가 0으로 부여된 이유는, 1001034567의 첫째 자리부터 시작되기 때문이다. 
		  	   // i가 0으로 시작되었기 때문에 i가 1001034567의 자릿수인 10이 되면 출력 중지하고 break할 것이다.
		k20_j = k20_sNumVal.length() - 1; // j가 1001034567의 자릿수에서 1을 뺀 값으로 부여된 이유는
		 						  // unitX array에 저장된 값을 불러올 때 unitX의 첫 번째 원소가
								  // 0번째이기 때문이다.
		
		while(true) { // while문 반복한다.
			if (k20_i >= k20_sNumVal.length()) break; // i가 10이 되면 while문 break할것임.
											  // 즉 숫자의 끝 자리수에 도달하면 break 한다는 얘기.
			
			System.out.printf("%s[%s]",	// 1001034567에서 각 자릿수에 해당하는 숫자와 발음을 출력
					k20_sNumVal.substring(k20_i, k20_i+1), // string으로 저장한 이유가 나옴. substring으로 쪼개줌.
					k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i+1))]);
					// substring으로 쪼개서 그 자릿수에 해당하는 숫자가 나오면, 
					// 그 숫자에 해당하는 한글 발음을 unitX array에서 불러온다.
			
			if (k20_sNumVal.substring(k20_i, k20_i+1).equals("0")) { /* 이제부터가 어렵다.
														 * 만약 어떤 자릿수에 해당하는 숫자가
														 * 0이라면,
														 * 만이나 억이 아니면 아무 일도 없지만
														 * 만이나 억이라면 '만'과 '억'을 출력해야 한다.
														 */
				if (k20_unitX[k20_j].equals("만") || k20_unitX[k20_j].equals("억")) { // 따라서 그 경우에 해당한다면
					k20_sNumVoice = k20_sNumVoice + "" + k20_unitX[k20_j]; // 출력될 문자열에 '만'과 '억'을 추가해주는 것.
				} else { 								   // 그 외의 경우에는 아무것도 하지 않는다.
				}
			} else { // 어떤 자릿수에 해당하는 숫자가 0이 아니라면
				k20_sNumVoice = k20_sNumVoice // 원래 sNumVoice에 추가하는 것
						+ k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i+1))]
								// 자릿수에 해당하는 숫자를 한글로 읽어서 추가해주고
						+ k20_unitX[k20_j];
								// 자릿수에 해당하는 십, 백, 천을 추가해준다.
			}
			k20_i++; k20_j--; // 한 자릿수 출력 끝나면 i 올려주고 j 내려준다. 
					  // i가 올라감으로써 break조건에 도달하게 되고, j가 내려감으로써 자릿수를 내려가면서 진행
		}
		System.out.printf("\n %s[%s]\n", k20_sNumVal, k20_sNumVoice); // 최종 출력

	}

}
