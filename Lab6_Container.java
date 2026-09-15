package Lab6;

public class Container {
	// do not change the value of the following constant.
	protected final int ORIGINAL_SIZE = 10; 
	protected Object[] list; // is a container that stores the element of MyList
	protected Object[] set; // is a container that stores the element of MySet
	protected int size; // this variable holds the actual number of elements that are stored in either of the containers (i.e. MyList or MySet).
	
	
	/**
	 * This method adds the <code> obj </code> to the end of the container.
	 * @param obj is the object that is added to the container.
	 */
	void add(Object obj) {
		// insert your code here. Only one line should be added here.
		list[size++] = obj;

	}

	/**
	 * This method removes the <code> obj </code> from the container. 
	 * It shifts all the elements to make sure that removal of the element
	 * does not create a whole in the container.
	 * @param obj is the object that is removed from the container. 
	 * @return It returns the object that was removed.
	 */
	Object remove(Object obj) {
		Object removedElem = null;
		
		for (int i = 0; i < size; i++) {
			if (list[i].equals(obj)) {
				removedElem = list[i];
				
				for (int j = i; j < size - 1; j++) {
					list[j] = list[j + 1];
				}
				
				list[size - 1] = null;
				size--;
				break;
			}
		}
	
		return removedElem;
		
	}
	
	
	/**
	 * This method returns true if the container is empty.
	 * @return It returns true if the container is empty, otherwise false.
	 */
	boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * This method returns the number of elements stored in the container.
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		return size;
	}

}

/**
 * 
 * This class simulates an ArrayList, where you can add unlimited number of 
 * elements to the list.
 *
 */


class MyList extends Container{
	/**
	 * This is the default constructor that sets all the instance variables to their defualt value. 
	 */
	public MyList () {
		list = new Object[ORIGINAL_SIZE];
		size = 0;
	}
	
	/**
	 * This method returns the element that is stored at index <code> index </code>.
	 * @param index is the<code> index </code> at which the element is accessed and returned. 
	 * @return it returns the element stored at the given <code> index </code>.
	 */
	public Object get(int index) {
		return list[index]; 	
		
	}
	/**
	 * This method overrrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> list </code> array. 
	 * The original size of the <code> array </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this array. In case the array does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> list </code> array.     
	 */
	@Override
	void add(Object obj) {
		
		if(size == list.length) {
			Object[] extendedList = new Object[list.length * 2];
			
			for (int i = 0; i < size; i++) {
				extendedList[i] = list[i];
			}
			
			list = extendedList;
		}
		
		super.add(obj);
		
	}
	
	
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> list </code>
	 * @pre <code> obj </code> exists in the <code>list</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		Object removedElem = null;
		
		for (int i = 0; i < size; i++) {
			if (list[i].equals(obj)) {
				removedElem = list[i];
				
				for (int j = i; j < size - 1; j++) {
					list[j] = list[j + 1];
				}
				
				list[size - 1] = null;
				size--;
				break;
			}
		}
	
		return removedElem;
	}
	

	/**
	 * This method returns the elements of the MyList in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	@Override
	public String toString() {
		// insert your code here. You may want to change the return value.
		
		StringBuilder arrayString = new StringBuilder();
		arrayString.append("[");
		
		for(int i = 0; i < size - 1; i++) {
			arrayString.append(list[i]);
			arrayString.append(" ");
			
			
		}
		
		arrayString.append(list[size - 1]);
		arrayString.append("]");
		
		String arrayToString = arrayString.toString();
		
		return arrayToString;
	}


}

class MySet extends Container{
	public MySet() {
		set = new Object[ORIGINAL_SIZE];
		size = 0;
	}
	
	/**
	 * This method overrrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> set </code> array. 
	 * The original size of the <code> set </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this set. In case the set does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> set </code> array.      
	 */
	
	@Override
	void add(Object obj) {
		
		for (int j = 0; j < size; j++) {
			if(set[j].equals(obj)) {
				return;
			}
		}
		
		if (size == set.length) {
			Object[] extendedSet = new Object[set.length * 2];
			
			for(int i = 0; i < size; i ++) {
				extendedSet[i] = set[i];
			}
			
			set = extendedSet;
			
		}
		
		set[size] = obj;
		size++;
	}
	
	
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> set </code>
	 * @pre <code> obj </code> exists in the <code>set</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		Object removedItem = null;
		
		for (int i = 0; i < size; i++) {
			if (set[i].equals(obj)) {
				removedItem = set[i];
				
				for (int j = i; j < size - 1; j++) {
					set[j] = set[j + 1];
				}
				
				set[size - 1] = null;
				size--;
				break;
			}
		} 
		
		return removedItem;
	}
	

	/**
	 * This method returns the elements of the MySet in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	
	@Override
	public String toString() {
		StringBuilder arrayString = new StringBuilder();
		arrayString.append("[");
		
		for(int i = 0; i < size - 1; i++) {
			arrayString.append(set[i]);
			arrayString.append(" ");
			
		}
		
		arrayString.append(set[size - 1]);
		arrayString.append("]");
		
		String arrayToString = arrayString.toString();
		
		return arrayToString;
	}
	
}

