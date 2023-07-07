package java_practice_june;

public class Counter {

	private volatile int count = 0;

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
