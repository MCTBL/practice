/**
 * 
 */
package SortandFind;

/**
 * @author Jackie-zhong
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[]= new int [50];
		for(int temp=0;temp<test.length;temp++) {
			test[temp]=(int)(Math.random()*50)+1;
		}
		//QuickSort.Sort(test);
		//Bubble.Sort(test);
		Insertion.Sort(test);;
		BinaryFind.BFind(0, test.length-1, 500, test);
		for(int temp:test) {
			System.out.println(temp);
		}
		
	}

}
