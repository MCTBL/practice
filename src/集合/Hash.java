package 集合;

import java.util.*;

public class Hash {
	HashMap hm=null;
	public Hash() {
		hm=new HashMap();
	}
	
	//HashMap和Hashtable都是K，V类型的，即一个Key值对应一个Value值
	//也可为对象
	//如果出现相同的Key值，新加入的会覆盖掉原有的Value
	public void add(String name,String age) {
		Students temp=new Students(name,age);
		//      K     V
		hm.put(name, temp);
	}
	
	public void get(String name) {
		Students temp=(Students)hm.get(name);
		System.out.println("姓名："+temp.getName());
		System.out.println("年龄："+temp.getAge());
	}
	
	public void print() {
		Iterator ir=hm.keySet().iterator();
		while(ir.hasNext()) {
			String key=ir.next().toString();
			Students temp=(Students) hm.get(key);
			System.out.println("姓名："+temp.getName());
			System.out.println("年龄："+temp.getAge());
		}
	}
	
}
