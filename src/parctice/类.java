package parctice;

public class 类{
	public static void main(String args[]){
		int a=10,b=5;
		Persons p1=new Persons(1);
		p1.age=5;
		p1.name="dick";
		p1.hight=170;
		p1.say();//调用say方法
		p1.suan(a,b);//调用suan方法并输入俩int
		int x=p1.jiafa(10,50);//直接用于接收返回的int
		System.out.println(x);
		
	}
}
//类首字母大写
class Persons{
	//成员变量
	int age;
	String name;
	int hight;
	//成员方法
	public void say(){
		System.out.println("fuck you");
	}
  //此处可定义返回参数类型  //此处接收输入的参数，也可不带参数
	public void suan(int a,int b){
		System.out.println(a+b);
	}
	public int jiafa(int a,int b){
		//返回一个int类型
		return a+b;
	}
	public Persons(int a) {//构造方法
		this.age=a;
	}
}