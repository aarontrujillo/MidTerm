//4.9 GradeBook2.java
//GradeBook 2 class that solves the class-average problem using
//Sentinel-controlled repetition.
import java.util.*;

public class GradeBook2 
{
	private String courseName; //name of course this GradeBook2 represents
	
	// constructor initializes courseName
	public GradeBook2( String name )
	{
		courseName = name; // initializes courseName
	} // end constructor
	
	// method to set the course name
	public void setCourseName( String name )
	{
		courseName = name; // store the course name
	} // end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	//display a welcome message to the GradeBook2 user
	public void displayMessage()
	{
		//getCourseName gets the name of the course
		System.out.printf("Welcome to the grade book for \n%s!\n\n", 
				getCourseName());
	} // end method displayMessage
	
	// determine the average of an arbitrary number of grades
	public void determineClassAverage()
	{
		//create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int total; // sum of grades
		int gradeCounter; //number of grades entered
		int grade; // grade value
		double average; //number with decimal point for average
		
		// initialization phase
		total = 0; 
		gradeCounter = 0;
		
		//processing phase
		// Prompt for input and read grade from user
		System.out.print("Eneter grade for -1 to quit: " );
		grade = input.nextInt();
		
		// loop until sentinel value read from user
		while (grade != -1)
		{
			total = total + grade; //add grade to total
			gradeCounter = gradeCounter + 1; //invrement counter
			
			//Prompt for input and read next grade from user
			System.out.print(" Enter grade or -1 to quit: " );
			grade = input.nextInt();
		}//end while
		
		//termination phase
		// if user enter at least one grade...
		if ( gradeCounter != 0)
		{
			//calculate average of all grades entered
			average = (double) total / gradeCounter;
			
			//display total and average
			System.out.printf("\n Total of the %d grades entered is %d\n" ,
					gradeCounter, total );
			System.out.printf( "Class average is %.2f\n" , average );
		} // end if
		else // no grades were entered
			System.out.println( "No grades were entered" );
		}
	} 
