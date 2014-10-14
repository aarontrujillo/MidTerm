package labs2;

import java.util.*;
public class lab3b
{
	private static final Scanner Scan = null;

	public static void main(String [] args)

	{
		Scanner input = new Scanner(System.in);
		
		boolean guessedCorrect = false;
		do{
		while( !guessedCorrect){
			int computerNum = (int)(Math.random()*10);
			System.out.println("Guess a number between 1 to 10: ");
			int guess = input.nextInt();
			
		if(guess == computerNum){
		
			System.out.println("Correct!");
		}
			else
			{
				if(guess <= computerNum)
				{
					System.out.println("Too low , play again.");
					}else
					{
					if (guess >= computerNum)
					{
						System.out.println("Too high, play again.");
						}
					}
				
		}
		
		
		}System.out.println("You want to continue : (Y/N) ");
	}while("Y".equalsIgnoreCase(input.next().trim()));
		
	
		}
	
}

	 
	 