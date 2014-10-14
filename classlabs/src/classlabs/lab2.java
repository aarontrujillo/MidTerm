package classlabs;
import java.util.*;

public class lab2 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int computerNum = 0 + (int) ( Math.random() * 10 );;
		
		
		System.out.println("Guess a number between 1 to 10: ");
		int guess = input.nextInt();
		System.out.printf("Random number is %d\n", computerNum );
		
		if(guess == computerNum)
		{
			System.out.println("Correct!");
			}else
			{
				if(guess <= computerNum)
				{
					System.out.println("Too low , play again.");
				}else{
					if (guess >= computerNum)
					{
						System.out.println("Too high, play again.");
					}
					}
				}	
		}
	}