/**
 * 
 */
package homeWork;

/**
 * @author Jackie-zhong
 *
 */
public class Bank {
	private String name;
	private int ID;
	static String bank="�й�����";
	private int count;
	
	Bank(String name,int ID,int count){
		this.name=name;
		this.ID=ID;
		this.count=count;
	}
	Bank(){
		this.count=0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public void in(int count) {
		this.count += count;
	}
	public void out(int count) {
		this.count -= count;
	}
	public String toString() {
		return "����Ϊ"+bank+"������Ϊ"+this.name+"��ID:"+this.ID+"�����"+this.count+"Ԫ";
	}
	
}
