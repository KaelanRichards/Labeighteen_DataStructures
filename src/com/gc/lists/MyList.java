/**
 * 
 */
package com.gc.lists;

/**
 * @author CoderBoyKado
 *
 */
public interface MyList {
	
	
	void addAtBeginning(String data);
	
	
	void removeFromBeginning();
	
	
	void addAtEnd(String data);
	
	
	void removeFromEnd();
	
	void removeAtIndex(int index);
	
	void insertAtIndex(int index, String s);
	
	
	String get(int index);
	
	
	int size(); // How many items are in the list
	
	
	
}
