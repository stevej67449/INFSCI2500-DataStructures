public class LinkedList {

	// LinkedList properties
	protected Node head;
	protected Node tail;
	protected long size;

	// LinkedList constructor
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	} // End of LinkedList constructor

	// Add a Node to beginning of Linked List
	public void addFirst(Node newNode) {

		if (head == null || size == 0) {
			head = newNode;
			tail = newNode;
			size = 1;
		} else {
			newNode.setNext(head);
			head = newNode;
			size = size + 1;
		}

	} // End of addFirst method

	// Add a Node to end of Linked List
	public void addLast(Node newNode) {
		newNode.setNext(null);

		if (head == null || size == 0) {
			head = newNode;
			tail = newNode;
			size = 1;
		} else {
			// Assign the current tail's next node pointer to newNode
			tail.setNext(newNode);
			// Set to newNode to the tail position 
			// and reset its next node pointer to null
			tail = newNode;
			tail.setNext(null);
			size = size + 1;
		}

	} // End addLast method

	// Remove a Node from beginning of Linked List
	public void removeFirst(){

		if (head == null || size == 0) {
			System.out.println("The List is already empty, nothing can be removed.");
		} else {
			head = head.getNext();
			size = size - 1 ;
		}
	} // End of removeFirst method

	// Remove a node from end of Linked List
	public void removeLast(){
		if (head == null || size == 0) {
			System.out.println("The List is already empty, nothing can be removed.");
		} else {
			// Initialize tempItem at beginning of LinkedList
			Node tempItem = this.head;

			// Look through LinkedList for node that points to tail
			while(!(tempItem.getNext().equals(tail))){
				tempItem = tempItem.getNext();
			}

			// Make node pointing to tail the new tail
			tail = tempItem;

			// Reset the new tail's pointer to null
			tail.setNext(null);

			// Reduce size by one
			size = size - 1 ;
		}
	} // End of removeLast method

	public String toString() {

		String output = "START ...";
		Node nextItem;

		// Initialize nextItem at the start of Linked List
		nextItem = this.head;

		while (nextItem != null) {
			output = output + " " + nextItem.getElement();

			// Set new next item to traverse list
			nextItem = nextItem.getNext();

		} // End of while loop

		output = output + "  ... END.";

		return output;
	} // End of toString method

	public long getSize() {
		return size;
	}

} // End of LinkedList class