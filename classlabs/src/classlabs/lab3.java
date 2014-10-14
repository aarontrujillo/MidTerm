package classlabs;
import java.util.*;

public class lab3{
	public static void main(String [] args)
	{
		Random rand = new Random();
		int computerNum;
		computerNum = (int)(Math.random()*10);
		Scanner input = new Scanner(System.in);
		int guess;
		
		System.out.println("Guess a number between 1 to 10: ");
		guess = input.nextInt();
		
		if(guess == computerNum)
		{
			System.out.println("Correct!");
		}
		else if (guess < computerNum)
			{
			System.out.println("Too low, try again.");
			}
		else if (guess > computerNum)
		{
			System.out.println("Too high, try again.");
			}
		}
	}