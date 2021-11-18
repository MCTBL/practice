package parctice.commonclass;
import java.util.regex.*;

public class commonMatcherAndPattern {
	public static void main(String[] args) {
		//使用正则表达式建立一个Pattern对象
		Pattern a=Pattern.compile("\\d");
		
		//然后使用要匹配的String对象新建一个Matcher对象
		Matcher b=a.matcher("19ss");
		//然后Matcher对象就可以调用以下方法
		
		//find()寻找与Pattern相符合的序列，找到返回true，第一次使用从开头检索
		//后面每次都从上次找到的位置开始向后寻找
		//返回true后Matcher可以使用start()和end()
		//就会返回匹配的序列在Matcher的起始位置和结束位置
		//还可使用group()来返回匹配的子序列
		
		//matches()判断Matcher与Pattern是否完全匹配
		//lookingAt()与find类似
		
		//find(int)从下标开始找其他一样
		
		//replaceAll(String)把匹配到的全部用String去替换
		//replaceFirst(String)替换第一个匹配到的
		
	}
}
