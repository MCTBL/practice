package parctice.commonclass;
import java.util.*;

public class commonDateAndCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date a=new Date();//获取当前系统时间
		System.out.println(a);
		//Date基本也就这
		
		//Calendar并不能直接new一个对象出来，需要通过静态方法getInstance
		//来初始化一个Calendar对象
		Calendar b=Calendar.getInstance();
		
		//对象可以调用set()方法，传入数个3-6个不等的int参数
		//依次为年月日时分秒传入，负数即为公元前
		//get()方法啊传入参数例如
		System.out.println(b.get(Calendar.WEEK_OF_YEAR));//获取这周是一年中的第几周
		System.out.println(b.get(Calendar.DATE));//小学英语即可
		
		//然后是String的format方法对日期信息进行格式化
		//format(格式化模式,日期列表)
		//格式化模式是用双引号阔气的字符序列，类比printf的使用
		//所有符号以%t开头接别的字母
		String c=String.format("现在是%tY年%<tm月%<td日%<ta", a);
		//%<t表示与前面的格式符格式化同一个日期否则得输入多个日期，上下等效
		//但是哪个方便自己看着办
		String d=String.format("现在是%tY年%tm月%td日%ta",a,a,a,a);
		System.out.println(c);
		System.out.println(d);
		//format最前面的参数可以加上地点，用当地的方式去格式化日期
		String e=String.format(Locale.US,"现在是%tY年%<tm月%<td日%<ta",a);
		System.out.println(e);
		String f=String.format(Locale.JAPAN,"现在是%tY年%<tm月%<td日%<ta",a);
		System.out.println(f);
		
		
		
		
	}

}
