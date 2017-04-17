import java.util.NoSuchElementException;

public class Stack {
	private static int MAX_ELEMENTS=10 ;
	private int[] values= new int[MAX_ELEMENTS]; 

	private int size=0; public Stack() { }
	
	public void push(int x) {
		if (isFull())
			throw new IllegalStateException("Cannot add to full stack");
		else
			values[size++] = (Integer) x;
	}
	
	private boolean isFull() {
		if (size >= MAX_ELEMENTS) 
			return true;
		else
			return false;
	}
	
	public int pop() {
		if (isEmpty())
			throw new NoSuchElementException("Cannot pop from empty stack");
	 	else
			return values[--size];
	}

	private boolean isEmpty() {
		if (size == 0) 
			return true; 
		else 	
			return false;
	}
	
	public int top() {
		if (isEmpty())
			throw new NoSuchElementException("Cannot pop from empty stack");
		else
			return values[size - 1];
	}
}