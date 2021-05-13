package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
	public static void k20_FileWrite() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		BufferedWriter k20_bw = new BufferedWriter(new FileWriter(k20_f));
		
		k20_bw.write("¾È³ç ÆÄÀÏ");
		k20_bw.newLine();
		k20_bw.write("hello Çï·Î");
		k20_bw.newLine();
		
		k20_bw.close();
	}
	
	public static void k20_FileRead() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		
		String k20_readtxt;
		
		while((k20_readtxt = k20_br.readLine()) != null) {
			System.out.printf("%s\n", k20_readtxt);
		}
		k20_br.close();
	}

	public static void main(String[] args) throws IOException {
		k20_FileWrite();
		k20_FileRead();
	}
}
