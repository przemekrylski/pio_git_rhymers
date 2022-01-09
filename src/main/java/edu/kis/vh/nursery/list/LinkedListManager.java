package edu.kis.vh.nursery.list;

public class LinkedListManager {

    private static final int IS_EMPTY = -1;
    private Node lastValue;
    int i;

    public void pushElement(int i) {
        if (lastValue == null)
            lastValue = new Node(i);
        else {
            lastValue.nextValue = new Node(i);
            lastValue.nextValue.previousValue = lastValue;
            lastValue = lastValue.nextValue;
        }
    }

    public boolean checkIfListIsEmpty() {
        return lastValue == null;
    }

    public boolean checkIfListIsFull() {
        return false;
    }

    public int checkTopValue() {
        if (checkIfListIsEmpty())
            return IS_EMPTY;
        return lastValue.value;
    }

    public int popValue() {
        if (checkIfListIsEmpty())
            return IS_EMPTY;
        int result = lastValue.value;
        lastValue = lastValue.previousValue;
        return result;
    }

}
