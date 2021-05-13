package newprj0308;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = "spider504@neaver.com";
		
		int index = mail.indexOf("e");
		System.out.println(index);
		
		String maila = mail.substring(0);
		System.out.println(maila);
		
		String mailb = mail.substring(index);
		System.out.println(mailb);
		
		String birth = "1995-11-24";
		String date[] = birth.split("-");
		
		System.out.println(date[0]);
		for (int i = 0; i < date.length; i++) {
			System.out.println(i + " date : " + date[i]);
		}
		
		
		

	}

}
