/**
 * 
 */
package 接口练习;

/**
 * @author Jackie-zhong
 *
 */
public class DeskTop implements device {
	public void start() {
		System.out.println("电脑开始工作");
	
	}

	public void stop() {
		System.out.println("电脑停止工作");
		
	}
	
	public void power() {
		System.out.println("电脑供能");
	}
}
