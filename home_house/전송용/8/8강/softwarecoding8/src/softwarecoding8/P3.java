package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P3 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 8강. File
	// 3. 실제 파일에 응용
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// 마찬가지로 읽어올 파일의 경로 입력
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\무료와이파이정보.csv");
		// 버퍼리더로 읽어올 것임.
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// 읽어올 String을 담을 k20_readtxt 선언
		String k20_readtxt;
		// 첫 번째 라인을 읽어와서 k20_readtxt에 담을 것임.
		// 버퍼리더의 원리는, readLine을 읽어올 때마다 저절로 다음 줄로 넘어감.
		// 따라서 이번 if문이 시행되면, 다음 readLine 메소드는 두 번째 줄을 읽어옴.
		if ((k20_readtxt = k20_br.readLine()) == null) {
			// 혹시 첫 번째 줄이 내용이 없을 때를 대비한 if문
			System.out.printf("빈 파일입니다.\n");
			// 빈 파일이라고 알려줄 것임.
			return; // 그러고 if문 종료
		}
		// 무료와이파이정보의 첫 번째 줄은 데이터의 field명을 나타내고 있음.
		// 따라서 그것을 콤마로 split한 후, k20_field_name String Array에
		// 넣어줄 것임.
		String[] k20_field_name = k20_readtxt.split(",");
		// LineCnt인 Integer 생성. 우리는 100번째 줄까지만 출력할 것이라서..
		// 후에 이 Integer을 늘리고, break의 조건으로 써먹을 것임.
		int k20_LineCnt = 0;
		// 데이터를 읽어올 때의 조건문은 거의 동일하다.
		// 다음 읽어온 줄이 비어 있으면 그만 읽는 원리!
		while((k20_readtxt = k20_br.readLine()) != null) {
			// 마찬가지로, 한 줄 한 줄 읽을 때마다 콤마로 쪼개서 String Array에
			// 값을 넣어준다.
			String[] k20_field = k20_readtxt.split(",");
			// 각 줄마다 구분되도록 해줄 줄 출력
			System.out.printf("**[%d번째 항목]***************\n", k20_LineCnt);
			// 몇 번째 항목인지 표시해줄 것임.
			for (int k20_j = 0; k20_j < k20_field_name.length; k20_j++) {
				// 아까 생성한 field_name을 지금 써먹는다.
				System.out.printf(" %s : %s\n", k20_field_name[k20_j], k20_field[k20_j]);
			}
			// 각 줄의 출력이 종료됨을 알 수 있도록 줄 출력
			System.out.printf("*******************************\n");
			// 우리는 100번째 까지만 궁금하므로..break
			if (k20_LineCnt == 100) break;
			// 한 줄 읽어올 때마다 LineCnt를 올려줌.
			k20_LineCnt++;
		}
		// 모든 출력이 종료되면, 반드시 close 해줄 것!
		k20_br.close();
	}
}
