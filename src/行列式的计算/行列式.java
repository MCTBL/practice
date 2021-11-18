/**
 * 
 */
package 行列式的计算;

import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
public class 行列式 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("请输入要计算的行列式阶数");
		int a=x.nextInt();
		if(a==2) {
			int q[]=new int[4];
			for(int i=0;i<4;i++) {
				System.out.println("请输入第"+(i+1)+"个数：");
				a=x.nextInt();
				q[i]=a;
			}
			System.out.println("二阶行列式的结果为"+(q[0]*q[3]-q[2]*q[1]));
		}else if(a==3) {
			int q[]=new int[9];
			for(int i=0;i<9;i++) {
				System.out.println("请输入第"+(i+1)+"个数：");
				a=x.nextInt();
				q[i]=a;
			}
			System.out.println("三阶行列式的结果为"+(q[0]*q[4]*q[8]+q[3]*q[7]*q[2]+q[6]*q[1]*q[5]-q[2]*q[4]*q[6]-q[0]*q[5]*q[7]-q[1]*q[3]*q[8]));
		}
		x.close();
	}

}