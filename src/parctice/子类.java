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
		Father a=new Father();
		Son b=new Son(10,5,20);
		a.S(1);
		b.S(2);//�̳�֮��SonҲ����ֱ�ӵ���S��
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
class Son extends Father{//extends�޷��̳�private����,�������,�����෽��
	Son(int age,int hight,int money){
		this.age=age;
		this.hight=hight;
		this.money=money;
	}
}