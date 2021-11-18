/**
 * 
 */
package п║сно╥;

/**
 * @author Jackie-zhong
 *
 */
public class computer {
	static int point=0;
	void cards() {
		int x=(int)((Math.random()*13)+1);
		//System.out.println(x);
		if(x<=9) {
			while(Math.random()>0.2) {
				x+=(int)((Math.random()*13)+1);
				//System.out.println(x);
				if(x>21) {
					point=-1;
					return;
				}
			}
		}else {
			while(Math.random()>0.6) {
				x+=(int)((Math.random()*13)+1);
				//System.out.println(x);
				if(x>21) {
					point=-1;
					return;
				}
			}
		}
		point=x;
		//point=(int)((Math.random()*31.5)+1);
	}
	void clear() {
		computer.point=0;
	}
}
