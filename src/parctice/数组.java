/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class ���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son a[]=new Son[2];//��ĳ�Ա����
		int z[]= {10,5,2,4,8,4,2,4};
		a[0]=new Son(10,100,50);
		a[1]=new Son(2,50,20);
		for(int i:z) {//���ױ�������
			System.out.println(i);
		}
		
		for(int i=0;i<z.length;i++) {//Ĭ�ϱ�������
			System.out.println(z[i]);
		}
		
		for(Son i:a) {
			System.out.println(i.age+i.hight+i.money);
		}
		
	}

}
