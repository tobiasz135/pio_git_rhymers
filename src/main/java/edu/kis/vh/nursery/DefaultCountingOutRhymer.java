package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int START_VALUE = -1;
	final private int[] numbers = new int[SIZE];

	private int total = START_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == START_VALUE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return START_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return START_VALUE;
		return numbers[total--];
	}

}
