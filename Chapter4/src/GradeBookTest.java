	//GradeBookTest.java
	//Create GradeBook object and invoke its determineClassAverage method.

	public class GradeBookTest
	{
		public static void main(String [] arge)
		{
			//create GradeBook object myGradeBook and
			//Pass course name to constructor
			GradeBook myGradeBook = new GradeBook(
					"CS101 Introduction to Jave Programming" );
			
			myGradeBook.displayMessage(); // display welcome message
			myGradeBook.determineClassAverage(); // find average of 10 grades
		}
	}