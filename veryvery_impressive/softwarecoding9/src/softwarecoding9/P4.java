package softwarecoding9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P4 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 9�� : XML, JSON
	// 4. ���� ������
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, ParserConfigurationException, SAXException {
		// DocumentBuilder ��ü ����
		DocumentBuilder k20_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// �� document ��ü�� ������ �����.
		Document k20_doc = k20_docBuilder.parse(new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\9\\���������ǽ�.txt"));
		// root �±׸� ����������, ������ ���� ����.
		Element k20_root = k20_doc.getDocumentElement();
		// data �±׸� ã�´�.
		// �� tag_001�� �츮�� ���ϴ� �����͸� ������ �ִ� �ϳ��� �л��̶�� 
		// ���� �ȴ�. �� ���� �����...
		NodeList k20_tag_001 = k20_doc.getElementsByTagName("data");
		// data �±װ� ���� �� �ִµ� �ϳ��� �����Ͽ� 
		// Attribute�� seq�� ã��, �װ��� ���� nodevalue�� ã�´�.
		String k20_seq="";	 // 48�ð� �� �� ��°���� ����Ŵ.
		String k20_hour="";  // ���׿��� 3�ð� ����
		String k20_day="";	 // 1��° �� ( 0: ����, 1: ����, 2: ��)
		String k20_temp="";	 // ���� �ð� �µ�
		String k20_tmx="";	 // �ְ� �µ�
		String k20_tmn="";	 // ���� �µ�
		String k20_sky="";	 // �ϴ� �����ڵ� (1: ����, 2: ��������, 3:��������, 4:�帲)
		String k20_pty="";	 // ���� �����ڵ� (0:����, 1:��, 2:��/��, 3:��/��, 4:��)
		String k20_wfKor=""; // ���� �ѱ���
		String k20_wfEn="";	 // ���� ����
		String k20_pop="";	 // ���� Ȯ��%
		String k20_r12="";	 // 12�ð� ���� ������
		String k20_s12="";	 // 12�ð� ���� ������
		String k20_ws="";	 // ǳ��(m/s)
		String k20_wd="";	 // ǳ�� (0~7:��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k20_wdKor=""; // ǳ�� �ѱ���
		String k20_wdEn="";	 // ǳ�� ����
		String k20_reh="";	 // ���� %
		String k20_r06="";	 // 6�ð� ���� ������
		String k20_s06="";	 // 6�ð� ���� ������
		
		System.out.printf("���� ��Ҵ� ���ʴ��\n48�ð� �� ����/�ð�/��¥/���� �ð� �µ�/�ְ� �µ�/���� �µ�"
				+ "/\n�ϴ� ����/���� ����/����(�ѱ���)/����(����)/���� Ȯ��"
				+ "/12�ð� ���󰭼���/12�ð� ����������/\nǳ��/ǳ��/"
				+ "ǳ��(�ѱ���)/ǳ��(����)/����/6�ð� ���󰭼���/6�ð� ����������\n�Դϴ�.\n");
		// ���� ��ҿ� ���� ������ ���ش�.
		System.out.printf("\nseq/hour/day/temp/tmx   /tmn   /sky/pty/wfKor     /"
				+ "wfEn         "
				+ "/pop/r12/s12/ws                  /wd/"
				+ "wdKor/wdEn /reh/r06/s06\n");
		// ���� ��� ���� ���. �̰��� �������� ������ �ľ��Ұ���.
		for (int k20_i = 0; k20_i < k20_tag_001.getLength(); k20_i++) {
			Element k20_elmt = (Element)k20_tag_001.item(k20_i);
			// �ᱹ data seq = "0", data seq = "1"�� ���� 0, 1, 2, 3 ���� ���´�.
			k20_seq = k20_tag_001.item(k20_i).getAttributes().getNamedItem("seq").getNodeValue(); // ����
			// ���� data �±׷� ã���� tag_001 �������� hour�� ã��
			// �װ��� ��尪�� �����ش�.
			k20_hour = k20_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // �ð�
			k20_day = k20_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); // ��¥
			k20_temp = k20_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); // ���� �ð� �µ�
			k20_tmx = k20_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); // �ְ� �µ�
			k20_tmn = k20_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); // ���� �µ�
			k20_sky = k20_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); // �ϴ� ����
			k20_pty = k20_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); // ���� ����
			k20_wfKor = k20_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); // ����(�ѱ���)
			k20_wfEn = k20_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); // ����(����)
			k20_pop = k20_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); // ���� Ȯ��
			k20_r12 = k20_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); // 12�ð� ���󰭼���
			k20_s12 = k20_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); // 12�ð� ����������
			k20_ws = k20_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); // ǳ��
			k20_wd = k20_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); // ǳ��
			k20_wdKor = k20_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); // ǳ��(�ѱ���)
			k20_wdEn = k20_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); // ǳ��(����
			k20_reh = k20_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); // ����
			k20_r06 = k20_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); // 6�ð� ���󰭼���
			k20_s06 = k20_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); // 6�ð� ����������
			
			// �ٸ��߸鼭 ����Ʈ
			System.out.printf("%-3s/%-4s/%-3s/%-4s/%-6s/"
					+ "%-6s/%-3s/%-3s/%s/%-13s"
					+ "/%-3s/%-3s/%-3s/%-20s/%-2s/"
					+ "%s/%-5s/%-3s/%-3s/%-3s\n", 
					k20_seq, k20_hour, k20_day, k20_temp, k20_tmx, 
					k20_tmn, k20_sky, k20_pty, k20_cut(k20_wfKor, 10), k20_wfEn,
					k20_pop, k20_r12, k20_s12, k20_ws, k20_wd, 
					k20_cut(k20_wdKor, 5), k20_wdEn, k20_reh, k20_r06, k20_s06);

		}
	}
	
	// ���ڿ� ũ�� �����ִ� �޼ҵ�. �ѱ��� ���� Stirng�� ����Ͽ���.
	public static String k20_cut(String k20_str, int k20_len) {

		if (k20_str.getBytes().length <= k20_len) {
			int k20_blank = (k20_len) - k20_str.getBytes().length;
			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_str += " ";
			}
			return k20_str;
		} else {
			StringBuffer k20_sbStr = new StringBuffer(k20_len);
			int k20_cnt = 0;
			for (char k20_ch : k20_str.toCharArray()) {
				k20_cnt += String.valueOf(k20_ch).getBytes().length;
				if (k20_cnt > k20_len)
					break;
				k20_sbStr.append(k20_ch);
			}
			String k20_text = k20_sbStr.toString();
			int k20_blank = k20_len - k20_text.getBytes().length;

			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_text += " ";
			}
			return k20_text;
		}
	}
}
