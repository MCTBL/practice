package parctice.commonclass;

import java.util.*;

public class commonStringTokenizer {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTokenizer��Ҫ�����ֽ�String�ַ��������ǲ�ͨ��������ʽ
		//�����ֹ�������һ��Ĭ�ϵģ�ʹ��Ĭ�Ϸָ������
		//�ո񣬻��з����س�����Tab����ֽ��
		String a="I'm your daddy";
		StringTokenizer b=new StringTokenizer(a);
		//��׼��ȡ����������HashMap��ͬ
//		do {
//			System.out.println(b.nextToken());
//		}while(b.hasMoreTokens());
		
		String c="192.168.1.1";
		//�������ڿ�ֱ�ӱ�����ʲô����ȥ�ָ���������.�Ϳո�ȥ�ָ�
		StringTokenizer d=new StringTokenizer(c,". ");
//		do {
//			System.out.println(b.nextToken());
//		}while(b.hasMoreTokens());
		
	}

}
