package newprj0415;

import java.util.ArrayList;

public class Study1 {

	public static void main(String[] args) {
		ArrayList <Student_Info_Structure> stuInfoArray = new ArrayList <Student_Info_Structure> ();
		Student_Info_Structure stuInfo = null;
		
		for (int i = 0; i < 10; i++) {
			stuInfo = new Student_Info_Structure();
			stuInfo.setName("안규원" + i);
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
		stuInfo.name = "안규원";
		stuInfo.id = 2021341020;
		stuInfo.birth = 951124;
		stuInfo.address = "경기도 성남시 분당구 황새울로 307, 한라시그마파크 419호";
		stuInfo.score = 3.8;
		stuInfo.bloodType = 'O';
		
		stuInfoArray.add(stuInfo);
		
		stuInfo = new Student_Info_Structure(); // 어차피 저장했으니까 ! 새로 객체생성만 하고 다시 저장하면 됨..
		stuInfo.name = "안규원";
		stuInfo.id = 2021341020;
		stuInfo.birth = 951124;
		stuInfo.address = "경기도 성남시 분당구 황새울로 307, 한라시그마파크 419호";
		stuInfo.score = 3.8;
		stuInfo.bloodType = 'O';
		stuInfoArray.add(stuInfo);
		*/


		/*
		Student_Info_Structure stuInfo2 = new Student_Info_Structure();
		stuInfo2.name = "안규";
		stuInfo2.id = 2021;
		stuInfo2.birth = 90;
		stuInfo2.address = "경기도 성남시 분당구 황새울로 307, 한라시그마파크 419호";
		stuInfo2.score = 4.5;
		stuInfo2.bloodType = 'O';
		*/

	}

}
