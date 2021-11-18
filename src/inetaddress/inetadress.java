package inetaddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetadress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ia=InetAddress.getLocalHost();
		System.out.println(ia);
		InetAddress zz=InetAddress.getByAddress("[172.24.169.173]", null);
	}

}
