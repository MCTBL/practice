/**
 * 
 */
package mariao;

import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		Coor a=new Coor();
		int z;
		a.Print();
		do {
			z=x.nextInt();
			a.Move(z);
			a.Print();
		}while(a.PanDuan()==true);
		x.close();
	}

}
