/**
 * 
 */
package 接口练习;

/**
 * @author Jackie-zhong
 *
 */
public class Phone implements device {
	
	public void start() {
		System.out.println("手机开始工作");
	}
	
	public void stop() {
		System.out.println("手机停止工作");
	}
	
	public void power() {
		System.out.println("手机能源供给");
	}
	
}
