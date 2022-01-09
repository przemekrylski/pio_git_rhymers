package edu.kis.vh.nursery.list;

public class LinkedListManager {

    private static final int IS_EMPTY = -1;
    private Node lastValue;
    int i;

    public void pushElement(int i) {
        if (lastValue == null)
            lastValue = new Node(i);
        else {
            lastValue.setNextValue(new Node(i));
            lastValue.getNextValue().setPreviousValue(lastValue);
            lastValue = lastValue.getNextValue();
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
        return lastValue.getValue();
    }

    public int popValue() {
        if (checkIfListIsEmpty())
            return IS_EMPTY;
        int result = lastValue.getValue();
        lastValue = lastValue.getPreviousValue();
        return result;
    }

}
