/**
 * 
 */
package SortandFind;

/**
 * @author Jackie-zhong
 * Î´Íê³É
 */
public class QuickSort {
	static void Sort(int t[]) {
		int temp,f,s=0;
		for(f=t.length-1;f>=0;f--) {
			temp=t[0];
			if(t[f]>temp) {
				t[s]=t[f];
				for(;s<t.length;s++) {
					if(t[s]<temp) {
						t[f]=t[s];
					}
					if(s==f) {
						t[0]=t[s];
						t[s]=temp;
						continue;
					}
				}
			}
		}
	}
}
