public class Linked {
	public Node head;
	
	public Linked() {
		this.head = null;
	}
	
	public boolean valueHasInserted(int value) {
		Node current = this.head;
		while(current != null) {
			if(current.value == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void insertValue(int value) {
		if(this.head == null) {
			this.head = new Node(value);
		} else {
			Node current = this.head;
			while(current != null) {
				if(current.next == null) {
					current.next = new Node(value);
					return;
				}
				current = current.next;
			}
		}
	}

	public void deleteValue(int value) {
		if(this.head.value == value) {
			this.head = this.head.next;
			return;
		}
		Node current = this.head;
		Node previous = null;
		while(current != null) {
			if(current.value == value) {
				previous.next = current.next;
				return;
			}
			previous = current;
			current = current.next;
		}
	}
	
	public void show() {
		Node current = this.head;
		while(current != null) {
			System.out.print(current.next != null ? current.value + " -> " : current.value);
			current = current.next;
		}
	}
}
