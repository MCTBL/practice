
/**
 *@author Jackie-zhong 
 * 
 */

package LittleGame;
import java.util.*;

public class StartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("欢迎来到21点小游戏");
		System.out.println("版本1.0");
		System.out.println("输入1并回车开始游戏");
		if(in.nextInt()==1) {
			Card player=new Card();
			do{
					
				player.getCard();
				System.out.println("如需加牌请输入1");
			}while(in.nextInt()==1);
			player.showCard();
				
		}
		in.close();
	}

}
