package softwarecoding8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {

	public static void main(String[] args) {
		try {
			File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest.txt");
			FileWriter k20_fw = new FileWriter(k20_f);
			FileReader k20_fr = new FileReader(k20_f);
			
			k20_fw.write("¾È³ç ÆÄÀÏ\n");
			k20_fw.write("hello Çï·Î\n");
			
			k20_fw.close();
			
			int k20_n = -1;
			char [] k20_ch;
			
			while(true) {
				k20_ch = new char[100];
				k20_n = k20_fr.read(k20_ch);
				
				if (k20_n == -1) break;
				
				for (int k20_i = 0; k20_i < k20_n; k20_i++) {
				// for (char c : ch) {
					System.out.printf("%c", k20_ch[k20_i]);
				}
			}
			
			k20_fr.close();
			
			System.out.printf("\n FILE READ END!");
		} catch (Exception k20_e) {
			System.out.printf("³ª ¿¡·¯[%s]\n", k20_e);
		}
	}
}
