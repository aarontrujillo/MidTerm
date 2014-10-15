
// question 6 
import java.util.*;
public class Gererate {
	public static boolean isEven(int num) {
	    boolean Even = false;

	    if ((num % 2) == 0) {
	        Even = true;
	    }
	    return Even;
	}
	private static int RANDOM_NUMBERS = 1000;

	public static void main(String[] args) {

	    int evenNumber = 0;
	    int oddNumber = 0;

	    Random randomValue = new Random();

	    
	    for (int i = 1; i <= RANDOM_NUMBERS; i++) {
	        
	        if (isEven(randomValue.nextInt(i))) {
	            evenNumber++;
	        } else {
	            oddNumber++;
	        }
	    }

	    System.out.println("Number of even numbers: " + evenNumber);
	    System.out.println("Number of odd numbers: " + oddNumber);

	}


}
