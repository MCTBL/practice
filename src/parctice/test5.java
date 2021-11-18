package parctice;

import java.io.*;

public class test5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		BufferedReader bw=new BufferedReader(new FileReader("a.txt"));
//		while(bw.readLine()!=null) {
//			i++;
//		}
//		System.out.println(i);
		String temp=bw.readLine();
		String temp1[]=temp.split(" ");
		String temp2[]=new String[5];
		String temp3[];
		for(;i<5;i++) {
			temp3=temp1[i].split("£º");
			temp2[i]=temp3[1];
			
		}
		for(String z:temp2) {
			System.out.println(z);
		}
	}

}
