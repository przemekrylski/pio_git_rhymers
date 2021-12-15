package edu.kis.vh.nursery.list;

public class LinkedListManager {

    Node last;
    int i;

    public void pushElement(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean checkIfListIsEmpty() {
        return last == null;
    }

    public boolean checkIfListIsFull() {
        return false;
    }

    public int checkTopValue() {
        if (checkIfListIsEmpty())
            return -1;
        return last.value;
    }

    public int popValue() {
        if (checkIfListIsEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
