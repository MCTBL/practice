/**
 * 
 */
package С��Ϸ;
import java.util.*;

/**
 * @author Jackie-zhong
 *
 */
public class ��ʼ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		player a=new player();
		computer b=new computer();
		System.out.println("����1��ʼ��Ϸ");
			if(in.nextInt()==1) {
				do {
					a.clear();
					b.clear();
					b.cards();
					a.cards();
					while(in.nextInt()==1) {
						a.cards();
					}
					System.out.println("��ĵ���Ϊ"+a.points);
					if(computer.point==-1) {
						System.out.println("��Ķ��ֱ�����");
					}else {
						System.out.println("���ֵĵ���Ϊ"+computer.point);
					}
					if(a.points>21&&computer.point==-1) {
						System.out.println("�������ˣ�ƽ��");
						Round.none++;
					}else if(a.points>21&&computer.point!=-1) {
						System.out.println("�ܱ�Ǹ��������");
						Round.cw++;
					}else if(a.points<=21&&computer.point==-1){
						System.out.println("��ϲ�㣬��Ӯ��");
						Round.pw++;
					}else if(a.points>computer.point) {
						System.out.println("��ϲ�㣬��Ӯ��");
						Round.pw++;
					}else if(a.points<computer.point) {
						System.out.println("�ܱ�Ǹ��������");
						Round.cw++;
					}else if(a.points==computer.point) {
						System.out.println("����һ����ƽ��");
						Round.none++;
					}
					System.out.println("����Ҫ�������棬������1����������������0�Խ���");
				}while(in.nextInt()==1);
				Round.S();
			}
			
		in.close();
	}

}
