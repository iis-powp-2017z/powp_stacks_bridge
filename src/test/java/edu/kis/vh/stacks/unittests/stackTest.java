package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;
import edu.kis.vh.stacks.stack;

/*
	Błedy w testach były spowodowane zmianą wartości zwracanej przez funkcje pop() i peek() gdy stos jest pusty wykonanej w punkcie 11.
	Bląd wystepuje także podczas sprawdznaia czy stos jest pełny w momencie korzytsania z implementacji StackList, która
	nie posiada ogranoczenia w wielkosci stosu.

*/

public class stackTest {
	
	@Test
	public void testPush() {
		stack stackObj = new stack(new StackArray());
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		stack stackObj = new stack(new StackArray());
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		stack stackObj = new stack(new StackList());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		stack stackObj = new stack(new StackArray());
		final int EMPTY_STACK_VALUE = 0;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		stack stackObj = new stack(new StackArray());
		final int EMPTY_STACK_VALUE = 0;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
