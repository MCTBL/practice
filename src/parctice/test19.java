package parctice;

import java.util.Iterator;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[20];
		
	}
	
	class PeekingIterator implements Iterator<Integer> {
	    Iterator<Integer> temp;
		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    temp=iterator;
		}
		
	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
	        
			return 1;
		}
		
		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
		    return temp.next();
		}
		
		@Override
		public boolean hasNext() {
		    return temp.hasNext();
		}
	}
}
