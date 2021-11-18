/**
 * 
 */
package homeWork;

/**
 * @author Jackie-zhong
 *
 */
public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank test1=new Bank();
		Bank test2=new Bank("¹þ¹þ",1887415157,100);
		System.out.println(test2.toString());
		test1.setName("Äãµù");
		test1.in(100000000);
		System.out.println(test1.toString());
		test1.out(10838272);
		System.out.println(test1.toString());
		
	}

}
