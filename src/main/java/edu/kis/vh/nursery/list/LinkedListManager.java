package edu.kis.vh.nursery.list;

public class LinkedListManager {

	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean checkIfEmpty() {
		return last == null;
	}

	public boolean checkIfFull() {
		return false;
	}

	public int checkTopValue() {
		if (checkIfEmpty())
			return -1;
		return last.value;
	}

	public int popValue() {
		if (checkIfEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
