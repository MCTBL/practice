package parctice;

import java.util.Scanner;

public class Pascal_Triangle {

	public static int[] Line(int line) {
		if(line==1) {
			int a[]= {1};
			return a;
		}
		int temp[]=Line(line-1);
		int a[]=new int[line];a[0]=1;a[line-1]=1;
		for(int i=0;i<temp.length-1;i++) {
			a[i+1]=temp[i]+temp[i+1];
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inPut=new Scanner(System.in);
		int line=inPut.nextInt();
		for(int a:Line(line)) {
			System.out.print(a+" ");
		}
		inPut.close();
	}

}
