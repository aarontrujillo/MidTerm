package classlabs;

import java.util.*;


public class lab3b 
{
	public static void main(String [] args)
	{

	int computerNum = (int)(Math.random()*10);
	Scanner input = new Scanner(System.in);

	System.out.println("Guess a number between 1 to 10: ");
	int guess = input.nextInt();
	System.out.printf("Random number is %d\n", computerNum );
	
	String num = (guess == computerNum) ? "yes" :
		(guess < computerNum) ? "low" :
			(guess > computerNum) ? " high ":"finish" ; 
	
	System.out.println(num);
	}
	}
