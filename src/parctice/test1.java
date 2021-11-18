package parctice;

//import java.util.*;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; i < 1000; i += 2) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (!b) {
				continue;
			}
			System.out.print(" " + i);
			c++;
			if (c % 10 == 0) {
				System.out.println("\n");
			}
		}
	}

	public boolean prime(int p) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("输入一个数");
			int p1 = scanner.nextInt();
			if (p1 == 2) {
				System.out.println("是素数");
			}
			int i = 2;
			for (i = 2; i < p; i++) {
				if (p1 % i == 0) {
					System.out.println(p1 + "不是素数");
					break;
				}
			}
			if (i == p) {
				System.out.println(p + "是素数");
			}
		}

	}
}
