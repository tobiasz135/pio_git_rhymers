package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int START_VALUE = -1;
	final private int[] numbers = new int[SIZE];

	public int total = START_VALUE;

	/**
	 * Takes the int parameter and inserts into Rhymer
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Checks if Rhymer is initialized
	 * @return Boolean
	 */
	public boolean callCheck() {
		return total == START_VALUE;
	}

	/**
	 * Checks if Rhymer is full
	 * @return Boolean
	 */
	public boolean isFull() {
		return total == 11;
	}


	/**
	 *
	 * @return Last value in 'numbers'
	 */
	protected int peekaboo() {
		if (callCheck())
			return START_VALUE;
		return numbers[total];
	}

	/**
	 *
	 * @return Last value and reduces total count
	 */
	public int countOut() {
		if (callCheck())
			return START_VALUE;
		return numbers[total--];
	}

}
