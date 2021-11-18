package parctice;

import java.util.Scanner;

public class 切换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int c = a.nextInt();
		switch(c) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		}
		a.close();
	}

}
//记得要break
//switch主要用byte,short,int,char,enum