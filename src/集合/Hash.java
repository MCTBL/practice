package ����;

import java.util.*;

public class Hash {
	HashMap hm=null;
	public Hash() {
		hm=new HashMap();
	}
	
	//HashMap��Hashtable����K��V���͵ģ���һ��Keyֵ��Ӧһ��Valueֵ
	//Ҳ��Ϊ����
	//���������ͬ��Keyֵ���¼���ĻḲ�ǵ�ԭ�е�Value
	public void add(String name,String age) {
		Students temp=new Students(name,age);
		//      K     V
		hm.put(name, temp);
	}
	
	public void get(String name) {
		Students temp=(Students)hm.get(name);
		System.out.println("������"+temp.getName());
		System.out.println("���䣺"+temp.getAge());
	}
	
	public void print() {
		Iterator ir=hm.keySet().iterator();
		while(ir.hasNext()) {
			String key=ir.next().toString();
			Students temp=(Students) hm.get(key);
			System.out.println("������"+temp.getName());
			System.out.println("���䣺"+temp.getAge());
		}
	}
	
}
