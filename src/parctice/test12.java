package parctice;

import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte a[]="ok".getBytes(),b[]=s.nextLine().getBytes(),c[]= {111,107};
		
		if(a[0]==b[0]&&a[1]==b[1]) {
			System.out.println("true");
		}
		
		
		for(byte z:a) {
			System.out.println(z);
			
		}
		for(byte z:c) {
			System.out.println(z);
		}
		
//		System.out.println("-----------------");
//		for(byte z:s.nextLine().getBytes()) {
//			System.out.println(z);
//		}
		
		
	}
}
