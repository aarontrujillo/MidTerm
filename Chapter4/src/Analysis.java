

import java.util.*;

public class Analysis {
	
	public static void main(String [] args)
	{
		//create Scanner to obtain input
		Scanner input = new Scanner( System.in);
		
		//initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		//process 10 student
		while ( studentCounter <= 10 )
		{
			// prompt user for input and obtain value from user
			System.out.print(" Enter result ( 1 = pass, 2 = fail): " );
			result = input.nextInt();
			
			//if...else is nested 
			if (result == 1 )
				passes = passes + 1;
			else
				failures = failures + 1;
			
			//studentCounter so loop
			studentCounter = studentCounter + 1;
			}// end while
		
		// prepare and display results
		System.out.printf("Pass %d\nFailed: %d\n", passes, failures);
		
		//determine where more than 8 students passed
		if ( passes > 8 )
			System.out.println("Bonus to instructor" );
		}
	}
