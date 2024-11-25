package behavioural.interpreter;

//Client
public class Main {

	public static void main(String[] args) {
		// Example: (5 + 3) - 2

		// Build the expression tree
		Expression five = new Number(5);
		Expression three = new Number(3);
		Expression two = new Number(2);

		Expression addition = new Add(five, three);  // 5 + 3
		Expression subtraction = new Subtract(addition, two); // (5 + 3) - 2

		// Interpret the expression
		int result = subtraction.interpret();
		System.out.println("Result: " + result); // Output: 6
	}

}
