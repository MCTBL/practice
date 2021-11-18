package parctice.commonclass;
import java.util.*;

public class commonScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		//Scanner()跟上它的输入参数类型，种类非常多
		//Scanner a=new Scanner(System.in);
		Scanner a=new Scanner("50+60+88+49+5");
		//Scanner对象可以调用useDelimiter()方法分割输入的字符串
		a.useDelimiter("\\D");
		
		do {
			temp+=a.nextInt();
		}while(a.hasNext());
		System.out.println(temp);//252
		//使用Scanner进行分割字符串相较StringTokenizer类会稍慢一些
		
	}

}
