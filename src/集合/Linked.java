package 集合;
import java.util.*;

public class Linked {
	LinkedList ll=null;
	public Linked() {
		ll=new LinkedList();
	}
	
	public void add(String name,String age) {
		Students temp=new Students(name,age);
		ll.add(temp);
	}
	
	public void addFirst(String name,String age) {
		Students temp=new Students(name,age);
		ll.addFirst(temp);
	}
	
	public void addLast(String name,String age) {
		Students temp=new Students(name,age);
		ll.addLast(temp);
	}
	
	public void del(String name) {
		for(int i=0;i<ll.size();i++) {
			Students temp=(Students)ll.get(i);
			if(temp.getName().equals(name)) {
				ll.remove(i);
			}
		}
	}
	
	public void delFirst() {
		ll.removeFirst();
	}
	
	public void delLast() {
		ll.removeLast();
	}
	
	public void get(String name) {
		for(int i=0;i<ll.size();i++) {
			Students temp=(Students) ll.get(i);
			if(temp.getName().equals(name)) {
				System.out.println("该生姓名"+temp.getName());
				System.out.println("该生年龄"+temp.getAge());
			}
		}
	}
	
	public void print() {
		for(int i=0;i<ll.size();i++) {
			Students temp=(Students) ll.get(i);
			System.out.println("该生姓名"+temp.getName());
			System.out.println("该生年龄"+temp.getAge());
		}
	}
}
