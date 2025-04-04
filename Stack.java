package stack;

public class Stack {
	private IntNode head;
	private int size;
	
	public Stack() {
		head = null;
		size = 0;
	}
	
	public void push(int data) {
		head = new IntNode(data, head);
		size++;
	}
	
	public int pop() {
		int data = 0;
		if(head != null) {
			data = head.getData();
			head = head.getLink();
			size--;
		}
		else {
			throw new NullPointerException();
		}
		return data;
	}
	
	public int peek() {
		if(head != null) {
			return head.getData();
		}
		else {
			throw new NullPointerException();
		}
	}
	
	public String toString() {
		String stack = "";
		for(IntNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			stack = stack + String.format("%d%n", cursor.getData());
		}	
		return stack;
	}
	
	public int getSize() {
		return this.size;
	}
}
