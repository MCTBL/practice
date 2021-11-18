package 集合;

import java.io.*;
//import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Array al=new Array();
		Linked ll=new Linked();
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		//Vector vl=new Vector();
		//Stack sl=new Stack();
		//Vector与Stack和另外两种ArrayList与LinkedList用法基本类似
		
		/*while(true) {
			System.out.println("请输入数字执行功能");
			System.out.println("1：添加一个学生");
			System.out.println("2：查找一个学生的信息");
			System.out.println("3：删除一个学生");
			System.out.println("4：退出程序");
			String temp=br.readLine();
			if(temp.equals("1")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				System.out.println("请输入年龄");
				String age=br.readLine();
				al.add(name, age);
			}else if(temp.equals("2")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				al.get(name);
			}else if(temp.equals("3")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				al.del(name);
			}else if(temp.equals("4")) {
				System.exit(0);
			}
		}*/
		
		while(true) {
			System.out.println("请输入数字执行功能");
			System.out.println("1：添加一个学生");
			System.out.println("2：添加一个学生至头部");
			System.out.println("3：添加一个学生至尾部");
			System.out.println("4：通过名字删除一个学生");
			System.out.println("5：删除头部学生");
			System.out.println("6：删除尾部学生");
			System.out.println("7：通过名字查找学生");
			System.out.println("8：退出");
			System.out.println("9：打印链表");
			String temp=br.readLine();
			if(temp.equals("1")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				System.out.println("请输入年龄");
				String age=br.readLine();
				ll.add(name, age);
			}else if(temp.equals("2")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				System.out.println("请输入年龄");
				String age=br.readLine();
				ll.addFirst(name, age);
			}else if(temp.equals("3")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				System.out.println("请输入年龄");
				String age=br.readLine();
				ll.addLast(name, age);
			}else if(temp.equals("4")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				ll.del(name);
			}else if(temp.equals("5")) {
				ll.delFirst();
			}else if(temp.equals("6")) {
				ll.delLast();
			}else if(temp.equals("7")) {
				System.out.println("请输入姓名");
				String name=br.readLine();
				ll.get(name);
			}else if(temp.equals("8")) {
				System.exit(0);
			}else if(temp.equals("9")) {
				ll.print();
			}
			
		}
	}

}
