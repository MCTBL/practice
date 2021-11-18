/**
 * 
 */
package SortandFind;

/**
 * @author Jackie-zhong
 *
 */
public class Insertion {
	static void Sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int insertionVal=arr[i];
			int index=i-1;
			while(index>=0&&arr[index]>insertionVal) {
				arr[index+1]=arr[index];
				index--;
			}
			arr[index+1]=insertionVal;
		}
	}
}
