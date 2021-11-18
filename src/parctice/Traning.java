/**
 * 
 */
package parctice;//包名全小写

/**
 * @author Jackie-zhong
 *
 */
public class Traning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass first;//在栈中新建一个名为first的引用，无引用值
		first=new StudentClass(10);//在堆中新建一个对象，并将引用交给first
		System.out.println(first);
		first=null;//使first的引用值变为null
		System.out.println(first);
	}

}
class StudentClass{//类，接口名大驼峰
	int studentNo;//变量名小驼峰
	final  int STUDENTNUMBER=20;//常量全大写
	
	void setStudentNo(int No){//方法名小驼峰
		this.studentNo=No;
	}
	
	StudentClass(int studentNo) {//构造方法
		this.studentNo=studentNo;
	}
	
}