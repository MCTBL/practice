/**
 * 
 */
package ����;

import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
public class ������ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������ϰ a=new ������ϰ();
		Scanner x=new Scanner(System.in);
		System.out.println("����1���Ԫ�أ�2ɾ��Ԫ�أ�3�滻Ԫ��,4�鿴����,0�˳�����");
		int z,c;
		String q;
		z=x.nextInt();
		do {
			switch(z) {
			case 1:
				System.out.println("��ֱ�������Ҫ�����λ�ú�����,�ÿո����");
				c=x.nextInt();
				q=x.nextLine();
				a.add(c, q);
			break;
			case 2:
				System.out.println("��������Ҫɾ����λ��");
				c=x.nextInt();
				a.del(c);
				break;
			case 4:
				a.speak();
				break;
			case 3:
				System.out.println("��ֱ�������Ҫ���ĵ�λ�ú�����,�ÿո����");
				c=x.nextInt();
				q=x.nextLine();
				a.change(c, q);
				break;
			}
			System.out.println("����1���Ԫ�أ�2ɾ��Ԫ�أ�3�滻Ԫ��,4�鿴����,0�˳�����");
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
	
	//����Ԫ��
	void add(int no,String data) {
		node temp1=new node(data);
		//�������һ��Ԫ�ص�����
		if(node.size==0) {
			node.head=temp1;
			node.end=temp1;
		}else if(no==0) {//ͷ������
			temp1.next=node.head;
			node.head=temp1;
		}else if(no==node.size) {//β������
			node.end.next=temp1;
			node.end=temp1;
		}else if(no>0&&no<node.size) {//�м����
			node pre=this.get(no-1);
			temp1.next=pre.next;//��ԭ��ǰһλ��next��Ϊ��ʱ�ڵ��next
			pre.next=temp1;//����ʱ�ڵ��Ϊԭ��ǰһλ��next
		}
		node.size++;
	}
	
	//ɾ������
	void del(int no) {
		if(no==0) {//ɾ��ͷ��
			node.head=node.head.next;//��ͷ����Ϊԭ��ͷ����next
		}else if(no>0&&no<node.size) {//ɾ���м�Ԫ��
			this.get(no-1).next=this.get(no+1);//��ǰһ����next������һ��
		}else if(no==node.size) {//ɾ��β��
			this.get(no-1).next=null;//ʹβ��ǰһ����next��Ϊnull
		}
	}
	
	//��ȡ����
	node get(int no) {
		node temp=node.head;
		for(int i=0;i<no;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	//�������
	void speak() {
		node temp=node.head;
		int x=0;
		while(temp!=null) {//�ж�temp,����һλ�Ƿ����
			System.out.println("��"+x+"λ������Ϊ"+"  "+temp.data);
			x++;
			temp=temp.next;
		}
	}
	
	//�滻����
	void change(int no,String data) {
		this.get(no).data=data;
	}
}