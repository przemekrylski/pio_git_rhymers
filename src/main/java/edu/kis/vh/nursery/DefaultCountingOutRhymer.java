package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] arrayOfNumbers = new int[12];

	public int totalValue = -1;

	public void countIn(int in) {
		if (!checkIfFull())
			arrayOfNumbers[++totalValue] = in;
	}

	public boolean callCheck() {
		return totalValue == -1;
	}
		
	public boolean checkIfFull() {
		return totalValue == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return arrayOfNumbers[totalValue];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return arrayOfNumbers[totalValue--];
	}

}
