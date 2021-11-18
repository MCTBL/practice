/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class Pi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=calc(10000000000l);
		System.out.println(x);
	}
	static double calc(long n) {
		int numIncycule=0;
		double x,y;
		double pi;
		for(long i=0;i<n;i++) {
			x=Math.random();
			y=Math.random();
			if(x*x+y*y<1) {
				numIncycule++;
			}
		}
		pi=(4.0*numIncycule)/n;
		return pi;
	}
}
