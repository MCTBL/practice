package parctice;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		String fileDic=z.nextLine(),fileName;
		fileName=fileDic.split("[\\\\]")[fileDic.split("[\\\\]").length-1];
		System.out.println(fileName);
		}
}

