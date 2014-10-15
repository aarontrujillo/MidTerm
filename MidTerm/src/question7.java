import java.util.*;

import javax.swing.JOptionPane;
public class question7 {

		public static boolean isEven(int num) {
		    boolean Even = true;

		    if ((num % 2) == 0) {
		        Even = true;
		    }
		    return Even;
		}
		private static int RANDOM_NUMBERS = 1000;

		public static void main(String[] args) {
			String guess = JOptionPane.showInputDialog(
					"Enter odd or even:", "Your hand here");
			
			
		    int evenNumber = 0;
		    int oddNumber = 0;

		    Random randomValue = new Random();

		    
		    for (int i = 1; i <= RANDOM_NUMBERS; i++) {
		    	String computerpick; 
				
				if (RANDOM_NUMBERS == 0)
					computerpick = "even";
				else
					computerpick = "odd";
				
				String message = "The computer is " + computerpick + ". You are "
						+ guess;
				
				boolean bothDraw = computerpick.equals(guess);
				boolean compWin =
				((computerpick.equals("even") && guess.equals("odd")) ||
				(computerpick.equals("odd") && guess.equals("even")));
				
				if (compWin)
					message += ". Computer Won.";
					else if (bothDraw)
					message += " , you guess right.";
				
					else
						message += ". You Won";
				
				JOptionPane.showMessageDialog(null, message);
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

