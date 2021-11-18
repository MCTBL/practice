/**
 * 
 */
package 小游戏;

/**
 * @author Jackie-zhong
 *
 */
public class player {
	int points;
	int radom() {
		int x=(int)(Math.random()*13)+1;
		return x;
	}
	void cards() {
		this.points=points+this.radom();
		if(points>21) {
			this.speak();
			System.out.println("爆点了，你输了");
		}else {
			this.speak();
			System.out.println("请问是否继续加牌，加牌请输入1，结束请输入0");
		}
	}
	void speak() {
		System.out.println("你目前的点数为"+this.points);
	}
	void clear() {
		this.points=0;
	}
}
