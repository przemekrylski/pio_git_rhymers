package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node previousValue;
	private Node nextValue;

	// NO USELESS SETTERS
	public Node(int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(Node previousValue) {
		this.previousValue = previousValue;
	}

	public Node getNextValue() {
		return nextValue;
	}

	public void setNextValue(Node nextValue) {
		this.nextValue = nextValue;
	}
}
