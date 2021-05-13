package newprj0312;

import java.io.File;

public class PM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\robocode\\compilers\\jkjk");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());

	}

}
