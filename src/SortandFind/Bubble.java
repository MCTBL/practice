/**
 * 
 */
package SortandFind;

/**
 * @author Jackie-zhong
 *
 */
public class Bubble {
	static void Sort(int f[]) {
		int temp=0;
		for(int first=0;first<f.length-1;first++) {
			for(int second=first+1;second<f.length;second++) {
				if(f[second]>f[first]) {
					temp=f[second];
					f[second]=f[first];
					f[first]=temp;
				}
			}
		}
	}
}
