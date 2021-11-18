package parctice;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input=new Scanner(System.in);
//		
//		String test="\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}";
////		System.out.println(test);
//		String temp=null;
////		do {
//			
////		}while(!temp.matches(test));
//		while(true) {
//			temp=input.nextLine();
//			System.out.println(temp.matches(test));
//			
//		}
		String test1="桃子：5元，栗子：4元",regex="\\D+";
		String x[]=test1.split(regex);
		for(String q:x) {
			System.out.println(q);
		}
		
		
	}

}
