package Class;

public class FixedStack implements Stack{

	Employee[] arr= new Employee[STACK_SIZE];
	int top = -1;
	
	
	@Override
	public void push(Employee e) {
		if(top<STACK_SIZE-1) {
			arr[++top]=e;
			System.out.println("Pushed :"+e);
		}else {
			System.out.println("Stack is full");
		}
	}

	@Override
	public Employee pop() {
		if(top>=0) {
			Employee e=arr[top--];
			System.out.println("Poped:"+e);
			return e;
		}else {
			System.out.println("Stack is Empty");
			return null;
		}
		
	}
	
}
