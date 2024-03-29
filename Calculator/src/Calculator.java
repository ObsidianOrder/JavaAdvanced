import java.util.ArrayList;


public class Calculator {
	
	ArrayList <String> operators;
	ArrayList <Integer> numbers;
	
	
	public Calculator() {
	operators = new ArrayList <String> ();
	numbers = new ArrayList <Integer> ();
	
		
	}
	
	
	
	
	
	 public int calculate(String expr) {
		 numbers.clear();
		 operators.clear();
		 
		 
		 String[] parts = expr.split(" ");
		 for (String part : parts) {
			 if( part.equals("(")) {
			 operators.add(part);
			 }
			 else if ( part.equals(")")) {
				while (! lastOperator().equals("(")) {
					reduce();
				}
				operators.remove(operators.size() - 1);
			 }
			 
			 else if(part.equals("*") || part.equals("+") || part.equals("-") || part.equals("/")) {
			while (shouldReduce(part)) {
				reduce();
			}
			addOperator(part);
			}
			else { 
				addNumber(part);
		 }
	}
		 while (operators.size() > 0 ) {
			 reduce();
		 }
		 return numbers.get(0);
	 }
	 
	 private void reduce() {
		int num1 = numbers.remove(numbers.size()-1);
		int num2 = numbers.remove(numbers.size()-1);
		String op = operators.remove(operators.size()-1); //Removing the last element from the list
		if (op.equals("+")) {
			numbers.add(num1 + num2);
		}
		if (op.equals("-")) {
			numbers.add(num2 - num1);
		}
		if (op.equals("/")) {
			numbers.add(num2 / num1);
		}
		if (op.equals("*")) {
			numbers.add(num1 * num2);
		}
		
	 }
	 
	 private void addNumber(String number) {
		 int value = Integer.parseInt(number);
		 numbers.add(value);
	 }
	 
	 private void addOperator(String operator) {
		operators.add(operator); 
	 }
	 
	 private boolean shouldReduce(String op) {
		precedence(lastOperator());
		 
		 
		 if (precedence(lastOperator()) >= precedence(op)) {
			return true;
		 }
		 return false;
		 
	 }
	 
	 private int precedence(String operator) {
		if (operator.equals("+") || operator.equals("-")){
		return 1;
		}
		if (operator.equals("*") || operator.equals("/")){
			return 2;
			}
		 return 0;
	 }
	 
	 private String lastOperator() {
		 if (operators.size() > 0) {
		  return operators.get(operators.size() - 1);
	 }
		return "";
	 
}
}
