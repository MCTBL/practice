package ����;

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
				System.out.println("��������Ϊ"+name);
				System.out.println("����Ϊ"+temp.getAge());
				return;
			}
		}
		System.out.println("���޴���");
	}
	
	public void del(String name) {
		for(int i=0;i<al.size();i++) {
			Students temp=(Students)al.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("��������Ϊ"+name);
				System.out.println("����Ϊ"+temp.getAge());
				System.out.println("����ȷ��ɾ����ɾ��������1������0");
				if(sc.nextInt()==1) {
					al.remove(i);
					return;
				}else if(sc.nextInt()==0){
					return;
				}
			}
		}
		System.out.println("���޴���");
	}
}
