/**
 * 
 */
package parctice;

import java.util.*;

/**
 * @author Jackie-zhong
 *
 */
public class ���������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fa a=new Fa();
		B b=new B();
		int x=10,v=5,p=7;
		a.A();
		a.A(x,v,p);
		a.A(x, v);
		a.A((float)x, (float)v);
		a.A((double)x, (float)p);
		b.A(x, v, p);
		//�����½������ñ�������ֱ��Ӧ��һ���������
		@SuppressWarnings("unused")
		Fa z=new B();
	}

}
//��ͬ������������ò�ͬ�ķ��������������أ�,�������Ͳ�ͬ���ɹ��ɷ���������,����ͬ�ķ������η������������
//���಻����С���෽���ķ���Ȩ��
class Fa{
	void A() {
		System.out.println("�����أ�������");
	}
	public void A(int a,int b,int c) {
		int z[]= {a,b,c};
		Arrays.sort(z);
		System.out.println("����Ϊ"+(z[2]));
	}
	 protected void A(int a,int b) {
		 int z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("����Ϊ"+(z[1]));
	 }
	 void A(float a,float b) {
		 float z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("����Ϊ"+(z[1]));
	 }
	 void A(double a,float b) {
		 double z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("����Ϊ"+(z[1]));
	 }
}
class B extends Fa{
	public void A(int a,int b,int c) {
		System.out.println("�����ĸ�д��");//����ֱ�Ӹ�д����ķ���
	}
}