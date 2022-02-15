package lab4;

public class StackOfIntegers {

	private int[] elements;
	private int size = -1; // no of integers in stack

	public StackOfIntegers() {
		elements = new int[16];
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public boolean empty() {
		boolean bool = false;

		if (size == -1) {
			bool = true;
		}

		return bool;
	}

	public int peek() {

		int topOfStack;

		topOfStack = elements[size];

		return topOfStack;
	}

	public void push(int value) {

		elements[++size] = value;

	}

	public int pop() {

		int lastV = elements[size--];

		return lastV;
	}

	public int getSize() {
		return elements.length;
	}

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

	}

}
