package parctice.commonclass;

public class commonString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����߼�Ϊ���������������Ƿ���ڸ����ݣ�����ֱ�ӽ����ô��ݹ�ȥ�����򿪱��¿ռ���
		String a="���������";//��������1��ֱ���ڳ����ش��������ݲ������ý���a
		String b=new String("���������");//��������2���ڶ��ڴ洴��һ������
										 //���ڳ�������������û�ж�Ӧ������
								   		 //����У����������е����ý�������
										 //������������ý���b
		//��ʹ��char����
		char x[]= {'��','��','��','��','��','��'};
		String c=new String(x);
		//���Խ���������String(x,s,e)��ζ�Ŵ�x������±�sλ���±�eλ���String

		//����Stringʵ��+�����Ϊ��β���
		String d="�������ͷ��";
		String e="�������β��";
		String f=d+e;//�������ͷ���������β��
		
		//���÷���length
		a.length();//��������=6
		
		//equals
		//�Ƚ�����String���ַ������Ƿ���ͬ
		//��ֱ�ӽ�����Stringֱ��==ȥ�ж����ж����ǵ������Ƿ����
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//false
		
		//startsWith��endsWith
		//�⻹�ý��ͣ�
		
		//contains
		//Ҳ����Ҫ���Ͱɣ�
		
		//indexOf��lastIndexOf
		String g="1887415157";
		//�����±꣬������Ĳ���Ϊ�Ӳ����±�����ʼ����
		System.out.println(g.indexOf("8"));
		System.out.println(g.indexOf("7",4));
		System.out.println(g.lastIndexOf("7"));
		System.out.println(g.indexOf("��"));//���޷��ҵ��򷵻�-1
		
		//substring
		//����һ��������Ϊ�Ӹ��±꿪ʼ����β���ַ��������¶���
		String h=g.substring(3);//7415157
		System.out.println(h);
		//�����������ӿ�ʼ�±�ȡ����ֹ�±�-1�������±�2��7
		String i=g.substring(3,8);//74151
		System.out.println(i);
		
		//lang���з�װ�˽�Stringת��Ϊ��Ӧ�Ļ����������͵ľ�̬����
		//�����п����׳����ݴ����쳣NumberFormatExaception
		String j="127";
		byte k=Byte.parseByte(j);
		int l=Integer.parseInt(j);
		
		char m[]=j.toCharArray(),n[]=new char[5];
		//��j�ĵ�һ������λ��ȡֵ���ڶ�������λ�ã����õ�n�ַ����飬�ӵ���������λ�ÿ�ʼ
		j.getChars(0, 1, n, 0);
		
		//match�����Ὣ�ַ�����������ʽȥƥ�䣬����һ������
		String regex="\\d{3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}";
		String o="192.168.1.1";
		boolean p=o.matches(regex);//true
		
		//String replaceAll(String regex,String replacement)
		//��Stringƥ��������ʽ�Ĳ���ȫ����replacement�滻��������һ���µ�String�ַ���
		//�����ı�ԭ���ַ���
		String q=o.replaceAll("[.]", " ");//192 168 1 1
		
		//String[] split(String regex)
		//����������ʽѡȡ�ָ������в��ԭ���ַ���
		//����Ҫ��o�����ֱַ�ȡ�������÷�������Ϊ�ָ�������
		String r[]=o.split("\\D");
		//r[0]=192,r[1]=168,r[2]=1,r[3]=1
		//PS:split��Ϊ�ָ�����ǵ����Ӧ���ǵ��ʣ���������ǰ�Ķ����ַ������е�ǰ׺
		//��������ʽƥ�䣬�򷽷��ֽ�����ĵ�һ��������һ��""���ַ�������
		
		
	}

}
