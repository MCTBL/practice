package parctice.commonclass;
import java.util.*;

public class commonDateAndCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date a=new Date();//��ȡ��ǰϵͳʱ��
		System.out.println(a);
		//Date����Ҳ����
		
		//Calendar������ֱ��newһ�������������Ҫͨ����̬����getInstance
		//����ʼ��һ��Calendar����
		Calendar b=Calendar.getInstance();
		
		//������Ե���set()��������������3-6�����ȵ�int����
		//����Ϊ������ʱ���봫�룬������Ϊ��Ԫǰ
		//get()�����������������
		System.out.println(b.get(Calendar.WEEK_OF_YEAR));//��ȡ������һ���еĵڼ���
		System.out.println(b.get(Calendar.DATE));//СѧӢ�Ｔ��
		
		//Ȼ����String��format������������Ϣ���и�ʽ��
		//format(��ʽ��ģʽ,�����б�)
		//��ʽ��ģʽ����˫�����������ַ����У����printf��ʹ��
		//���з�����%t��ͷ�ӱ����ĸ
		String c=String.format("������%tY��%<tm��%<td��%<ta", a);
		//%<t��ʾ��ǰ��ĸ�ʽ����ʽ��ͬһ�����ڷ�������������ڣ����µ�Ч
		//�����ĸ������Լ����Ű�
		String d=String.format("������%tY��%tm��%td��%ta",a,a,a,a);
		System.out.println(c);
		System.out.println(d);
		//format��ǰ��Ĳ������Լ��ϵص㣬�õ��صķ�ʽȥ��ʽ������
		String e=String.format(Locale.US,"������%tY��%<tm��%<td��%<ta",a);
		System.out.println(e);
		String f=String.format(Locale.JAPAN,"������%tY��%<tm��%<td��%<ta",a);
		System.out.println(f);
		
		
		
		
	}

}
