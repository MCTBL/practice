package parctice.commonclass;
import java.util.*;

@SuppressWarnings("unused")
public class commonStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��String��ȣ�StringBuffer�������ɵ��޸�ÿ���ַ����ĳ����Լ��ڴ�ռ�
		StringBuffer a=new StringBuffer();//�޲ι���
		StringBuffer b=new StringBuffer("�������");//�ַ���
		StringBuffer c=new StringBuffer(4);//�޶���ʼ����
		int d=10;
		String e=new String("�ߺ�"),f="�������";
		
		//append(String)��String׷�ӵ�StringBuffer������ַ�����
		a.append(f);
		
		//append(int)��intת��ΪString��׷��
		//long,char�Ȼ����������ͽԿ�
		a.append(d);
		
		//append(Object)��������ַ������б�ʾ׷�ӵ�StringBuffer�ַ�����
		a.append(e);
		
		System.out.println(a);
		
		//charAt(int)��setCharAt(int,char)Ҳ��������˼�ˣ���ȡ���߸����ַ�
		//insert(int,String)Ҳ�ܺ�����ˣ���ָ�����ݲ���ָ���±�λ
		//reverse()��ת��ǰ������ַ�����
		//delete(int,int)��ǰɾ����-1λ��deleteCharAt(int)ɾ���±�λ���ַ�
		//replace(int,int,String)��ǰ�±꿪ʼ�����±�-1��λ����String���
		
	}

}
