package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class 访问权限 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这里可以访问到abc，d无法访问，除非通过类方法去调用
		P a=new P();
		System.out.println("a="+(a.a));
		System.out.println("b="+(a.b));
		System.out.println("c="+(a.c));
		System.out.println("d="+(a.S()));
	}

}
class P{
	public int a=0;//公开：不同包都可以访问
	protected int b=0;//受保护的：子类可以访问
	int c=0;//默认：同包可以访问
	private int d=0;//私有：同类内可以访问
	int S() {
		return d;//通过方法调用返回d
	}
}