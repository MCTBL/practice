package parctice;

import java.io.*;
import java.util.Scanner;

public class test10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file="";
		Scanner sc=new Scanner(System.in);
		file=sc.nextLine();
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("11.jpg"));
		
		
		
		bos.write(bis.readAllBytes());
		bos.flush();
		
		
		
		
		
		bos.close();
		bis.close();
	}

}
