package parctice;

public class ����� {

	static{
		System.out.println("ֻ����һ��");//�����ֻ����һ��
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Person(1,2),b=new Person(5,99);
		a.A();
		b.A();
		//static��������ֱ������������
		System.out.println(Person.b);
		//ͬ��static����
		Person.B();
		//ͨ����Ա��������private����
		System.out.println(a.C());
	}

}

class Person{
	static int b=0;//��̬����������һ������
	int v=0;//ʵ����������ÿһ���������¶���
	public void A(){
		System.out.println("1");
		b++;
	}
	static void B() {
		System.out.println("���Ǿ�̬����");
	}
	@SuppressWarnings("unused")
	private int z,r;//private�����޷�ֱ��ͨ����Ա��������
	public Person(int z,int r) {
		this.z=z;
		this.r=r;
	}
	int C() {
		return this.z;
	}
}
//�Ǿ�̬�����뷽�����Է��ʾ�̬�������߷���
//��֮����