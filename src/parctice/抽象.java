/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 抽象 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e=new E();
		e.M();
		e.x();
		X.A();
	}

}

//abstract修饰的为抽象类，内部的东西一般都使用不到，主要作为父类存在
//抽象类不可实例化，不可创建一个抽象类的对象
//抽象类内只可存在抽象方法
abstract class X{
	//抽象方法可以不能写方法体
	abstract void M();
	abstract void x();
	//抽象类内可以有非抽象方法
	static void A() {
		System.out.println("嘻嘻");
	}
}

//抽象方法继承后必须将其补全实现，否则会报错
class E extends X{
	void M() {
		//方法体可为空
	}
	
	void x() {
		System.out.println("继承自抽象类内的抽象方法");
	}
}