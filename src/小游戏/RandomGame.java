/**
 * 
 */
package С��Ϸ;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
@SuppressWarnings("unused")
public class RandomGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Random x=new Random();
		x.nextInt(100);*/
		Scanner in=new Scanner(System.in);
		int temp=0,min=0,max=100;
		int rnum=(int) (Math.random()*100+1);
		do {
			System.out.println("��������²������");
			temp=in.nextInt();
			if(temp<rnum) {
				System.out.println("��´��ˣ��µķ�ΧΪ"+temp+"~"+max);
				min=temp;
			}else if(temp>rnum) {
				System.out.println("��´��ˣ��µķ�ΧΪ"+min+"~"+temp);
				max=temp;
			}
		}while(temp!=rnum);
		System.out.println("��ϲ��¶��ˣ�������"+rnum);
		in.close();
	}

}
