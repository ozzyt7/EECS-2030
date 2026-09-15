package Lab7;

import java.util.*;
import java.io.*;
/**
 * This class is a container that holds an unlimited number of 
 * String objects. It is able to remove objects and add objects.
 */

public class Container {
	// No instance variable should be defined for this class. 


	/**
	 * Reads the given file and add it into a list. 
	 * Each element of the list contains one line of the file. 
	 * @param fileName is the name of the file that is read in this method. 
	 */

	public static final List<String> readFile(String fileName) {
		
		ArrayList<String> list = new ArrayList<>();
		
		try {
			Scanner scannerObject = new Scanner(new File(fileName));
			
			while (scannerObject.hasNextLine()) {
				list.add(scannerObject.nextLine());
			}
			
			scannerObject.close();
		
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		}
		
		
		return list;
		
	}
		
	/**
	 * This method adds the <code> obj </code> to the container.
	 * @param obj is the object that is added to the container.
	 */
	
	void add(Object object) {
		// insert your code here
	}

	/**
	 * This method removes the object from the container
	 * @return returns the removed object.
	 */
	Object remove() {
		// insert your code here, you may want to change the return value
		return null; 
	}

	/**
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		// insert your code here. You may want to change the return value. 
		return 0;
	}

}

/**
 * 
 * This class simulates a Queue, which is a data structure that insert and remove data 
 * by FIFO (first-in, first-out) rule
 *
 */
class Queue extends Container{
	ArrayList<String> queue; 
	
	/**
	 * This is the constructor that initializes the <code> queue </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Queue"
	 * @param fileName is the name of the file that is read.  
	 */
	public Queue(String fileName) {
		queue = new ArrayList<>();
		try {
			Scanner scannerObject = new Scanner(new File(fileName));
			
			while (scannerObject.hasNextLine()) {
				String currentLine = scannerObject.nextLine();
				if (currentLine.startsWith("Queue")) {
					
					String lineAdd = currentLine.replace("Queue", "").trim();
					queue.add(lineAdd);
				}
				
			}
			
			scannerObject.close();
		
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}
	
	/**
	 * This method adds the object into the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 * @param obj is the object that is added to the queue. 
	 */
	@Override
	public void add(Object obj) {
		queue.add((String) obj);
	}
	
	/**
	 * This method removes an object from the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 */
	@Override
	public Object remove() {
		if (!queue.isEmpty()) {
			return queue.remove(0);
			
		}
		return null;
	}
	
	/**
	 * @return returns the object which is in front of the queue.
	 */
	public Object top() {
		if (!queue.isEmpty()) {
			int topIndex = queue.size() - 1; 
			
			return queue.get(topIndex); 
		}
		
		return null;
	}
	
	/**
	 * Returns the number of items in the queue.
	 */
	@Override 
	public int getSize(){
		
		return queue.size();
	}
}

/**
 * 
 * This class simulates a Stack, which is a data structure that insert and remove data 
 * by FILO (first-in, last-out) rule
 *
 */
class Stack extends Container{
	ArrayList<String> stack; 
	
	/**
	 * This is the constructor that initializes the <code> stack </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Stack"
	 * @param fileName is the name of the file that is read.  
	 */
	public Stack(String fileName) {
		stack = new ArrayList<>();
		
		try {
			Scanner scannerObject = new Scanner(new File(fileName));
			
			while (scannerObject.hasNextLine()) {
				String currentLine = scannerObject.nextLine();
				
				if (currentLine.startsWith("Stack")) {
					
					String lineAdd = currentLine.replace("Stack", "").trim();
					stack.add(lineAdd);
					
				}
			}
			scannerObject.close();
			
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}
	
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public void add(Object obj) {
		stack.add((String) obj);
	}
	
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public Object remove() {
		if (!stack.isEmpty()) {
			return stack.remove(stack.size() - 1);
			
		}
		return null;
	}
	
	/**
	 * @return returns the object which is on top of the stack.
	 */
	
	public Object top() {
		if (!stack.isEmpty()) {
			int topIndex = stack.size() - 1; 
			
			return stack.get(topIndex); 
		}
		
		return null;
	}
	
	/**
	 * Returns the number of items in the stack.
	 */
	@Override 
	public int getSize() {
		return stack.size();
		
	}
}