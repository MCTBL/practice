package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class ����Ȩ�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Է��ʵ�abc��d�޷����ʣ�����ͨ���෽��ȥ����
		P a=new P();
		System.out.println("a="+(a.a));
		System.out.println("b="+(a.b));
		System.out.println("c="+(a.c));
		System.out.println("d="+(a.S()));
	}

}
class P{
	public int a=0;//��������ͬ�������Է���
	protected int b=0;//�ܱ����ģ�������Է���
	int c=0;//Ĭ�ϣ�ͬ�����Է���
	private int d=0;//˽�У�ͬ���ڿ��Է���
	int S() {
		return d;//ͨ���������÷���d
	}
}