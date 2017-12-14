public class TestLinkedList {

	// Extra for addLast, removeFirst, etc.

	public static void main (String[] args) {

		// Create a blank LinkedList 
		LinkedList myList = new LinkedList();

		// Create Node objects
		Node m = new Node("Ed", null);
		Node n = new Node("Mary", null); 
		Node p = new Node("Anne", null);

		// Add the Nodes to the Linked List using addFirst method
		myList.addFirst(m);
		myList.addFirst(n);
		myList.addFirst(p);

		// Print the Linked List in order

		System.out.println("***** addFirst Method Test *****");

		System.out.println(myList);

		System.out.println("Size = " + myList.getSize() + "\n");

		// Test adding a node to end of Linked List
		System.out.println("***** addLast Method Test *****");

		Node q = new Node("Joe", null);

		myList.addLast(q);

		System.out.println(myList);

		System.out.println("Size = " + myList.getSize() + "\n");

		// Test removing first node from List
		System.out.println("***** removeFirst Method Test *****");		
		myList.removeFirst();		
		System.out.println(myList);
		System.out.println("Size = " + myList.getSize() + "\n");


		// Test removing last node from list
		System.out.println("***** removeList Method Test *****");		
		myList.removeLast();
		System.out.println(myList);
		System.out.println("Size = " + myList.getSize() + "\n");

		// Test removing a node from an empty list
		System.out.println("***** Remove Node From Empty List Test *****");		
		LinkedList emptyList = new LinkedList();
		emptyList.removeFirst();
	} // End of main method

} // End of TestLinkedList class