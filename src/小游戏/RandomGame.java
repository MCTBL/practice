/**
 * 
 */
package 小游戏;

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
			System.out.println("请输入你猜测的数字");
			temp=in.nextInt();
			if(temp<rnum) {
				System.out.println("你猜错了，新的范围为"+temp+"~"+max);
				min=temp;
			}else if(temp>rnum) {
				System.out.println("你猜错了，新的范围为"+min+"~"+temp);
				max=temp;
			}
		}while(temp!=rnum);
		System.out.println("恭喜你猜对了，数字是"+rnum);
		in.close();
	}

}
