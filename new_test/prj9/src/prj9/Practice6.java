package prj9;

import java.io.File;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\�ȱԿ�\\Desktop");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
