package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY_STACK_VALUE = -1;

	private final int[] items;

	private int total = EMPTY_STACK_VALUE;

	private final int capacity;

	public Stack(int capacity) {
		this.capacity = capacity;
		this.items = new int[capacity];
		;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == capacity - 1;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

	public int getTotal() {
		return total;
	}

}
