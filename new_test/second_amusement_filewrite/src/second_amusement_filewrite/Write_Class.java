package second_amusement_filewrite;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Write_Class {
	SimpleDateFormat sdt = null;
	Calendar cal = null;

	public Write_Class() throws IOException {
		sdt = new SimpleDateFormat("YYYYMMdd");
		cal = Calendar.getInstance();
	}

	// ���ں� ����м� �޼ҵ�
	public void write_Sale_day(List<List<String>> all_Data) throws IOException {
		FileWriter fw = new FileWriter(ConstantValue_Class.REPORT1_FILE_LOCATION);
		String data = "";

		ArrayList<String> date = new ArrayList<String>(); // ���Ͽ� �����ϴ� ��¥ ��� ArrayList
		int[] sale_Of_date; // �� ArrayList�� ���� size�� ���������, ������ ����� Array
		// ��� ArrayList ������ ��¥����
		for (int i = 1; i < all_Data.size(); i++) {
			if (i == 1) { // ù��° ��¥�� ����������
				date.add(all_Data.get(1).get(0));
			} else { // �� ����¥�� �ٸ��� ����
				if (all_Data.get(i).get(0).equals(all_Data.get(i - 1).get(0))) {
				} else {
					date.add(all_Data.get(i).get(0));
				}
			}
		} // date�� ���� arrayList �ϼ�
		sale_Of_date = new int[date.size()]; // date�� size�� ���� ũ��� array ����

		// date���� �Ѹ����� array�� ����
		for (int i = 0; i < date.size(); i++) {
			for (int j = 0; j < all_Data.size(); j++) {
				if (date.get(i).equals(all_Data.get(j).get(0))) {
					sale_Of_date[i] += Integer.parseInt(all_Data.get(j).get(4)); // ��¥�� �հ谡 ������
				}
			}
		} // ��¥�� �Ѿ��� ���� array �ϼ�
		data += "����, �� ����\n";
		for (int i = 0; i < date.size(); i++) {
			data += date.get(i) + "," + sale_Of_date[i] + "\n";
		}
		fw.write(data);
		fw.close();
	}

	// �����׺� ����м� �޼ҵ�
	public void write_Age_DayNight(List<List<String>> all_Data) throws IOException {
		FileWriter fw = new FileWriter(ConstantValue_Class.REPORT2_FILE_LOCATION);
		String data = "";
		// �ְ���
		int sales_Baby_Day = 0; // �ְ��� ����
		int sales_Child_Day = 0; // �ְ��� ����
		int sales_Teen_Day = 0; // �ְ��� û�ҳ�
		int sales_Adult_Day = 0; // �ְ��� ����
		int sales_Old_Day = 0; // �ְ��� ���
		int sales_Day = 0; // �ְ��� ����
		// �߰���
		int sales_Baby_Night = 0; // �߰��� ����
		int sales_Child_Night = 0; // �߰��� ����
		int sales_Teen_Night = 0; // �߰��� û�ҳ�
		int sales_Adult_Night = 0; // �߰��� ����
		int sales_Old_Night = 0; // �߰��� ���
		int sales_Night = 0; // �߰��� ����
		// �Ѹ���
		int price_Day = 0; // �ְ��� �Ѹ���
		int price_Night = 0; // �߰��� �Ѹ���

		for (int i = 1; i < all_Data.size(); i++) {
			if (all_Data.get(i).get(1).equals("�ְ���")) { // �ְ��� count
				if (all_Data.get(i).get(2).equals("���")) {
					sales_Old_Day += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Adult_Day += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("û�ҳ�")) {
					sales_Teen_Day += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Child_Day += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Baby_Day += Integer.parseInt(all_Data.get(i).get(3));
				}
				// �ְ��� �Ѹ��� count
				price_Day += Integer.parseInt(all_Data.get(i).get(4));

			} else if (all_Data.get(i).get(1).equals("�߰���")) { // �߰��� count
				if (all_Data.get(i).get(2).equals("���")) {
					sales_Old_Night += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Adult_Night += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("û�ҳ�")) {
					sales_Teen_Night += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Child_Night += Integer.parseInt(all_Data.get(i).get(3));
				} else if (all_Data.get(i).get(2).equals("����")) {
					sales_Baby_Night += Integer.parseInt(all_Data.get(i).get(3));
				}
				// �߰��� �Ѹ���
				price_Night += Integer.parseInt(all_Data.get(i).get(4));
			}
		}
		// �־߰� ����
		sales_Day = sales_Old_Day + sales_Adult_Day + sales_Teen_Day + sales_Child_Day + sales_Baby_Day;
		sales_Night = sales_Old_Night + sales_Adult_Night + sales_Teen_Night + sales_Child_Night + sales_Baby_Night;

		data += "����,�ְ���,�߰���\n";
		data += "����," + sales_Baby_Day + "," + sales_Baby_Night + "\n";
		data += "���," + sales_Child_Day + "," + sales_Child_Night + "\n";
		data += "û�ҳ�," + sales_Teen_Day + "," + sales_Teen_Night + "\n";
		data += "�," + sales_Adult_Day + "," + sales_Adult_Night + "\n";
		data += "����," + sales_Old_Day + "," + sales_Old_Night + "\n";
		data += "�հ�," + sales_Day + "," + sales_Night + "\n";
		data += "����," + price_Day + "," + price_Night + "\n";

		fw.write(data);
		fw.close();
	}

}
