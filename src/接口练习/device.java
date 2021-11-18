/**
 * 
 */
package 接口练习;

/**
 * @author Jackie-zhong
 *
 */
//接口类内的方法都默认为public
//所以在实现方法时所有实现的方法都必须为public修饰
//接口可以继承另一个接口
public interface device extends Poewer{
	void start();
	void stop();
	int a=10;//变量都默认为static且是final的
}
