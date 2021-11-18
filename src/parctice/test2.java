package parctice;

public class test2 {

	public static void main(String[] args) {
		father1 a;
		child b=new child();
		a=b;
		a.m=50;
		b.m=20;
		System.out.println(a.see(10));
		System.out.println(b.get(10));
		System.out.println(a.m);
		System.out.println(b.m);
		
	}
}
class father1{
	int m=10;
	int see(int n) {
		return m+n;
	}
	int get(int n) {
		return m+n;
	}
}

class child extends father1{
	int m=8;
	int get(int n) {
		return m+n+1;
	}
}
