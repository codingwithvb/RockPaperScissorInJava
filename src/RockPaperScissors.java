import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {

		String choice = JOptionPane.showInputDialog("Rock, Paper, Scissor, Shoot: ");
		String choiceAnswer = choice.toUpperCase();
		
		if(choiceAnswer.equals("ROCK") || choiceAnswer.equals("PAPER") || choiceAnswer.equals("SCISSOR")) {
			Random random = new Random(); 
			int computersChoice = random.nextInt(1,4);
			
		   switch(computersChoice) {
			case 1: JOptionPane.showConfirmDialog(null, "Computer chose Rock");
			break;
			case 2: JOptionPane.showConfirmDialog(null, "Computer chose Paper");
			break; 
			case 3: JOptionPane.showConfirmDialog(null, "Computer chose Scissor");
			break;
			}
						
			if(choiceAnswer.equals("ROCK") && computersChoice == 1){  
				JOptionPane.showMessageDialog(null, "Game is a Tie!");
			}
			if(choiceAnswer.equals("ROCK") && computersChoice == 2) { 
				JOptionPane.showMessageDialog(null, "You lost!");
			}
			if(choiceAnswer.equals("ROCK") && computersChoice == 3) { 
				JOptionPane.showMessageDialog(null, "You won!");
			}
			if(choiceAnswer.equals("PAPER") && computersChoice == 1) { 
				JOptionPane.showMessageDialog(null, "You won!");
			}
			if(choiceAnswer.equals("PAPER") && computersChoice == 2) { 
				JOptionPane.showMessageDialog(null, "Game is a Tie!");
			}
			if(choiceAnswer.equals("PAPER") && computersChoice == 3) { 
				JOptionPane.showMessageDialog(null, "You lost!");
			}

			if(choiceAnswer.equals("SCISSOR") && computersChoice == 1) { 
				JOptionPane.showMessageDialog(null, "You lost!");
			}
			if(choiceAnswer.equals("SCISSOR") && computersChoice == 2) { 
				JOptionPane.showMessageDialog(null, "You won!");
			}
			if(choiceAnswer.equals("SCISSOR") && computersChoice == 3) { 
				JOptionPane.showMessageDialog(null, "Game is a Tie!");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error! Choose either Rock, Paper, or Scissor!");
		}
	}
}
