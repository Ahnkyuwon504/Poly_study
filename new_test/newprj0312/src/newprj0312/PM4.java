package newprj0312;

import java.io.File;

public class PM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\robocode\\compilers");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
