package softwarecoding6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P1 {
   ///////////////////////////////////////////////////////////////////////
   // ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
   // 1. ������ �޼ҵ� - 5�� ��������� 3�� �ǽ� �и�����
   //
   // 2021. 04. 28. (��)
   // 2125341020 �ȱԿ�
   ///////////////////////////////////////////////////////////////////////
   static String[] k20_name_Array = new String[] { "aaaaaaaa���� a���ں��������ں��������ں��������ں��������ں�",
         "�ڹٴ��ְ����й��ڹٴ��ְ����й��ڹٴ��ְ����й��ڹٴ��ְ����й��ڹٴ��ְ����й��ڹٴ��ְ����й�", "@#%@#%@%#@%#$", "�� ����", "��aaa ���", "Ȩ������ �߱��忡��",
         "���̽�Ŀ��", "����Ĩ", "������ �ٵ�Ծ�", "������ ����", "������ Ȳ��", "����", "���� �̴�������", "�ղ�Ʋ�̾ȿ�ŷ��ļļļļ", "�̴Ͻ��̴Ϲ̴�", "¯ �ſ�", "�ʺ���",
         "���̼Ҵ������ٱ׷�����", "ī��", "��� ��԰���̼�", "����� ���ڼ���", "��� ����", "��� ���̰������", "������", "�ִϾ�縻", "���̸�", "���󿡸�",
         "���ڸ� �������ֳ�", "����� ���ּ����", "īī�������¥����", "�� ��" };
   // �̸� String Array
   static boolean[] k20_tax_Array = new boolean[] { true, true, true, true, true, true, false, false, true, true, true,
         true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true,
         true, false, true };
   // �鼼���� boolean Array
   static int[] k20_price_Array = new int[] { 
         3000, 1000000, 800000, 20000, 10000, 2500, 3000, 2200, 1800, 3800, 5200, 1800, 4000, 4400, 3800, 13200,
         3800, 2700, 200, 300, 3400, 180, 8800, 11000, 500, 4802, 800, 900, 1300, 643, 90000 };
   // ���� integer Array
   static int[] k20_how_Many_Array = new int[] {
         1, 1, 1, 2, 5, 6, 7, 8, 1, 5, 13, 14, 5, 6, 3, 1, 3, 5, 10, 6, 8, 8, 6, 5, 8, 10, 12, 14, 60, 80, 1 };
   // ���� integer Array
   static int[] k20_total_Price_Array; // ǰ��� �Ѿ� integer Array
   static int k20_price_Of_TaxFree; // �鼼��ǰ ���� integer
   static int k20_price_Of_Tax; // ������ǰ ���� integer
   static double k20_tax; // ����
   static int k20_realPrice_Tax; // ������ǰ ����
   static int k20_howMuch_tax; // ������ǰ�� ���� ����
   static int k20_price_Total; // �Ѿ�, �ᱹ ������ �ݾ�

   public static void main(String[] args) {
      int k20_itemCount = 31; // ���� ������ �� ����. ��� ��ǰ�� ���� ������ ����� ��.
      k20_UpdateTax_Price(k20_itemCount); // ������ ���� �Ѿ��� �޶����Ƿ� Update �޼ҵ�

      k20_TitlePrint(); // ������ ���� Ÿ��Ʋ �μ� �޼ҵ�
      k20_TimeStamp(); // ��½ð� �μ� �޼ҵ�
      k20_HeaderPrint(); // ���(��ǰ��, �ܰ�, ����, �ݾ�)�μ�
      // �� ������ �޼ҵ�� k20_itemCount�� ������� ����.

      // �Է��� ������ŭ for�� �ǽ�
      for (int k20_i = 0; k20_i < k20_itemCount; k20_i++) {
         // index�� ���ڷ� �޾ư��� ItemPrint�޼ҵ� �ǽ�
         ItemPrint(k20_i);
         // 5ǰ�񸶴� �������� �� �μ�
      }
      // �հ�, ���� �� �ϴ� ��� �μ�, �� ���� �Է��� ������ ��������Ƿ�
      // parameter�� �޾ư���.
      TotalPrint(k20_itemCount);
   }

   // ����ϰ� ���� ������ parameter�� ����
   public static void k20_UpdateTax_Price(int N) {
      for (int k20_i = 0; k20_i < k20_name_Array.length; k20_i++) {
         k20_name_Array[k20_i] = k20_cut(k20_name_Array[k20_i], 17);
      }
      // ������ ��ǰ�� �鼼��ǰ�̶�� false���� boolean�� ������, �� �տ� *�� ���̴� �޼ҵ�
      for (int k20_i = 0; k20_i < k20_name_Array.length; k20_i++) { // String Array�� ������ŭ for�� �ǽ�
         if (k20_tax_Array[k20_i] == false) { // ���� �鼼��ǰ�̶��
            k20_name_Array[k20_i] = "*" + k20_name_Array[k20_i]; // �տ� *�� �ٿ� �����Ѵ�.
         } else {
            k20_name_Array[k20_i] = " " + k20_name_Array[k20_i];
         }
      }
      // ���� ��ǰ�� ������ ������ Integer Array

      k20_total_Price_Array = new int[N];
      // integer array�� ���Ҹ� �������ش�.
      for (int i = 0; i < N; i++) { // ��ǰ ������ŭ for�� �ǽ�
         k20_total_Price_Array[i] = k20_price_Array[i] * k20_how_Many_Array[i]; // ���� ��ǰ�� ����*������ ��������
      } // ���ҷ� ����.
      k20_price_Of_TaxFree = 0; // �鼼��ǰ�� ���� ����
      k20_price_Of_Tax = 0; // ������ǰ�� ���� ����
      for (int i = 0; i < N; i++) { // ���� ��ǰ�� ������ŭ for�� �ǽ�
         if (k20_tax_Array[i] == false) { // ���� �鼼��ǰ�̶��
            k20_price_Of_TaxFree += k20_price_Array[i] * k20_how_Many_Array[i]; // �鼼��ǰ �Ѿ׿� ��������
         } else { // ���� ������ǰ�̶��
            k20_price_Of_Tax += k20_price_Array[i] * k20_how_Many_Array[i]; // ������ǰ �Ѿ׿� ��������
         }
      }
      k20_tax = 0.1; // ���� �����Ͽ� 10�ۼ�Ʈ
      k20_realPrice_Tax = (int) (k20_price_Of_Tax / (k20_tax + 1)); // ������ �ø����ְ�
      k20_howMuch_tax = (int) Math.ceil(k20_price_Of_Tax * k20_tax / (k20_tax + 1)); // ������ 1������ �����Ѵ�
      k20_price_Total = k20_price_Of_TaxFree + k20_price_Of_Tax; // ��ǰ�� �Ѿ��� �鼼���� + �������� �Ѿ�
   }

   // ���� Ÿ��Ʋ �μ� �޼ҵ�
   public static void k20_TitlePrint() {
      System.out.printf("\n\nemart        �̸�Ʈ ������ (031)888-1234\n"); // �ؽ�Ʈ ���
      // �� �տ� �� �� ��� �����ν� �б� ������.
      System.out.printf("             206-86-50913 ����\n"); // �ؽ�Ʈ ���
      System.out.printf("             ���� ������ ������� 552\n"); // �ؽ�Ʈ ���
      System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n"); // �ؽ�Ʈ ���
      System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n"); // �ؽ�Ʈ ���
      System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n"); // �ؽ�Ʈ ���
      System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n"); // �ؽ�Ʈ ���
   }

   // ��½ð� �μ� �޼ҵ�
   public static void k20_TimeStamp() {
      Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ���
      SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ����ð� ��� ����
      SimpleDateFormat k20_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ����ð� ��� ����

      System.out.printf("[�� ��]%s     POS:0011-9861\n", k20_sdt.format(k20_cal.getTime()));
      // ����ð� ���. �������´� k20_sdt Ȱ��
   }

   // ��� �μ� �޼ҵ�
   public static void k20_HeaderPrint() {
      System.out.printf("-----------------------------------------\n"); // �� ���. ���� ���۵�.
      System.out.printf(" ��ǰ��               �� �� ����    �� ��\n"); // ��ǰ��/�ܰ�/����/�ݾ�
      System.out.printf("-----------------------------------------\n");
   }

   // �հ� �μ� �޼ҵ�
   public static void TotalPrint(int n) {
      DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // ��ǥ�� ������ ���� import
      Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ���
      SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ����ð� ��� ����
      SimpleDateFormat k20_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

      System.out.printf("\n"); // �� �ѱ�� �ٽ� ����
      System.out.printf("%24s%12d\n", "��  ǰ��  ����", n); // �� ǰ�� ������ ��ǰ������
      System.out.printf("%25s%12s\n", "(*)��  ��  ��  ǰ", k20_df.format(k20_price_Of_TaxFree));
      // �鼼��ǰ : �鼼��ǰ�� �Ѿ� �հ�
      System.out.printf("%25s%12s\n", "��  ��  ��  ǰ", k20_df.format(k20_realPrice_Tax));
      // ������ǰ : ������ǰ�� ���� �Ѿ� �հ�
      System.out.printf("%26s%12s\n", "��    ��    ��", k20_df.format(k20_howMuch_tax));
      // �ΰ��� : ������ǰ�� ���� �հ�
      System.out.printf("%27s%12s\n", "��          ��", k20_df.format(k20_price_Total));
      // �հ� : ������ �Ѿ�
      System.out.printf("%s%24s\n", "�� �� �� �� �� ��", k20_df.format(k20_price_Total));
      // �������ݾ� : �հ�� ����
      System.out.printf("-----------------------------------------\n"); // �� ���
      System.out.printf("0012 KEB �ϳ�  %26s\n", "541707**0484/35860658"); // �ؽ�Ʈ ���
      System.out.printf("ī�����(IC)         %s%11s\n", "�Ͻú� / ", k20_df.format(k20_price_Total)); // �ؽ�Ʈ ���
      System.out.printf("-----------------------------------------\n"); // �� ���
      System.out.printf("           [�ż�������Ʈ ����]\n"); // �ؽ�Ʈ ���
      System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n"); // �ؽ�Ʈ ���
      System.out.printf("��ȸ�߻�����Ʈ        9350**9995      164\n"); // �ؽ�Ʈ ���
      System.out.printf("����(����)����Ʈ          5,637(   5,473)\n"); // �ؽ�Ʈ ���
      System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n"); // �ؽ�Ʈ ���
      System.out.printf("-----------------------------------------\n"); // �� ���
      System.out.printf("    ���űݾױ��� ���������ð� �ڵ��ο�\n"); // �ؽ�Ʈ ���
      System.out.printf("������ȣ : %29s\n", "34��****"); // �ؽ�Ʈ ���
      System.out.printf("�����ð� : %30s\n", k20_sdt2.format(k20_cal.getTime())); // ����ð� ���
      System.out.printf("-----------------------------------------\n"); // �� ���
      System.out.printf("ĳ��:084599 ��00 %25s", "1150\n"); // �ؽ�Ʈ ���
      System.out.printf("  lliliililililillilililiililiilililili\n"); // ���ڵ� ���
      System.out.printf("      20210423/00119861/00164980/31\n"); // ������ ������
   }

   // ���� �׸� ���� �μ� �޼ҵ�
   public static void ItemPrint(int n) {

      DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // ��ǥ�� ������ ���� import
      Calendar k20_cal = Calendar.getInstance(); // Calendar import�Ͽ� ����ð� ���
      SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ����ð� ��� ����
      SimpleDateFormat k20_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ����ð� ��� ����

      System.out.printf("%s%10s%3s%10s\n", // �� ��ǰ�� ��¹������� ������ �����ֱ� �����̴�.
            // ���� ��ǰ���� �� ��� 8ĭ���� �߶������ ���� .8�� ����.
            // -14�� 14ĭ ���� ���� �� �տ������� ���� �����Ѵٴ� �ǹ�. ���̳ʽ� ������ ������ ����.
            k20_name_Array[n], k20_df.format(k20_price_Array[n]), // ��ǰ��, ���� ���. ��ǥ�����.
            k20_how_Many_Array[n], k20_df.format(k20_total_Price_Array[n])); // ����, �Ѿ� ���.
      if (n % 5 == 4) {
          System.out.printf("-----------------------------------------\n");
       }
   }

   // ���� �߶��ִ� �޼ҵ�
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
