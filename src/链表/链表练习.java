/**
 * 
 */
package 链表;

import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
public class 链表练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		链表练习 a=new 链表练习();
		Scanner x=new Scanner(System.in);
		System.out.println("输入1添加元素，2删除元素，3替换元素,4查看链表,0退出程序");
		int z,c;
		String q;
		z=x.nextInt();
		do {
			switch(z) {
			case 1:
				System.out.println("请分别输入你要插入的位置和数据,用空格隔开");
				c=x.nextInt();
				q=x.nextLine();
				a.add(c, q);
			break;
			case 2:
				System.out.println("请输入你要删除的位置");
				c=x.nextInt();
				a.del(c);
				break;
			case 4:
				a.speak();
				break;
			case 3:
				System.out.println("请分别输入你要更改的位置和数据,用空格隔开");
				c=x.nextInt();
				q=x.nextLine();
				a.change(c, q);
				break;
			}
			System.out.println("输入1添加元素，2删除元素，3替换元素,4查看链表,0退出程序");
			z=x.nextInt();
		}while(z!=0);
		x.close();
	}

	static class node{
		static node head;
		static node end;
		static int size=0;
		String data;
		node next;
		
		node(String data){
			this.data=data;
		}
	}
	
	//新增元素
	void add(int no,String data) {
		node temp1=new node(data);
		//空链表第一个元素的生成
		if(node.size==0) {
			node.head=temp1;
			node.end=temp1;
		}else if(no==0) {//头部插入
			temp1.next=node.head;
			node.head=temp1;
		}else if(no==node.size) {//尾部插入
			node.end.next=temp1;
			node.end=temp1;
		}else if(no>0&&no<node.size) {//中间插入
			node pre=this.get(no-1);
			temp1.next=pre.next;//令原本前一位的next成为临时节点的next
			pre.next=temp1;//令临时节点成为原本前一位的next
		}
		node.size++;
	}
	
	//删除方法
	void del(int no) {
		if(no==0) {//删除头部
			node.head=node.head.next;//将头部变为原先头部的next
		}else if(no>0&&no<node.size) {//删除中间元素
			this.get(no-1).next=this.get(no+1);//将前一个的next等于下一个
		}else if(no==node.size) {//删除尾部
			this.get(no-1).next=null;//使尾部前一个的next变为null
		}
	}
	
	//获取方法
	node get(int no) {
		node temp=node.head;
		for(int i=0;i<no;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	//输出方法
	void speak() {
		node temp=node.head;
		int x=0;
		while(temp!=null) {//判断temp,即下一位是否存在
			System.out.println("第"+x+"位的数据为"+"  "+temp.data);
			x++;
			temp=temp.next;
		}
	}
	
	//替换方法
	void change(int no,String data) {
		this.get(no).data=data;
	}
}