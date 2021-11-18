package parctice;

public class 类变量 {

	static{
		System.out.println("只运行一次");//这里的只运行一次
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Person(1,2),b=new Person(5,99);
		a.A();
		b.A();
		//static变量可以直接用类名访问
		System.out.println(Person.b);
		//同理，static方法
		Person.B();
		//通过成员方法访问private变量
		System.out.println(a.C());
	}

}

class Person{
	static int b=0;//静态变量属于这一整个类
	int v=0;//实例变量属于每一个创建的新对象
	public void A(){
		System.out.println("1");
		b++;
	}
	static void B() {
		System.out.println("我是静态方法");
	}
	@SuppressWarnings("unused")
	private int z,r;//private变量无法直接通过成员变量访问
	public Person(int z,int r) {
		this.z=z;
		this.r=r;
	}
	int C() {
		return this.z;
	}
}
//非静态变量与方法可以访问静态变量或者方法
//反之则不行