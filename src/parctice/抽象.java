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
		E e=new E();
		e.M();
		e.x();
		X.A();
	}

}

//abstract���ε�Ϊ�����࣬�ڲ��Ķ���һ�㶼ʹ�ò�������Ҫ��Ϊ�������
//�����಻��ʵ���������ɴ���һ��������Ķ���
//��������ֻ�ɴ��ڳ��󷽷�
abstract class X{
	//���󷽷����Բ���д������
	abstract void M();
	abstract void x();
	//�������ڿ����зǳ��󷽷�
	static void A() {
		System.out.println("����");
	}
}

//���󷽷��̳к���뽫�䲹ȫʵ�֣�����ᱨ��
class E extends X{
	void M() {
		//�������Ϊ��
	}
	
	void x() {
		System.out.println("�̳��Գ������ڵĳ��󷽷�");
	}
}