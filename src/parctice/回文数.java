/**
 * 
 */
package parctice;

//import java.util.Scanner;

/**
 * @author Jackie-zhong
 *
 */
public class »ØÎÄÊı {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g,s,b,q,w,i,z=0;
		//Scanner x=new Scanner(System.in);
		//i=x.nextInt();
		for(i=0;i<=100000;i++) {
			w=i/10000;
			q=(i%10000)/1000;
			b=(i%1000)/100;
			s=(i%100)/10;
			g=i%10;
			//System.out.println(g+10*s+100*b+1000*q+10000*w);
			if(i<1000) {
				if(g==b) {
					System.out.print(i+"  ");
					z++;
				}
			}else if(1000<=i&&i<10000) {
				if(g==q&&b==s) {
					System.out.print(i+"  ");
					z++;
				}
			}else{
				if(w==g&&s==q) {
					System.out.print(i+"  ");
					z++;
				}
			}
			if(z==10) {
				System.out.println();
				z=0;
			}
		}
		//x.close();
	}

}
