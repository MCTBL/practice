package parctice.commonclass;

import java.math.*;
import java.util.*;

public class commonMath {
	public static void main(String[] args) {
		
		double a=Math.E;//��Ȼ����
		double b=Math.PI;//pai
		//���÷����кܶ࣬���Ǿ�̬��
		//abs����ֵ��max(a,b)��min(a,b)�ȴ�С��random�������pow(a,b)a��b�η�
		//sqrt��ƽ����logȡ�������������Ǻ�����ceil���ش����������С����������ȡ��
		//floor����С��������������������ȡ��
		
		//�洢������׵�����
		BigInteger c=new BigInteger("10101010110101010010151648156484154415191451919165165161");
		
		//add�ӣ�subreact����multiply�ˣ�divide����remainderȡ��
		//compareTo�ȴ�С���ڷ���1С�ڷ���-1����0
		//abs����ֵ��pow�η���toString���ʮ�������֣�toString(p)���Ϊp����
		
		
		//���ֹ��췽����һ����Ŀǰʱ��Ϊ�������ɣ�һ���ṩ�������
		Random d=new Random();
		Random e=new Random(1887415157);
		
		//��0-n�������������n
		int f=d.nextInt();
		double g=e.nextDouble();
		//����nextһ����
		
		
		//ʹ��String��format�������ֵĸ�ʽ��
		//format(��ʽ������,�����б�)��printfһ��������
		//����һ������ľ��ǿ���ѡ���ʽ����˳��
		String h=String.format("%2$d���ǵڶ���������%3$d���ǵ���������",10,20,30);
		//����n$����ʹ���б�ֵ��n������
		System.out.println(h);
		
		//%d��ʽ��Ϊʮ���ƣ�%oΪ�˽��ƣ�%xΪСд16��%XΪ��д16
		//����,���κ����ݻ����ǧ����
		String i=String.format("%,d", 1887415157);
		System.out.println(i);
		
		
		//%f����ֵ��ʽ��Ϊʮ���Ƶĸ�������������λС��
		//%e��%E��Ϊ��ѧ�������ĸ���������д��Ϊָ������Ҳ��д
		
	}
}
