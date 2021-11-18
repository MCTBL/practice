package test;

import java.io.*;
import java.util.*;

import ����.Students;

public class studentManagement {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("��ӭʹ��ѧ������ϵͳ");
		studentManagementSystem sMS=new studentManagementSystem();
		do {
			System.out.println("==============");
			System.out.println("��ѡ����Ҫʹ�õĹ���");
			System.out.println("1�����ѧ��");
			System.out.println("2��ɾ��ѧ��");
			System.out.println("3������ѧ��");
			System.out.println("4����ӡ����ѧ��");
			System.out.println("5���˳�");
			
			try {
				switch (sc.nextInt()) {
				case 1:
					System.out.println("����������");
					String name=br.readLine();
					System.out.println("����������");
					int age=sc.nextInt();
					sMS.add(name, age);
					break;
				
				case 2:
					System.out.println("����������");
					String name1=br.readLine();
					sMS.del(name1);
					break;
				
				case 3:
					System.out.println("����������");
					String name2=br.readLine();
					sMS.get(name2);
					break;
				
				case 4:
					sMS.print();
					break;
				
				case 5:
					System.out.println("�����˳�����");
					System.exit(0);
					break;
				
				default:
					System.out.println("��������ȷ������");
				}
			}catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}
			
		}while(true);
		
		
	}

}
class studentManagementSystem  {
	ArrayList<student> al=null;
	Scanner sc=new Scanner(System.in);
	
	public studentManagementSystem() {
		al=new ArrayList<student>();
	}
	
	public void add(String name,int age) {
		student temp=new student(name,age);
		al.add(temp);
	}
	
	public void get(String name) {
		for(int i=0;i<al.size();i++) {
			student temp=al.get(i);
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
			student temp=al.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("��������Ϊ"+name);
				System.out.println("����ȷ��ɾ����ɾ��������1������0");
				int temp2=sc.nextInt();
				if(temp2==1) {
					al.remove(i);
					System.out.println("��ɾ��");
					return;
				}else if(temp2==0){
					System.out.println("δɾ��");
					return;
				}
			}
		}
		System.out.println("���޴���");
	}
	
	public void print() {
		for(int i=0;i<al.size();i++) {
			student temp=al.get(i);
			String name=temp.getName();
			System.out.printf((i+1)+"��\t"+"������"+temp.getName()+"\t���䣺"+temp.getAge()+"\n");
		}
	}
}

class student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
}