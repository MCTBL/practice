package parctice;

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i=0;
		short a=0;
		System.out.println(Integer.MAX_VALUE);
		long y=1515556626555555l;
		
		float b=1.1f;
		double q=0;
		
		char n='��';
		String m="�������";
		
		student xiaoming=new student();
		xiaoming.pen=10;
		xiaoming.book=5;
		
		student xiaohua=new student();
		xiaohua.pen=1;
		xiaohua.book=2;
		
		xiaohua.Speak();
		xiaoming.NoSetter(1887415157);
		
		System.out.println(xiaoming.NoGtter());
	}

}

class student{
	int pen;
	int book;
	static String school="�����߼�";
	
	void Speak() {
		System.out.println("����"+pen);
		System.out.println("����˹�߻�");
	}
	
	private int No;
	void NoSetter(int no) {
		this.No=no;
	}
	
	int NoGtter() {
		return No;
	}
}
