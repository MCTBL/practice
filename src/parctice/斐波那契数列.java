/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 斐波那契数列 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n[]= {1,1},a;
		System.out.print("第1位：");
		System.out.println(n[0]);
		System.out.print("第2位：");
		System.out.println(n[1]);
		for(a=1;a<=48;a++) {
			n[(int) (a%2)]=n[0]+n[1];
			System.out.print("第"+(a+2)+"位：");
			System.out.println(n[(int) (a%2)]);
		}
	}

}