package parctice;

public class ��{
	public static void main(String args[]){
		int a=10,b=5;
		Persons p1=new Persons(1);
		p1.age=5;
		p1.name="dick";
		p1.hight=170;
		p1.say();//����say����
		p1.suan(a,b);//����suan������������int
		int x=p1.jiafa(10,50);//ֱ�����ڽ��շ��ص�int
		System.out.println(x);
		
	}
}
//������ĸ��д
class Persons{
	//��Ա����
	int age;
	String name;
	int hight;
	//��Ա����
	public void say(){
		System.out.println("fuck you");
	}
  //�˴��ɶ��巵�ز�������  //�˴���������Ĳ�����Ҳ�ɲ�������
	public void suan(int a,int b){
		System.out.println(a+b);
	}
	public int jiafa(int a,int b){
		//����һ��int����
		return a+b;
	}
	public Persons(int a) {//���췽��
		this.age=a;
	}
}