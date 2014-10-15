// Fig. 4.6: GradeBook.java
// GradeBook class that solves class-average problem using
// counter-controlled repetition
// program uses class Scanner
import java.util.*;
public class GradeBook 
{
	private String courseName; // name of course this GradeBook represents
	
	// constructor initializes courseName
	public GradeBook(String name)
	{
		courseName = name;// initializes courseName
	}
	
	// method to set the course name
	public void SetCourseName(String name)
	{
		courseName = name; // Store the course name
	} // end method setCourseName
	
	//method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} //method getCourseName
	
	//display a welcome message to the GradeBook user
	public void displayMessage()
	{
		//getCourseName gets the name of the course
		System.out.printf("Welcome to the grade book for \n%s!\n\n" , 
				getCourseName() );
	}//method displayMessage
	
	//determine class average based on 10 grade entered by user
	public void determineClassAverage()
	{
		//create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in);
		
		int total; //sum of grades entered by user
		int gradeCounter; //number of the grade to be entered next
		int grade; // grade value entered by user
		int average; // average of grades
		
		//initialization phase
		total = 0; //initialize total
		gradeCounter = 1; //initialize loop counter
		
		//Proceeding phase uses counter-controlled repetition
		while ( gradeCounter <=10 ) //loop 10 times
		{
			System.out.print("Enter grade: " ); // Prompt
			grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		}
		
		// termination phase
		average = total / 10; //integer division yields integer results
		
		//display total and average of grades
		System.out.printf("\nTotal of all 10 grade is %d\n", total);
		System.out.printf("Class average is %d\n" , average);
		}// end method determineClassAverage
	} //end class Grade book
