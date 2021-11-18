package parctice;

import java.util.Scanner;

public class ≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a[]=new int[10];
		for(int m=0;m<10;m++) {
			a[m]=x.nextInt();
		}
		//int a[]= {10,-5,4,-66,90,10000,99,655,-400};
		int N=a.length;
			for(int f=0;N>f;f++) {
			for(int s=f+1;N>s;s++) {
				if(a[f]>a[s]) {
					int q=a[f],w=a[s];
					a[s]=q;
					a[f]=w;
					for(int p=0;p<a.length;p++) {
						System.out.print(a[p]+",");
					}
					System.out.println();
				}  
			}
		}
		x.close();
	}

}
