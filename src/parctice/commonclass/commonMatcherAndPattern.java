package parctice.commonclass;
import java.util.regex.*;

public class commonMatcherAndPattern {
	public static void main(String[] args) {
		//ʹ��������ʽ����һ��Pattern����
		Pattern a=Pattern.compile("\\d");
		
		//Ȼ��ʹ��Ҫƥ���String�����½�һ��Matcher����
		Matcher b=a.matcher("19ss");
		//Ȼ��Matcher����Ϳ��Ե������·���
		
		//find()Ѱ����Pattern����ϵ����У��ҵ�����true����һ��ʹ�ôӿ�ͷ����
		//����ÿ�ζ����ϴ��ҵ���λ�ÿ�ʼ���Ѱ��
		//����true��Matcher����ʹ��start()��end()
		//�ͻ᷵��ƥ���������Matcher����ʼλ�úͽ���λ��
		//����ʹ��group()������ƥ���������
		
		//matches()�ж�Matcher��Pattern�Ƿ���ȫƥ��
		//lookingAt()��find����
		
		//find(int)���±꿪ʼ������һ��
		
		//replaceAll(String)��ƥ�䵽��ȫ����Stringȥ�滻
		//replaceFirst(String)�滻��һ��ƥ�䵽��
		
	}
}
