package parctice.commonclass;
import java.util.*;

public class commonScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		//Scanner()������������������ͣ�����ǳ���
		//Scanner a=new Scanner(System.in);
		Scanner a=new Scanner("50+60+88+49+5");
		//Scanner������Ե���useDelimiter()�����ָ�������ַ���
		a.useDelimiter("\\D");
		
		do {
			temp+=a.nextInt();
		}while(a.hasNext());
		System.out.println(temp);//252
		//ʹ��Scanner���зָ��ַ������StringTokenizer�������һЩ
		
	}

}
