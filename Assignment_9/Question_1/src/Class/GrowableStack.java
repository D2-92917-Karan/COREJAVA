package Class;

import java.util.Arrays;

public class GrowableStack implements Stack {

	private Employee[] empStack;
	private int top;
	
	public GrowableStack() {
		empStack=new Employee[STACK_SIZE];
		top=-1;
	}
	
	@Override
	public void push(Employee e) {
		if(top==empStack.length-1) {
			empStack=Arrays.copyOf(empStack, empStack.length*2);
			System.out.println("Stack Capacity:"+empStack.length);
		}
		empStack[++top]=e;
		System.out.println("Employee pushed:"+e);
	}

	@Override
	public Employee pop() {
		if(top>=0) {
			Employee e= empStack[top--];
			System.out.println("Employee poped:"+e);
			return e;
		}else {
			System.out.println("Stack is Empty");
			return null;
		}
	}
	
}
