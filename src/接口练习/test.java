/**
 * 
 */
package �ӿ���ϰ;

/**
 * @author Jackie-zhong
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		device a=new DeskTop();
		//DeskTop a=new DeskTop();
		//����ͨ���ӿ�ȥ�½�����һ������
		device b=new Phone();
		//Phone b=new Phone();
		
		a.start();
		a.stop();
		b.start();
		b.stop();
		System.out.println(DeskTop.a);
		System.out.println(Phone.a);
		System.out.println(device.a);
		a.power();
		
	}

}
