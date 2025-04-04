package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		System.out.println(stack);
		int result = stack.pop();
		System.out.printf("Result %d%n", result);
		System.out.println(stack);
	}

}
