package 集合;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	Scanner sc=new Scanner(System.in);
	ArrayList al=null;
	public Array() {
		al=new ArrayList();
	}
	
	public void add(String name,String age) {
		Students temp=new Students(name,age);
		al.add(temp);
	}
	
	public void get(String name) {
		for(int i=0;i<al.size();i++) {
			Students temp=(Students)al.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("该生姓名为"+name);
				System.out.println("年龄为"+temp.getAge());
				return;
			}
		}
		System.out.println("查无此人");
	}
	
	public void del(String name) {
		for(int i=0;i<al.size();i++) {
			Students temp=(Students)al.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("该生姓名为"+name);
				System.out.println("年龄为"+temp.getAge());
				System.out.println("请问确认删除吗？删除请输入1否输入0");
				if(sc.nextInt()==1) {
					al.remove(i);
					return;
				}else if(sc.nextInt()==0){
					return;
				}
			}
		}
		System.out.println("查无此人");
	}
}
