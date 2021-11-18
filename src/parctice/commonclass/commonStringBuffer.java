package parctice.commonclass;
import java.util.*;

@SuppressWarnings("unused")
public class commonStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//与String相比，StringBuffer可以自由地修改每个字符串的长度以及内存空间
		StringBuffer a=new StringBuffer();//无参构造
		StringBuffer b=new StringBuffer("我是你爹");//字符串
		StringBuffer c=new StringBuffer(4);//限定初始长度
		int d=10;
		String e=new String("芜湖"),f="我是你爹";
		
		//append(String)将String追加到StringBuffer对象的字符序列
		a.append(f);
		
		//append(int)将int转化为String后追加
		//long,char等基本数据类型皆可
		a.append(d);
		
		//append(Object)将对象的字符串序列表示追加到StringBuffer字符序列
		a.append(e);
		
		System.out.println(a);
		
		//charAt(int)和setCharAt(int,char)也就字面意思了，获取或者更改字符
		//insert(int,String)也很好理解了，将指定内容插入指定下标位
		//reverse()反转当前对象的字符序列
		//delete(int,int)从前删到后-1位，deleteCharAt(int)删除下标位的字符
		//replace(int,int,String)从前下标开始到后下标-1的位置用String替代
		
	}

}
