package parctice;

import com.sun.org.apache.xpath.internal.axes.WalkerFactory;

import jdk.internal.misc.FileSystemOption;

public class practiceThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run r=new Run();
		r.start();
		
		//ͨ��ʵ��Runnable�ӿڵ��ಢû��start����
		//��Ҫ�½�������丳��һ��Thread����
		//ʹ��Thread��start��������ʵ�ֶ��߳�
		wlak R=new wlak();
		Thread t1=new Thread(R);
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
//�̳�Thread����ʵ�ֶ��߳�
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
				System.out.println(this.getClass().getName()+"�˳�");
				break;
			}
			
		}
	}
	
}

//����һ����ֻ�ܼ̳�һ�����࣬���Կ���ѡ��ʵ��Runnable�ӿ���ʵ�ֶ��߳�
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
				System.out.println(this.getClass().getName()+"�˳�");
				break;
			}
			
		}
	}
	
}