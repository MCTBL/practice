/**
 * 
 */
package С��Ϸ;

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
			System.out.println("�����ˣ�������");
		}else {
			this.speak();
			System.out.println("�����Ƿ�������ƣ�����������1������������0");
		}
	}
	void speak() {
		System.out.println("��Ŀǰ�ĵ���Ϊ"+this.points);
	}
	void clear() {
		this.points=0;
	}
}
