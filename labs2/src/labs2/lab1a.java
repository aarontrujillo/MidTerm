package labs2;

import javax.swing.*;

import java.util.*; 



public class lab1a 
{ 
public static void main(String[] args) 
{ 
	Random generator = new Random();
    String personPlay; 
    String computerPlay = ""; 
    int computerInt = generator.nextInt(3)+1;

    if (computerInt == 1) 
       computerPlay = "Rock"; 
    else if (computerInt == 2) 
       computerPlay = "Paper"; 
    else if (computerInt == 3) 
       computerPlay = "Scissors"; 

    personPlay = JOptionPane.showInputDialog("Rock, Paper, Scissors");
    JOptionPane.showMessageDialog(null, "Computer does " + computerPlay);
  
  if (personPlay.equals(computerPlay)) {
	  JOptionPane.showMessageDialog(null, "It's a tie!");
  }
   else if (personPlay.equals("Rock")) {
      if (computerPlay.equals("Scissors")) 
    	  JOptionPane.showMessageDialog(null,"Rock crushes scissors. You win!!");
      else if (computerPlay.equals("Paper")) 
    	  JOptionPane.showMessageDialog(null,"Paper eats rock. You lose!!");
   }
   else if (personPlay.equals("Paper")) {
       if (computerPlay.equals("Scissors")) 
    	   JOptionPane.showMessageDialog(null,"Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("Rock")) 
    	JOptionPane.showMessageDialog(null,"Paper eats rock. You win!!"); 
   }
   else if (personPlay.equals("Scissors")) {
	   if (computerPlay.equals("Paper")) 
        	JOptionPane.showMessageDialog(null,"Scissor cuts paper. You win!!"); 
        else if (computerPlay.equals("Rock")) 
        	JOptionPane.showMessageDialog(null,"Rock breaks scissors. You lose!!");
   }
  }
}
