package newprj0415;

import java.util.ArrayList;

public class Study1 {

	public static void main(String[] args) {
		ArrayList <Student_Info_Structure> stuInfoArray = new ArrayList <Student_Info_Structure> ();
		Student_Info_Structure stuInfo = null;
		
		for (int i = 0; i < 10; i++) {
			stuInfo = new Student_Info_Structure();
			stuInfo.setName("�ȱԿ�" + i);
			stuInfo.setId(2021103420 + i);
			stuInfo.setBirth(1995 + i);
			
			stuInfoArray.add(stuInfo);
		}
		
		for (int i = 0; i < 10; i++) {
			Student_Info_Structure info = stuInfoArray.get(i);
			System.out.println(info.getName() + info.getId());
		}
		
		
		
		/*
		stuInfo = new Student_Info_Structure();
		stuInfo.name = "�ȱԿ�";
		stuInfo.id = 2021341020;
		stuInfo.birth = 951124;
		stuInfo.address = "��⵵ ������ �д籸 Ȳ����� 307, �Ѷ�ñ׸���ũ 419ȣ";
		stuInfo.score = 3.8;
		stuInfo.bloodType = 'O';
		
		stuInfoArray.add(stuInfo);
		
		stuInfo = new Student_Info_Structure(); // ������ ���������ϱ� ! ���� ��ü������ �ϰ� �ٽ� �����ϸ� ��..
		stuInfo.name = "�ȱԿ�";
		stuInfo.id = 2021341020;
		stuInfo.birth = 951124;
		stuInfo.address = "��⵵ ������ �д籸 Ȳ����� 307, �Ѷ�ñ׸���ũ 419ȣ";
		stuInfo.score = 3.8;
		stuInfo.bloodType = 'O';
		stuInfoArray.add(stuInfo);
		*/


		/*
		Student_Info_Structure stuInfo2 = new Student_Info_Structure();
		stuInfo2.name = "�ȱ�";
		stuInfo2.id = 2021;
		stuInfo2.birth = 90;
		stuInfo2.address = "��⵵ ������ �д籸 Ȳ����� 307, �Ѷ�ñ׸���ũ 419ȣ";
		stuInfo2.score = 4.5;
		stuInfo2.bloodType = 'O';
		*/

	}

}
