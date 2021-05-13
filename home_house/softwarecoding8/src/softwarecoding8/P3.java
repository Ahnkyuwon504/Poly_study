package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P3 {
	public static void main(String[] args) throws IOException {
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\무료와이파이정보.csv");
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		
		String k20_readtxt;
		
		if ((k20_readtxt = k20_br.readLine()) == null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		String[] k20_field_name = k20_readtxt.split(",");
		
		int k20_LineCnt = 0;
		while((k20_readtxt = k20_br.readLine()) != null) {
			String[] field = k20_readtxt.split(",");
			System.out.printf("**[%d번째 항목]**************\n", k20_LineCnt);
			for (int j = 0; j < k20_field_name.length; j++) {
				System.out.printf(" %s : %s\n", k20_field_name[j], field[j]);
			}
			System.out.printf("*******************************\n");
			if (k20_LineCnt == 100) break;
			k20_LineCnt++;
		}
		k20_br.close();
	}
}
