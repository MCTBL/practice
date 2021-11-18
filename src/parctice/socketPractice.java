package parctice;

import java.io.*;
import java.net.*;

public class socketPractice{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(9999);
		Socket link=ss.accept();
		BufferedInputStream bis=new BufferedInputStream(link.getInputStream());
		byte temp[] = new byte[1024];
		int t=0;
		while((t=bis.read(temp))!=-1) {
			System.out.println(new String(temp,0,t));
		}
		
		
		
	}
	
}
