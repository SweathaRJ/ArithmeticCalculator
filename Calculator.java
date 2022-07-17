package arithmeticCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		Double number1,number2,result;
		//create an object of scanner class
		Scanner input=new Scanner(System.in);
		
		//ask user to enter the operator
		System.out.println("Choose an operator : +, -, * or /");
		operator=input.next().charAt(0);
		
		//ask user to enter the number
		System.out.println("Enter first number");
		number1=input.nextDouble();
		
		System.out.println("Enter second number");
		number2=input.nextDouble();
		
		switch(operator) {
		//perform addition
		 case '+':
			result=number1+number2;
			System.out.println(number1+"+"+number2+"="+result);
			break;
			
		//perform subtraction 
		  case '-':
			  result=number1-number2;
			  System.out.println(number1+"-"+number2+"="+result);
			  break;
			  
		//perform 	multiplication
		  case '*':
			  result=number1*number2;
			  System.out.println(number1+"*"+number2+"="+result);
			  break;
			  
		//perform division 
		  case '/':
			  result=number1/number2;
			  System.out.println(number1+"/"+number2+"="+result);
			  break;
			  
		  default:
			  System.out.println("Invalid operator");
			  break;
		}
		input.close();

	}

}
