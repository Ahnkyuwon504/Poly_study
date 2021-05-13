package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class P4 {

	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		File k20_f = new File("E:\\Download\\새 폴더 (2)\\무료와이파이정보.csv");
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		
		String k20_readtxt;
		
		if ((k20_readtxt = k20_br.readLine()) == null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		String[] k20_field_name = k20_readtxt.split(",");
		
		double k20_lat = 37.3860521;
		double k20_lng = 127.1214038;
		
		int k20_LineCnt = 1;
		while ((k20_readtxt = k20_br.readLine()) != null) {
			
			String[] k20_field = k20_readtxt.split(",");
			System.out.printf("**[%d번째 항목]*************\n", k20_LineCnt);
			System.out.printf(" %s : %s\n", k20_field_name[9], k20_field[9]);
			System.out.printf(" %s : %s\n", k20_field_name[13], k20_field[13]);
			System.out.printf(" %s : %s\n", k20_field_name[14], k20_field[14]);
			double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[13]) - k20_lat, 2)
					+ Math.pow( Double.parseDouble(k20_field[14]) - k20_lng, 2));
			System.out.printf(" 현재지점과 거리 : %f\n", k20_dist);
			System.out.printf("*****************************\n");
			
			k20_LineCnt++;
		}
		k20_br.close();
	}
}
