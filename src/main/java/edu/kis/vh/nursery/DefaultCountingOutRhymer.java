package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!checkIfFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean checkIfFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
