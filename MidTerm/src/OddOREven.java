//question # 3
import javax.swing.JOptionPane;
public class OddOREven {
	public static void main(String [ ] args){
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
	}
}
