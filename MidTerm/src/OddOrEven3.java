//question # 5
import javax.swing.JOptionPane;
public class OddOrEven3 {
	public static void main(String [ ] args){
		boolean playAgain = true;
		int playAgainReply;
		int human_wins=0;
		int comp_wins=0;
		int rounds = 0 ;
		int ties = 0 ; 
		
		String title = "Game End"; // game end window, title!
		String ask = "Do you want to play again?";
		
		while(playAgain){
	String guess = JOptionPane.showInputDialog(
				"Enter odd or even:", "Your hand here");
		
		int random = (int)(Math.random() * 3);
		
		String computerpick; 
		
		if (random == 0)
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

	
		playAgainReply = JOptionPane.showConfirmDialog(null, ask, title,
				JOptionPane.YES_NO_OPTION);
				if (playAgainReply == JOptionPane.NO_OPTION)
				 playAgain = false;
	}
		if (human_wins>comp_wins)
		{
		JOptionPane.showMessageDialog(null, "Congratulations! You are the final winner after the total of " + human_wins + " wins out of " + rounds + " rounds. Computer wins " + comp_wins + " Ties " + ties );
		}
		else if (comp_wins>human_wins)
		{
		JOptionPane.showMessageDialog(null, "Bad Luck! Computer is the final winner after the total of " + comp_wins + " wins out of " + rounds + " rounds. Human wins " + human_wins + " Ties " + ties ); 
}
}
}