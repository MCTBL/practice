package parctice.commonclass;

public class commonString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建逻辑为先搜索常量池中是否存在该数据，是则直接将引用传递过去，无则开辟新空间存放
		String a="生活就像海洋";//创建方法1，直接在常量池创建该数据并将引用交给a
		String b=new String("生活就像海洋");//创建方法2，在堆内存创建一个对象
										 //后在常量池中搜索有没有对应的数据
								   		 //如果有，将常量池中的引用交给对象
										 //并将对象的引用交给b
		//或使用char数组
		char x[]= {'生','活','就','像','海','洋'};
		String c=new String(x);
		//可以接两个参数String(x,s,e)意味着从x数组的下标s位到下标e位组成String

		//两个String实行+运算后即为首尾相接
		String d="我来组成头部";
		String e="我来组成尾部";
		String f=d+e;//我来组成头部我来组成尾部
		
		//常用方法length
		a.length();//清晰明了=6
		
		//equals
		//比较两个String的字符序列是否相同
		//若直接将两个String直接==去判断是判断他们的引用是否相等
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//false
		
		//startsWith和endsWith
		//这还用解释？
		
		//contains
		//也不需要解释吧？
		
		//indexOf和lastIndexOf
		String g="1887415157";
		//返回下标，后面跟的参数为从参数下标往后开始搜索
		System.out.println(g.indexOf("8"));
		System.out.println(g.indexOf("7",4));
		System.out.println(g.lastIndexOf("7"));
		System.out.println(g.indexOf("我"));//若无法找到则返回-1
		
		//substring
		//传入一个参数意为从该下标开始到结尾的字符串交给新对象
		String h=g.substring(3);//7415157
		System.out.println(h);
		//传入两个，从开始下标取到终止下标-1，即从下标2到7
		String i=g.substring(3,8);//74151
		System.out.println(i);
		
		//lang包中封装了将String转化为相应的基本数据类型的静态方法
		//但会有可能抛出数据错误异常NumberFormatExaception
		String j="127";
		byte k=Byte.parseByte(j);
		int l=Integer.parseInt(j);
		
		char m[]=j.toCharArray(),n[]=new char[5];
		//从j的第一个参数位置取值至第二个参数位置，放置到n字符数组，从第三个参数位置开始
		j.getChars(0, 1, n, 0);
		
		//match方法会将字符串与正则表达式去匹配，返回一个布尔
		String regex="\\d{3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}";
		String o="192.168.1.1";
		boolean p=o.matches(regex);//true
		
		//String replaceAll(String regex,String replacement)
		//将String匹配正则表达式的部分全部用replacement替换，并返回一个新的String字符串
		//并不改变原先字符串
		String q=o.replaceAll("[.]", " ");//192 168 1 1
		
		//String[] split(String regex)
		//根据正则表达式选取分隔符进行拆分原先字符串
		//例如要将o的数字分别取出，则用非数子作为分隔符即可
		String r[]=o.split("\\D");
		//r[0]=192,r[1]=168,r[2]=1,r[3]=1
		//PS:split认为分隔符标记的左侧应该是单词，因此如果当前的对象字符串序列的前缀
		//与正则表达式匹配，则方法分解出来的第一个单词是一个""空字符串序列
		
		
	}

}
