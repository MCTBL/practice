package ����;

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
		//Vector��Stack����������ArrayList��LinkedList�÷���������
		
		/*while(true) {
			System.out.println("����������ִ�й���");
			System.out.println("1�����һ��ѧ��");
			System.out.println("2������һ��ѧ������Ϣ");
			System.out.println("3��ɾ��һ��ѧ��");
			System.out.println("4���˳�����");
			String temp=br.readLine();
			if(temp.equals("1")) {
				System.out.println("����������");
				String name=br.readLine();
				System.out.println("����������");
				String age=br.readLine();
				al.add(name, age);
			}else if(temp.equals("2")) {
				System.out.println("����������");
				String name=br.readLine();
				al.get(name);
			}else if(temp.equals("3")) {
				System.out.println("����������");
				String name=br.readLine();
				al.del(name);
			}else if(temp.equals("4")) {
				System.exit(0);
			}
		}*/
		
		while(true) {
			System.out.println("����������ִ�й���");
			System.out.println("1�����һ��ѧ��");
			System.out.println("2�����һ��ѧ����ͷ��");
			System.out.println("3�����һ��ѧ����β��");
			System.out.println("4��ͨ������ɾ��һ��ѧ��");
			System.out.println("5��ɾ��ͷ��ѧ��");
			System.out.println("6��ɾ��β��ѧ��");
			System.out.println("7��ͨ�����ֲ���ѧ��");
			System.out.println("8���˳�");
			System.out.println("9����ӡ����");
			String temp=br.readLine();
			if(temp.equals("1")) {
				System.out.println("����������");
				String name=br.readLine();
				System.out.println("����������");
				String age=br.readLine();
				ll.add(name, age);
			}else if(temp.equals("2")) {
				System.out.println("����������");
				String name=br.readLine();
				System.out.println("����������");
				String age=br.readLine();
				ll.addFirst(name, age);
			}else if(temp.equals("3")) {
				System.out.println("����������");
				String name=br.readLine();
				System.out.println("����������");
				String age=br.readLine();
				ll.addLast(name, age);
			}else if(temp.equals("4")) {
				System.out.println("����������");
				String name=br.readLine();
				ll.del(name);
			}else if(temp.equals("5")) {
				ll.delFirst();
			}else if(temp.equals("6")) {
				ll.delLast();
			}else if(temp.equals("7")) {
				System.out.println("����������");
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
