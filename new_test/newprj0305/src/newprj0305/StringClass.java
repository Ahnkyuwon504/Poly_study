package newprj0305;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi,3";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		
		char[] c = text.toCharArray();   /// array
		System.out.println(c[0]);    /// c[5] = �޸�   c[10] = ����  c[8] ������
		
		System.out.println(text.replace("H", "h"));   // �������� �ϸ� ������
		
		String[] t = text.split(",");
		System.out.println(t[0]);   // , ��������ù��°��
		System.out.println(t[1]);   // , �������� �ι�°��
		System.out.println(t[2]);   // , �������� ����°��
	}
}
