package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 2. Buffered �а� ����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void k20_FileWrite() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		// �Ʊ�� char Array�� �����Ͽ� �ű⿡ ���� �� �о�����,
		// �̹����� ���۸� ������ ���� ���̴�.
		BufferedWriter k20_bw = new BufferedWriter(new FileWriter(k20_f));
		// �� ����Ʈ���� ������� ���۰� �˾Ƽ� �о��� ���̴�.
		k20_bw.write("�ȳ� ����"); // �ȳ� �����̶�� String �Է�
		k20_bw.newLine();		   // ���ο� ������ ã���ְ�
		k20_bw.write("hello ���");// �ٽ� hello ��ζ�� String �Է�
		k20_bw.newLine();		   // �Ǵٽ� ���ο� ������ ã���ش�.
		
		k20_bw.close();	// ����������, �Է�Ȱ���� ������
		// �ݵ�� close�� �ؾ���. close ���ϸ� ��� ������ ���� �ֱ� ������
		// ������ ���� ���� ���α׷����� ���� ����. ����ȭ ����...
	}
	
	public static void k20_FileRead() throws IOException {
		File k20_f = new File("C:\\Users\\user\\Desktop\\Mytest2.txt");
		// ���������� ���۸� ����� ����.
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// ������ �б� ���� String�� ��������.
		String k20_readtxt; // �� String�� ���ۿ��� �о���� data�� 
		// �� �� �� �� ���� ����.
		while((k20_readtxt = k20_br.readLine()) != null) {
		// data�� �о���� ���ǹ��� ���̻� ���� ���� ���
		// String�� ���� null�� �� ������ �ǽõ� ����.
			System.out.printf("%s\n", k20_readtxt);
		// �� �� �� �� ���� ������ �ٷ� ���
		}
		k20_br.close();
		// ���� ���Ȱ���� ������ �ݵ�� close.
	}

	public static void main(String[] args) throws IOException {
		k20_FileWrite(); // ������ ���� Write����� �޼ҵ� ȣ��.
		// static�̱� ������ ������ ��ü ���� ���� ȣ�� ����
		k20_FileRead(); // ������ ���� Read����� �޼ҵ� ȣ��.
		// static�̱� ������ ������ ��ü ���� ���� ȣ�� ����
	}
}
