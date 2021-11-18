/**
 * 
 */
package SortandFind;

/**
 * @author Jackie-zhong
 *
 */
public class BinaryFind {
	//Òª¸Ä
	static void CommonFind(int rightIndex,int leftIndex,int val,int arr[]) {
		while(rightIndex!=leftIndex) {
			int index=(rightIndex+leftIndex)/2;
			if(arr[index]<val) {
				rightIndex=index;
			}else if(arr[index]>val) {
				leftIndex=index;
			}else if(arr[index]==val) {
				System.out.println("got it!");
				return;
			}
		}
		System.out.println("we can't find it");
	}
	
	static void BFind(int leftIndex,int rightIndex,int val,int arr[]) {
		int index=(rightIndex+leftIndex)/2;
		if(leftIndex==index) {
			System.out.println("we can't find it");
		}else if(arr[index]<val){
			BFind(index,rightIndex,val,arr);
		}else if(arr[index]>val) {
			BFind(leftIndex,index,val,arr);
		}else if(arr[index]==val) {
			System.out.println("got it!");
		}
	}
}
