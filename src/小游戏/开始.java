/**
 * 
 */
package 小游戏;
import java.util.*;

/**
 * @author Jackie-zhong
 *
 */
public class 开始 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		player a=new player();
		computer b=new computer();
		System.out.println("输入1开始游戏");
			if(in.nextInt()==1) {
				do {
					a.clear();
					b.clear();
					b.cards();
					a.cards();
					while(in.nextInt()==1) {
						a.cards();
					}
					System.out.println("你的点数为"+a.points);
					if(computer.point==-1) {
						System.out.println("你的对手爆点了");
					}else {
						System.out.println("对手的点数为"+computer.point);
					}
					if(a.points>21&&computer.point==-1) {
						System.out.println("都爆点了，平局");
						Round.none++;
					}else if(a.points>21&&computer.point!=-1) {
						System.out.println("很抱歉，你输了");
						Round.cw++;
					}else if(a.points<=21&&computer.point==-1){
						System.out.println("恭喜你，你赢了");
						Round.pw++;
					}else if(a.points>computer.point) {
						System.out.println("恭喜你，你赢了");
						Round.pw++;
					}else if(a.points<computer.point) {
						System.out.println("很抱歉，你输了");
						Round.cw++;
					}else if(a.points==computer.point) {
						System.out.println("点数一样，平局");
						Round.none++;
					}
					System.out.println("若还要继续游玩，请输入1，不想玩了则输入0以结束");
				}while(in.nextInt()==1);
				Round.S();
			}
			
		in.close();
	}

}
