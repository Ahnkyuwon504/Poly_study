package amuse_park_prj;

import java.util.ArrayList;
import java.util.List;

public class Output_Class {
	// Ƽ�� 1�� �������
	public void print_One_Charge(int charge) {
		System.out.printf("������ %d���Դϴ�.\n�����մϴ�.\n", charge);
	}

	// Ƽ�� �� ���� ���� ���
	public void print_Total_Charge(ArrayList<String> output_Tickets, int total_Price) {
		System.out.printf("====================== �������� =====================\n");
		for (int i = 0; i < output_Tickets.size(); i++) {
			System.out.println(output_Tickets.get(i));
		}
		System.out.println();
		System.out.println("����� �Ѿ��� " + total_Price + "�� �Դϴ�.");
		System.out.printf("=====================================================\n");
	}
	
	// csv���� ���� �״�� ��� �޼ҵ�
	public void print_Total_Sales_Day(List<List<String>> all_Data) {
		System.out.printf("\n====================report.csv=======================\n");
		// 20210414 - �ְ��� - ���� - 3 - 168000 - ������ ����
		System.out.printf("��¥      ����    ����   ����  ����      ������\n");
		for (int i = 1; i < all_Data.size(); i++) {
			System.out.printf("%-10s%-5s%-5s%-5s%-10s%-10s\n", all_Data.get(i).get(0), all_Data.get(i).get(1),
					all_Data.get(i).get(2), all_Data.get(i).get(3), all_Data.get(i).get(4), all_Data.get(i).get(5));
		}
		System.out.printf("=====================================================\n");
	}
	
	// ���� �� �Ǹ���Ȳ �޼ҵ�
	public void print_Total_Sales_DayNight(List<List<String>> all_Data) {
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
		sales_Night = sales_Old_Night + sales_Adult_Night
				+ sales_Teen_Night + sales_Child_Night + sales_Baby_Night;

		System.out.printf("\n===================���� �� �Ǹ���Ȳ===================\n");
		System.out.printf("�ְ��� �� %d��\n", sales_Day);
		System.out.printf("���� %d��, ���� %d��, û�ҳ� %d��, ���� %d��, ��� %d��\n",
				sales_Baby_Day, sales_Child_Day, sales_Teen_Day, sales_Adult_Day, sales_Old_Day);
		System.out.printf("�ְ��� �� ���� : %d��\n", price_Day);
		System.out.printf("�߰��� �� %d��\n", sales_Night);
		System.out.printf("���� %d��, ���� %d��, û�ҳ� %d��, ���� %d��, ��� %d��\n",
				sales_Baby_Night, sales_Child_Night, sales_Teen_Night, sales_Adult_Night, sales_Old_Night);
		System.out.printf("�߰��� �� ���� : %d��\n", price_Night);
		System.out.printf("=====================================================\n");
	}
	
	
	// ���ں� ���� ��Ȳ �޼ҵ�
	public void print_Total_Sales_OneDay(List<List<String>> all_Data) {
		ArrayList<String> date = new ArrayList<String>(); // ���Ͽ� �����ϴ� ��¥ ��� ArrayList
		int[] sale_Of_date; // �� ArrayList�� ���� size�� ���������, ������ ����� Array
		// ��� ArrayList ������ ��¥����
		for (int i = 1; i < all_Data.size(); i++) {
			if (i == 1) { // ù��° ��¥�� ����������
				date.add(all_Data.get(1).get(0));
			} else {	  // �� ����¥�� �ٸ��� ����
				if (all_Data.get(i).get(0).equals(all_Data.get(i-1).get(0))) {} 
				else {
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
		
		// date�� ���
		System.out.printf("\n==================���ں� ���� ��Ȳ====================\n");
		for (int i = 0; i < date.size(); i++) {
			System.out.printf("%s�� %s�� %s�� : �� ����   %d��\n",
					date.get(i).substring(0, 4), date.get(i).substring(4, 6), 
					date.get(i).substring(6, 8), sale_Of_date[i]);
		}
		System.out.printf("=====================================================\n");
	}
	
	
	// ���� �Ǹ� ��Ȳ �޼ҵ�
	public void print_Total_Treatment (List<List<String>> all_Data) {
		int howMany_Nothing = 0;
		int howMany_Dis = 0;
		int howMany_Nat = 0;
		int howMany_Mul = 0;
		int howMany_Pre = 0;
		int howMany_Total = 0;
		
		// �� ���� �������� ���ϱ�
		for (int i = 0; i < all_Data.size(); i++) {
			if (all_Data.get(i).get(5).equals("����")) {
				howMany_Nothing += Integer.parseInt(all_Data.get(i).get(3));
			} else if (all_Data.get(i).get(5).equals("�����")) {
				howMany_Dis += Integer.parseInt(all_Data.get(i).get(3));
			} else if (all_Data.get(i).get(5).equals("����������")) {
				howMany_Nat += Integer.parseInt(all_Data.get(i).get(3));
			} else if (all_Data.get(i).get(5).equals("���ڳ�")) {
				howMany_Mul += Integer.parseInt(all_Data.get(i).get(3));
			} else if (all_Data.get(i).get(5).equals("�ӻ��")) {
				howMany_Pre += Integer.parseInt(all_Data.get(i).get(3));
			}
		}
		
		// ���� ����
		howMany_Total = howMany_Nothing + howMany_Dis + howMany_Nat + howMany_Mul
				+ howMany_Pre;
		
		// ���
		System.out.printf("\n==================���� �Ǹ� ��Ȳ====================\n");
		System.out.printf("�� �Ǹ� Ƽ�ϼ�      : %2d��\n", howMany_Total);
		System.out.printf("������            : %2d��\n", howMany_Nothing);
		System.out.printf("�����              : %2d��\n", howMany_Dis);
		System.out.printf("����������          : %2d��\n", howMany_Nat);
		System.out.printf("���ڳ�              : %2d��\n", howMany_Mul);
		System.out.printf("�ӻ��              : %2d��\n", howMany_Pre);
		System.out.printf("=====================================================\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
