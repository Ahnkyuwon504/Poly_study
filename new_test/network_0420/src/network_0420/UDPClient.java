package network_0420;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("192.168.23.22");
			byte[] bf = "아하하우헤헤아하우헤헤하아하우헤헤하아하우헤헤우헤헤우헤헤우헤헤우헤헤하아하하아하하아하하우헤헤우헤헤우헤헤우헤헤아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하아하하".getBytes();
			DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 1212);
			
			ds.send(dp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
