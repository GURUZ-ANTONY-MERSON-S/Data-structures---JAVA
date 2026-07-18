import java.util.Scanner;
import java.util.Stack;

class ValidParanthesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Stack<Character> stack=new Stack<>();
		String string=sc.next();

		for(int i=0; i<string.length(); i++) {
			char ch=string.charAt(i);

			if(ch=='[' ||ch=='{' ||ch=='(') {
				stack.push(ch);
			}

			else {
				if(stack.isEmpty()) {
					System.out.println("not a valid one");
					return;
				}
			
				char top = stack.peek();

				if ((ch == '}' && top == '{') ||
				        (ch == ')' && top == '(') ||
				        (ch == ']' && top == '[')) {

					stack.pop();
				}
				else {
					System.out.println("Not a valid one");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}
		else {
			System.out.println("Not a valid one");
		}


		sc.close();
	}
}