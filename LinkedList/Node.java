public class Node {

	// Class Properties
	private String elt;
	private Node next;

	// Node Constructor
	public Node(String s, Node n) {
		this.elt = s;
		this.next = n;
	} // end of Node constructor

	// Override toString Method
	public String toString(){
		return this.getElement();
	}

	// Getters
	public String getElement() {
		return this.elt;
	}

	public Node getNext() {
		return this.next;
	} // End of Getter methods

	// Setters
	public void setElement(String newElt) {
		this.elt = newElt;
	}

	public void setNext(Node newNext) {
		this.next = newNext;
	} // End of Setter methods

} // End of Node class