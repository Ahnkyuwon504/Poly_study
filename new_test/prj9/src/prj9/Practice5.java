package prj9;

import java.io.File;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\¾È±Ô¿ø\\Desktop\\jk\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());

	}

}
