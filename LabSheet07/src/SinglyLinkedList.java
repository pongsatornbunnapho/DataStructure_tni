class Node {
	public int  data;
	public Node next;
	
	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String displayList() {
		boolean first = true;
		String  display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
        return head == null;
	}
	
	public void append(int value) {
		Node new_node = new Node(value);
		if (isEmpty()) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
		}
	}
	
	public Object get(int position) {
		if (position < 0 || isEmpty()) {
			return null;
		}
		
		Node current = head;
		int index = 0;
		
		while (current != null) {
			if (index == position) {
				return current.data;
			}
			current = current.next;
			index++;
		}
		
		return null;
	}
	
	public void set(int position, int value) {
		if (position < 0 || isEmpty()) {
			return;
		}
		
		Node current = head;
		int index = 0;
		
		while (current != null) {
			if (index == position) {
				current.data = value;
				return;
			}
			current = current.next;
			index++;
		}
	}
	
	public boolean contains(int value) {
		if (!isEmpty()) {
			Node current_node = head;
			while (current_node != null && current_node.data != value) {
				current_node = current_node.next;
			}
			if (current_node != null) {
				return true;
			}
		}

		return false;
	}

	public void addAll(SinglyLinkedList otherlist) {
		if (otherlist == null || otherlist.isEmpty()) {
			return;
		}
		
		if (!isEmpty()) {
			tail.next = otherlist.head;
			tail = otherlist.tail;
		} else {
			head = otherlist.head;
			tail = otherlist.tail;
		}
	}
}