import java.util.*;
import java.text.*;
public class Calculator {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat  formatter = new DecimalFormat("#, ###, ### . ##");
		System.out.println("Simple Calculator!");
		System.out.println("Enter a number: ");
		double number1 = scan.nextDouble();
		System.out.print("Enter another number: ");
		double number2 = scan.nextDouble();
		System.out.println("Mathmatical Operators: \n1 - Addition"
				+ "\n2 - Subtraction \n3 - Multiplication \n4 - Division" );
		System.out.println("Please enter your choice. ");
		int operator = scan.nextInt();
		if (number2 == 0 && operator == 4)
		{
			System.out.println("You cannot divide by zero. ");
		}else{
			System.out.println("The results is "+
					formatter.format(calculate(number1 , number2 ,operator )));
		}
		}
	public static double calculate(double number1 , double number2, int operator){
	if(operator ==1){
		return number1 + number2;
		}else if(operator ==2){
			return number1 - number2;
		}else if(operator ==3){
			return number1 * number2;
		}else{
			return number1/number2;
		}
	}
	}
	
