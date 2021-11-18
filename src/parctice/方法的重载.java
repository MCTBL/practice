/**
 * 
 */
package parctice;

import java.util.*;

/**
 * @author Jackie-zhong
 *
 */
public class 方法的重载 {

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
		//父类新建的引用变量可以直接应用一个子类对象
		@SuppressWarnings("unused")
		Fa z=new B();
	}

}
//不同的输入参数调用不同的方法（方法的重载）,返回类型不同不可构成方法的重载,但不同的访问修饰符可以造成重载
//子类不能缩小父类方法的访问权限
class Fa{
	void A() {
		System.out.println("参数呢？？？？");
	}
	public void A(int a,int b,int c) {
		int z[]= {a,b,c};
		Arrays.sort(z);
		System.out.println("最大的为"+(z[2]));
	}
	 protected void A(int a,int b) {
		 int z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("最大的为"+(z[1]));
	 }
	 void A(float a,float b) {
		 float z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("最大的为"+(z[1]));
	 }
	 void A(double a,float b) {
		 double z[]= {a,b};
		 Arrays.sort(z);
		 System.out.println("最大的为"+(z[1]));
	 }
}
class B extends Fa{
	public void A(int a,int b,int c) {
		System.out.println("方法的覆写了");//可以直接覆写父类的方法
	}
}