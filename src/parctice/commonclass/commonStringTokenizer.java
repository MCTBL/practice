package parctice.commonclass;

import java.util.*;

public class commonStringTokenizer {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTokenizer主要用来分解String字符串，但是不通过正则表达式
		//有两种构造器，一种默认的，使用默认分隔符标记
		//空格，换行符，回车符，Tab，进纸符
		String a="I'm your daddy";
		StringTokenizer b=new StringTokenizer(a);
		//标准的取出方法，与HashMap相同
//		do {
//			System.out.println(b.nextToken());
//		}while(b.hasMoreTokens());
		
		String c="192.168.1.1";
		//构造器内可直接表明用什么符号去分割，这里就是用.和空格去分割
		StringTokenizer d=new StringTokenizer(c,". ");
//		do {
//			System.out.println(b.nextToken());
//		}while(b.hasMoreTokens());
		
	}

}
