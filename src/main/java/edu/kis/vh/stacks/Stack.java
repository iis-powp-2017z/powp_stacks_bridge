package edu.kis.vh.stacks;
//test 22.10.2017
public class Stack {

	private static final int EMPTYSTACK = -1;

	private static final int TABLESIZE = 12;

	private int[] ITEMS = new int[TABLESIZE];	

	public int total = EMPTYSTACK;
	
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
		public boolean isEmpty() {
			return total == EMPTYSTACK;
		}
		
			public boolean isFull() {
				return total == 11;
			}
			
				public int top() {
					if (isEmpty())
						return EMPTYSTACK;
					return ITEMS[total];
				}
				
					public int pop() {
						if (isEmpty())
							return EMPTYSTACK;
						return ITEMS[total--];
					}
				
}
