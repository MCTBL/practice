package test;

import java.io.*;
import java.util.*;

import 集合.Students;

public class studentManagement {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("欢迎使用学生管理系统");
		studentManagementSystem sMS=new studentManagementSystem();
		do {
			System.out.println("==============");
			System.out.println("请选择你要使用的功能");
			System.out.println("1：添加学生");
			System.out.println("2：删除学生");
			System.out.println("3：查找学生");
			System.out.println("4：打印所有学生");
			System.out.println("5：退出");
			
			try {
				switch (sc.nextInt()) {
				case 1:
					System.out.println("请输入姓名");
					String name=br.readLine();
					System.out.println("请输入年龄");
					int age=sc.nextInt();
					sMS.add(name, age);
					break;
				
				case 2:
					System.out.println("请输入姓名");
					String name1=br.readLine();
					sMS.del(name1);
					break;
				
				case 3:
					System.out.println("请输入姓名");
					String name2=br.readLine();
					sMS.get(name2);
					break;
				
				case 4:
					sMS.print();
					break;
				
				case 5:
					System.out.println("即将退出程序");
					System.exit(0);
					break;
				
				default:
					System.out.println("请输入正确的数字");
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
				System.out.println("该生姓名为"+name);
				System.out.println("年龄为"+temp.getAge());
				return;
			}
		}
		System.out.println("查无此人");
	}
	
	public void del(String name) {
		for(int i=0;i<al.size();i++) {
			student temp=al.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("该生姓名为"+name);
				System.out.println("请问确认删除吗？删除请输入1否输入0");
				int temp2=sc.nextInt();
				if(temp2==1) {
					al.remove(i);
					System.out.println("已删除");
					return;
				}else if(temp2==0){
					System.out.println("未删除");
					return;
				}
			}
		}
		System.out.println("查无此人");
	}
	
	public void print() {
		for(int i=0;i<al.size();i++) {
			student temp=al.get(i);
			String name=temp.getName();
			System.out.printf((i+1)+"号\t"+"姓名："+temp.getName()+"\t年龄："+temp.getAge()+"\n");
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