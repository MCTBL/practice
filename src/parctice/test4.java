package parctice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class test4 {
	

	static BufferedInputStream in;
//	BufferedReader br;
//	static String tempS="";
	static byte temp[]=new byte[1024];
	static int no;

	static BufferedOutputStream out;
//	BufferedReader br;
	String tempS;
	static char temp1[];
	static byte temp2[];
	static Scanner sc;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File a=new File("a.txt");
		a.createNewFile();
//		in=new BufferedInputStream(new FileInputStream(a));
//		while((no=in.read(temp))!=-1){
//			tempS=tempS+new String(temp,0,no);
//		}
//		System.out.println(tempS);
//		tempS="";
		sc=new Scanner(System.in);
		out=new BufferedOutputStream(new FileOutputStream(a));
		temp1=sc.nextLine().toCharArray();
		temp2=new byte[temp1.length];
		for(int i=0;i<temp1.length;i++) {
			temp2[i]=(byte) temp1[i];
		}
		
		out.write(temp2);
		out.flush();
		
	}

}
