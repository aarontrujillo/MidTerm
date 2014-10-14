package labs2;

import javax.swing.*;

import java.util.*;
public class lab1 {
	public static void main(String [] args){
		
		String user = 
				JOptionPane.showInputDialog("Rock, Paper, Scissors!\n" + 
	                       "Enter a move.\n" + "Rock = R, Paper" + 
	                       "= P, and Scissors = S.");
		String computerPlay = "";
		Random generator = new Random();
		int computerInt = generator.nextInt(3)+1;
		 
		 if (computerInt == 1) 
		       computerPlay = "R"; 
		    else if (computerInt == 2) 
		       computerPlay = "P"; 
		    else if (computerInt == 3) 
		       computerPlay = "S";
		 
		String message = 
				String.format("You entered, %s." , user);
		
		String personPlay;
		 personPlay = message;
		if (personPlay.equals(computerPlay)) {
		      System.out.println("It's a tie!");
		   }
		   else if (personPlay.equals("R")) {
		      if (computerPlay.equals("S")) 
		         System.out.println("Rock crushes scissors. You win!!");
		      else if (computerPlay.equals("P")) 
		           System.out.println("Paper eats rock. You lose!!");
		   }
		   else if (personPlay.equals("P")) {
		       if (computerPlay.equals("S")) 
		       System.out.println("Scissor cuts paper. You lose!!"); 
		    else if (computerPlay.equals("R")) 
		            System.out.println("Paper eats rock. You win!!"); 
		   } 
		   else if (personPlay.equals("S")) {
		        if (computerPlay.equals("P")) 
		            System.out.println("Scissor cuts paper. You win!!"); 
		        else if (computerPlay.equals("R")) 
		           System.out.println("Rock breaks scissors. You lose!!");
		   }
		String computer = 
				String.format("Computer picked, %s." , computerPlay);
		
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showMessageDialog(null, computer);
	}

}
