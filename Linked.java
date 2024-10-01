package main;

public class Linked {
	public Node head;
	public int listSize;
	
	public Linked() {
		this.head = null;
		this.listSize = 0;
	}
	
	public int getValue(int index) {
		Node current = this.head;
		int value = 0;
		while(current != null) {
			if(current.index == index) {
				value = current.value;
			}
			current = current.next;
		}
		return value;
	}
	
	public void insertValue(int value) {
		if(this.head == null) {
			this.head = new Node(value, this.listSize);
			this.listSize++;
		} else {
			Node current = this.head;
			while(current != null) {
				if(current.next == null) {
					current.next = new Node(value, this.listSize);
					this.listSize++;
					return;
				}
				current = current.next;
			}
		}
	}
	
	public void show() {
		Node current = this.head;
		while(current != null) {
			System.out.print(current.next != null ? current.value + "[" + current.index + "]"  + " -> " : current.value+ "[" + current.index + "]");
			current = current.next;
		}
		System.out.println("\nTamanho: " + this.listSize);
	}
}
