package classlabs;

import java.util.*;

public class lab4 {
 public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);
	 for (int round = 1; round < 4; round++) {
		 int computerNum = 0 + (int) ( Math.random() * 10 );
		 
		 System.out.println ("Enter a number between 0 and 10");
		 int guess = input.nextInt();
		 System.out.printf("Random number is %d\n", computerNum );
		 
		 if (guess > computerNum) 
		 {
			 System.out.println ("Too big");
			 }
		 else if (guess < computerNum) 
		 {
			 System.out.println ("Too low");
			 }
		 else 
		 {
			 System.out.println ("Correct");
			 }
		 }
	 }
 }