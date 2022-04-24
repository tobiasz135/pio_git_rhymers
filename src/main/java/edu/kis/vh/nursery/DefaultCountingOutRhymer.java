package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int START_VALUE = -1;
	final private int[] numbers = new int[getSIZE()];

	private int total = getStartValue();

	public static int getSIZE() {
		return SIZE;
	}

	public static int getStartValue() {
		return START_VALUE;
	}

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public boolean callCheck() {
		return total == getStartValue();
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return getStartValue();
		return getNumbers()[total];
	}

	public int countOut() {
		if (callCheck())
			return getStartValue();
		return getNumbers()[total--];
	}

	public int getTotal() {
		return total;
	}

	public int[] getNumbers() {
		return numbers;
	}
}
