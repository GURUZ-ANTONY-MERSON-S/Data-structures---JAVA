import java.util.*;

class Main {
	int arr[] = new int[8];
	int top = -1;
	public void push(int data) {
		if (top == arr.length - 1) {
			System.out.println("Stack get overflow...");
			return;
		} else {
			arr[++top] = data;
		}
	}
	public void pop() {
		if (top == -1) {
			System.out.println("Stack is underflow...");
			return;
		} else {
			System.out.println(arr[top--]+" removed from the stack.");
		}
	}
	public void peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		} else {
			System.out.println(arr[top]);
		}
	}
	public void isEmpty() {
		if (top == -1) {
			System.out.println("Yes it is empty..");
		} else {
			System.out.println("The stack has some elements...");
		}
	}
}

public class StackArray {
	public static void main(String[] args) {
		Main obj = new  Main();

		obj.push(12);
		obj.push(23);
		obj.push(343);
		obj.push(9);
		obj.push(23);
		obj.push(32);
		obj.push(2323);
        
        obj.pop();
		obj.peek();
        obj.isEmpty();
		
	}
}
