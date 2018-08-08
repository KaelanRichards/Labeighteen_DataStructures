/**
 * 
 */
package com.gc.lists;

import java.util.Arrays;

/**
 * @author CoderBoyKado
 *
 */
public class MyArrayList implements MyList {

	String[] array = new String[4];
	
	int length = 0;
	
	private boolean isFull() {

		return length == array.length;
		
	}
	
	private void doubleLength() {
		
		// make a new coopy of the array that is twice as long to make array dynamic
		array = Arrays.copyOf(array, array.length * 2);
		
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#addAtBeginning(java.lang.String)
	 */
	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}
		
		// Loop backwards and shift all the items over to make room for new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		// Set first element and increment length
		array[0] = data;
		length++;
		
	}

	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#removeFromBeginning()
	 */
	@Override
	public void removeFromBeginning() {
		array[0] = null;
		for (int i = 0; i < length - 1; i++) {
			array[i] = array[i + 1];
		}
		
		length--;
	}

	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#addAtEnd(java.lang.String)
	 */
	@Override
	public void addAtEnd(String data) {
		// if our array is out of space, double size
		if (isFull()) {
			doubleLength();
		}
		// set the next item in the arrau and increment the length
		array[length] = data;
		length++;
		
		
		
	}

	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#removeFromEnd()
	 */
	@Override
	public void removeFromEnd() {
		// Clear the last spot and decrement the length
		array[length - 1] = null;
		length--;
	}

	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#get(int)
	 */
	@Override
	public String get(int index) {
		
		return array[index];
		
	}

	/* (non-Javadoc)
	 * @see com.gc.lists.MyList#size()
	 */
	@Override
	public int size() {
		
		return length;
	}

	@Override
	public void removeAtIndex(int index) {
		array[index] = null;
		for (int i = index; i < length - 1; i++){
			array[i] = array[i + 1];
		}
		length--;
	}
	
	@Override
	public void insertAtIndex(int index, String s) {
		if (isFull()) {
			doubleLength();
		}
		
		for (int i = length ; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = s;
		length++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for(int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}
		
		sb.append(" ]");
		return sb.toString();
	}

	
}
