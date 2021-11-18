package parctice.commonclass;

import java.math.*;
import java.util.*;

public class commonMath {
	public static void main(String[] args) {
		
		double a=Math.E;//自然对数
		double b=Math.PI;//pai
		//常用方法有很多，都是静态的
		//abs绝对值，max(a,b)和min(a,b)比大小，random随机数，pow(a,b)a的b次方
		//sqrt开平方，log取对数，各种三角函数，ceil返回大于输入的最小整数即向上取整
		//floor返回小于输入的最大整数即向下取整
		
		//存储大的离谱的数字
		BigInteger c=new BigInteger("10101010110101010010151648156484154415191451919165165161");
		
		//add加，subreact减，multiply乘，divide除，remainder取余
		//compareTo比大小大于返回1小于返回-1等于0
		//abs绝对值，pow次方，toString输出十进制数字，toString(p)输出为p进制
		
		
		//两种构造方法，一种以目前时间为种子生成，一种提供随机种子
		Random d=new Random();
		Random e=new Random(1887415157);
		
		//从0-n随机数，不包括n
		int f=d.nextInt();
		double g=e.nextDouble();
		//各种next一样的
		
		
		//使用String的format进行数字的格式化
		//format(格式化参数,数据列表)和printf一样不解释
		//但有一个特殊的就是可以选择格式化的顺序
		String h=String.format("%2$d我是第二个参数，%3$d我是第三个参数",10,20,30);
		//加入n$即可使用列表值第n个参数
		System.out.println(h);
		
		//%d格式化为十进制，%o为八进制，%x为小写16，%X为大写16
		//加上,修饰后数据会根据千分组
		String i=String.format("%,d", 1887415157);
		System.out.println(i);
		
		
		//%f将数值格式化为十进制的浮点数，保留六位小数
		//%e和%E以为科学计数法的浮点数，大写即为指数符号也大写
		
	}
}
