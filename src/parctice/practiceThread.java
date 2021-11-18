package parctice;

import com.sun.org.apache.xpath.internal.axes.WalkerFactory;

import jdk.internal.misc.FileSystemOption;

public class practiceThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run r=new Run();
		r.start();
		
		//通过实现Runnable接口的类并没有start方法
		//需要新建对象后将其赋予一个Thread对象
		//使用Thread的start方法即可实现多线程
		wlak R=new wlak();
		Thread t1=new Thread(R);
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
//继承Thread类来实现多线程
class Run extends Thread{
	int count=0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		while(true) {
			System.out.println(++count);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(count==50) {
				System.out.println(this.getClass().getName()+"退出");
				break;
			}
			
		}
	}
	
}

//由于一个类只能继承一个父类，所以可以选择实现Runnable接口来实现多线程
class wlak implements Runnable{
	int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		while(true) {
			System.out.println(++count);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(count==50) {
				System.out.println(this.getClass().getName()+"退出");
				break;
			}
			
		}
	}
	
}