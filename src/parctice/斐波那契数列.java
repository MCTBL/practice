/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 쳲��������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n[]= {1,1},a;
		System.out.print("��1λ��");
		System.out.println(n[0]);
		System.out.print("��2λ��");
		System.out.println(n[1]);
		for(a=1;a<=48;a++) {
			n[(int) (a%2)]=n[0]+n[1];
			System.out.print("��"+(a+2)+"λ��");
			System.out.println(n[(int) (a%2)]);
		}
	}

}