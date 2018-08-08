/**
 * 
 */
package com.gc.lists;

/**
 * @author CoderBoyKado
 *
 */
public class ListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		MyList list = new MyArrayList();
//		test(list);
		MyList list = new MyLinkedList();
		test(list);
		
	}
	
	private static void test(MyList list) {
		list.addAtBeginning("3");
		list.addAtBeginning("2");
		list.addAtBeginning("1");
		list.addAtBeginning("0");
		
		// list.removeFromEnd();
		//list.removeFromBeginning();
		//list.addAtEnd("b");
		// list.removeAtIndex(1);
		// list.insertAtIndex(1, "s");
		
		System.out.println(list);
		list.removeAtIndex(2);
		System.out.println(list);
		System.out.println(list.size());
		
	}
	
}
