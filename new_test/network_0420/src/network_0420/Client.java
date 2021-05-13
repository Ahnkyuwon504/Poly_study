package network_0420;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s1;
			InputStream is1;
			DataInputStream is2;
			OutputStream os1;
			DataOutputStream os2;
			
			String sendString = "준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석준석준석혁규혁규준석준성준석규석규석혁규규석준석규석";
			s1 = new Socket("192.168.23.15", 555);
			is1 = s1.getInputStream();
			is2 = new DataInputStream(is1);
			String st = new String(is2.readUTF());
			System.out.println(st);
			
			os1 = s1.getOutputStream();
			os2 = new DataOutputStream(os1);
			os2.writeUTF("<전송 시작>" + sendString + "<전송 마침>");
			
			os2.close();
			os1.close();
			is2.close();
			is1.close();
			s1.close();
		} catch (ConnectException ConnExc) {
			System.err.println("서버 연결 실패");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
