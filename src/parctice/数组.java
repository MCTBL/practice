/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 数组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son a[]=new Son[2];//类的成员数组
		int z[]= {10,5,2,4,8,4,2,4};
		a[0]=new Son(10,100,50);
		a[1]=new Son(2,50,20);
		for(int i:z) {//简易遍历方法
			System.out.println(i);
		}
		
		for(int i=0;i<z.length;i++) {//默认遍历方法
			System.out.println(z[i]);
		}
		
		for(Son i:a) {
			System.out.println(i.age+i.hight+i.money);
		}
		
	}

}
