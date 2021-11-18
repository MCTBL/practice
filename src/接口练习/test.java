/**
 * 
 */
package 接口练习;

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
		//可以通过接口去新建子类一个对象
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
