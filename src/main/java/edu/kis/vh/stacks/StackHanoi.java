package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackHanoi extends StackList {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!empty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}

	

	
}
