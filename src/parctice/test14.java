package parctice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test14 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		String ip=InetAddress.getLocalHost().getHostAddress();
		System.out.println(ip);
	}

}
