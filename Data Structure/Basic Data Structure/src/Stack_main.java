import java.util.*;

/***
 * Data Structure 
 * This is a stack class for the data type integer and the size can be applied Dynamically.
 */
class Stack {
	int tos;
	int stack_data[];
	int stack_size;

	Stack(int stack_size) {
		stack_data = new int[stack_size];
		this.stack_size = stack_size;
		tos = -1;
	}

	void push(int value) {
		if (tos == (stack_size - 1)) {
			System.out.println("The stack is full");
		} else {
			stack_data[++tos] = value;
			System.out.println("the value pushed is " + value + " and the size of the stack is " + (stack_size-(tos+1)));
		}
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			int poped_value = stack_data[tos--];
			return poped_value;
		}

	}

}

public class Stack_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack size");
		int size_stack = sc.nextInt();
		Stack stack = new Stack(size_stack);
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 10; i++) {
			int value = stack.pop();
			if (value == -1) {
			} else {
				System.out.println("Value of the poped element is " + value);
			}
		}
		

	}

}
