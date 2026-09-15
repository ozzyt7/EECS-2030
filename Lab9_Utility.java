package Lab9;
import java.util.List;
import java.util.ArrayList;

//----------------------- Question 1 -------------------------- //
/**
 * This class contains a number of methods that 
 * works on a wide range of data types. 
 */

/* This is a parameterized class. You should decide 
* what the parameter should look like in order to 
* pass all the test cases. 
*/

// you might want to change the parameter of this class to something more appropriate. 
public class Utility <T extends Comparable<T>> {
	public List<T> list;
	
	public Utility() {
		this.list = new ArrayList<>();
	}
	
	public Utility(List<T> list) {
		this.list = list;
	}
	
	public int linearSearch(T item) {
		int position = -1;
		for (int i = 0; i < list.size(); i++) {
			if ((item).compareTo(list.get(i)) == 0) {
				position = i;
				break;
			}
			
		}
		
		return position;
		
	}
	
	public void mergeList(List<? super T> list) {
		for (T obj: this.list)
			list.add(obj);
	}
	
	public boolean containList(List<? extends T> list) {
		if (this.list.containsAll(list)){
			this.list = new ArrayList<T>();
			for (T obj: list)
				this.list.add(obj);
			return true;
		}
		else {
			return false;
		}
	}

	public void removeZero(List<? extends MyInteger> myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (MyInteger.isZero(myList.get(i))) {
				myList.remove(i);
				i--;
			}
		}
	}
	
}


// ----------------------- Question 2 -------------------------- //

/** 
 * This class represents a node that serves as a building block for a singly linked list.
**/


class Node <E>{
	private E element;
	private Node<E> next;
	
	
	/**
	 * The default constructor
	 */
	public Node() {
		this.element = null;
		this.next = null;
	}

	
	/**
	 * The copy constructor
	 * @param node is a node, whose <code> element</code> and <code> next</code> is used to make this node.
	 */
	public Node(Node<E> node) {
		this.element = node.element;
		this.next = node.next;
	}
	
	
	/**
	 * The overloaded constructor
	 * @param element is the value for the element attribute of this node
	 * @param next is the value of the next attribute  of this node
	 */
	public Node(E element, Node<E> next) {
		this.element = element;
		this.next = next;
	}
	
	
	
	
	/**
	 * The getter method for element attribute
	 * @return it returns the value of the element attribute
	 */
	
	public E getElement() {
		return element;
	}

	
	
	
	
	/**
	 * The setter method
	 * @param element is the new value for the element attribute
	 */
	public void setElement(E element) {
		this.element = element;
	}
	
	
	
	/** 
	 * The getter method for next attribute
	 * @return it returns the value of the next attribute
	 */
	public Node<E> getNext() {
		return next;
	}

	
	
	
	
	/**
	 * The setter method for the next attribute
	 * @param next is the new value for the next attribute
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	
}

// -------------------------------------------------------------------//
/**
 * This class represents a singly linked lists
 */

class SingleLinkedList <E>{
	private Node<E> head;
	
	/**
	 * the default constructor
	 */
	public SingleLinkedList() {
		this.head = null;
	}
	
	/**
	 * The overloaded constructor
	 * @param head is the node that is used for the head.
	 */
	public SingleLinkedList(Node<E> head) {
		this.head = head;
	}


	/**
	 * The getter method
	 * @return It returns the address of the head.
	 */
	public Node<E> getHead(){
		return head;
	}
	
	/**
	 * The setter method
	 * @param head is the new head's address
	 */
	public void setHead(Node<E> head) {
		this.head = head;
	}

	
	
	
	/**
	 * It insert a node at the head of the list.
	 * @param node is the node that is added to the head of the list
	 */
	public void insertAtHead(Node<E> node) {
		node.setNext(head);
		head = node;
	}
	
	
	/**
	 * It insert a node at the head of the list.
	 * @param element is the value of the element attribute of the node that is added to the head of the list
	 */
	public void insertAtHead(E element) {
		Node<E> newNode = new Node<>(element, head);
		head = newNode;
	}

	
	/**
	 * 
	 * @return returns the element stored at the head while removing the head. 
	 * if the list is empty, it returns null.
	 */
	public E removeFromHead() {
		if (head == null) {
			return null;
		}
		
		E value = head.getElement();
		head = head.getNext();
		return value;
	}

	/**
	 * It returns the content of the list. 
	 * If the list is empty it returns []. 
	 * If the list has two nodes containing A and B, it returns [AB]
	 * If the list has two node containing 1 and 2, it returns [12]
	 */
	public String toString() {
		StringBuilder list = new StringBuilder();
		list.append("[");
		
		Node<E> current = head;
		while(current != null) {
			list.append(current.getElement());
			current = current.getNext();
		}
		
		list.append("]");
		String listString = list.toString();
		
		return listString;
	}
	
}

//-----------DO NOT TOUCH THE CODE BELOW ----------------------------------------------//
/**
* This class implements a 2D points. 
*/
class Point implements Comparable<Point>{
	double x; 
	double y; 
	public Point(double x, double y) {
		this.x = x; 
		this.y = y;
	}
	@Override 
	public int compareTo(Point p) {
		if (this.x == p.x && this.y == p.y) return 0;
		else if (this.x == p.x) return 1;
		else return -1;	
	}
}

/**
* This class represents an Integer number. 
*/
class MyInteger implements Comparable<MyInteger>{
	int x; 
	public MyInteger() {
		this.x = 0; 
	}
	public MyInteger(int x) {
		this.x = x; 
	}
	public static boolean isZero(MyInteger input) {
		return input.x == 0; 
	}
	@Override
	public int compareTo(MyInteger input) {
		if (this.x == input.x ) return 0;
		else if (this.x < input.x) return -1;
		else return 1;	
	}
}

/**
 * This class represents a subset of integer numbers that are natural numbers. 
 */
class NaturalNumber extends MyInteger{
	public NaturalNumber(int x) {
		super(x);
	}
}
/**
 * This class represents the odd natural numbers. 
 */

class OddNumber extends NaturalNumber{
	public OddNumber(int x) {
		super(x);
	}
	
}
/**
 * This class represents the even natural numbers. 
 */
class EvenNumber extends NaturalNumber{
	public EvenNumber(int x) {
		super(x);
	}
}
