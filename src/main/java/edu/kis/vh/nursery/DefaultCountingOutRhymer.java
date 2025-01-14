package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MAX_SIZE = 12;
	private static final int IS_EMPTY = -1;
	private static final int IS_FULL = 11;
	// test
	private final int[] arrayOfNumbers = new int[MAX_SIZE];

	public int getTotalValue() {
		return totalValue;
	}

	private int totalValue = -1;

	public void countIn(int in) {
		if (!checkIfFull())
			arrayOfNumbers[++totalValue] = in;
	}

	public boolean callCheck() {
		return totalValue == IS_EMPTY;
	}
		
	public boolean checkIfFull() {
		return totalValue == IS_FULL;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return IS_EMPTY;
		return arrayOfNumbers[totalValue];
	}
			
	public int countOut() {
		if (callCheck())
			return IS_EMPTY;
		return arrayOfNumbers[totalValue--];
	}

}
