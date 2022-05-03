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

	/**
	 * Takes the int parameter and inserts into Rhymer
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	/**
	 * Checks if Rhymer is initialized
	 * @return Boolean
	 */
	public boolean callCheck() {
		return total == getStartValue();
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
			return getStartValue();
		return getNumbers()[total];
	}

	/**
	 *
	 * @return Last value and reduces total count
	 */
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
