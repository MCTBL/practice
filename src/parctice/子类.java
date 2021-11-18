package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 子类 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father a=new Father();
		Son b=new Son(10,5,20);
		a.S(1);
		b.S(2);//继承之后，Son也可以直接调用S了
		System.out.println(a.age);
		System.out.println(b.age);
	}

}
class Father{
	int age;
	int hight;
	int money;
	void S(int a) {
		this.age=a;
	}
}
class Son extends Father{//extends无法继承private类型,其余均可,包括类方法
	Son(int age,int hight,int money){
		this.age=age;
		this.hight=hight;
		this.money=money;
	}
}