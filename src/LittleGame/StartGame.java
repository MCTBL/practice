
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
		System.out.println("��ӭ����21��С��Ϸ");
		System.out.println("�汾1.0");
		System.out.println("����1���س���ʼ��Ϸ");
		if(in.nextInt()==1) {
			Card player=new Card();
			do{
					
				player.getCard();
				System.out.println("�������������1");
			}while(in.nextInt()==1);
			player.showCard();
				
		}
		in.close();
	}

}
