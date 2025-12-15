package javaprogramming;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Calculator");
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		
		int firstnum,secondnum;
		double answer;
		char operator , choice;
		
		
		while(!exit) {
			System.out.println("Enter first number");
			
			firstnum = input.nextInt();
			System.out.println("Enter operator");
			operator = input.next().charAt(0);
			System.out.println("Enter second number");
			secondnum = input.nextInt();

			switch(operator) {
			
			case '+':answer = add(firstnum,secondnum);
			System.out.println("answer is " + answer);
			break;
			
			case '-':answer = sub(firstnum,secondnum);
			System.out.println("answer is " + answer);
			break;
			
			case '*':answer = mult(firstnum,secondnum);
			System.out.println("answer is " + answer);
			break;
			
			case '/':answer = div(firstnum,secondnum);
			System.out.println("answer is " + answer);
			break;
			default:System.out.println("Wrong operator");		
			
			}
			System.out.println("do u want close?(y/n)");
			choice = input.next().charAt(0);
			if(choice =='y') {
				exit = true;
			}

			
		}
		
	}
	public static double add(int first , int second) {
		return first+second;
	}
	public static double sub(int first , int second) {
		return first-second;
	}
	public static double mult(int first , int second) {
		return first*second;
	}
	public static double div(int first , int second) {
		double result;
		result = (double) first / second;
		return result;
	}
}
