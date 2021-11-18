/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 数字格式化 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String类调用format方法进行数字格式化
		for(int i=0;i<=100;i++) {
			System.out.println(String.format(i+"在十六进制中表示为%X",i));
		}
		//格式控制符必须和列表值的个数必须相等,格式控制符之间可以插入
		System.out.println(String.format("%d哈哈%x嘻嘻%Xxixi",5,3,6));
		//%d或者别的控制符中插入","意为按照千分位表示
		System.out.println(String.format("%,f", 100032323.1648));
		
		
	}

}
