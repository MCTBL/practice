package recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		long x=System.nanoTime();
		int i=sc.nextInt();
		for(int temp=1;temp<=i;temp++) {
			System.out.print(Fib.speak(temp)+" ");
		}
//		long y=System.nanoTime();
//		System.out.print("\nºÄÊ±"+(y-x)/1E9);
	}

}

class Fib{
	static long speak(int no) {
		if(no==1||no==2) {
			return 1;
		}else {
			return speak(no-1)+speak(no-2);
		}
	}
}