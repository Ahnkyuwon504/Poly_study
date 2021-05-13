package softwarecoding9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class P1 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 9�� : XML, JSON
	// 1. XML �Ľ� �⺻
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// DocumentBuilder ��ü ����
		DocumentBuilder k20_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// Document k20_doc ��ü ����. ������ ��δ� Ʈ���̽� ������� ������ ��ϵ� txt ����
		// �� document ��ü�� ������ �����.
		Document k20_doc = k20_docBuilder.parse(new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\9\\score.txt"));
		// root �±׸� ����������, ������ ���� ����.
		Element k20_root = k20_doc.getDocumentElement();
		NodeList k20_tag_name = k20_doc.getElementsByTagName("name"); // �±� �� name �̸��� ���� ���� List�� �Ǿ���.
		NodeList k20_tag_studentid = k20_doc.getElementsByTagName("studentid"); // �±� �� studentid �� ���� ���� List
		NodeList k20_tag_kor = k20_doc.getElementsByTagName("kor"); // �±� �� kor �� ���� ���� List
		NodeList k20_tag_eng = k20_doc.getElementsByTagName("eng"); // �±� �� eng �� ���� ���� List
		NodeList k20_tag_mat = k20_doc.getElementsByTagName("mat"); // �±� �� mat �� ���� ���� List
		// ù ���� ����.
		System.out.printf("********************************************\n");
		// for���� i�� 0���� name �̸� ���� ����� List�� length��ŭ �ǽõ�.
		// ��� name�� �ƴ϶� studentid, kor, eng, mat ���� ��� ����. ������ ũ�⸦ �������ִ�.
		for (int k20_i = 0; k20_i < k20_tag_name.getLength(); k20_i++) {
			// �̸� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("�̸� : %s\n", k20_tag_name.item(k20_i).getFirstChild().getNodeValue());
			// �̸� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("�й� : %s\n", k20_tag_studentid.item(k20_i).getFirstChild().getNodeValue());
			// �й� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("���� : %s\n", k20_tag_kor.item(k20_i).getFirstChild().getNodeValue());
			// ����� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("���� : %s\n", k20_tag_eng.item(k20_i).getFirstChild().getNodeValue());
			// ����� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("���� : %s\n", k20_tag_mat.item(k20_i).getFirstChild().getNodeValue());
			// ���м��� ���, List���� index ��°�� ������ getFirstChild, getNodeValue...�̰� ������ �׳� �ܿ���.
			System.out.printf("********************************************\n"); // �� �л����� ���н����� ��
		}
	}
}
