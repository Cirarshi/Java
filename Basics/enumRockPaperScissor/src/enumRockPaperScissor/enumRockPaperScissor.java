package enumRockPaperScissor;

import java.util.Random;
import java.util.Scanner;

enum HandShape {
	ROCK('R'), PAPER('P'), SCISSOR('S');
	
	private final char symbol;
	
	HandShape(char symbol){
		this.symbol = symbol;
	}
	
	public int getSymbol() {
		return symbol;
	}
	
	public boolean beats(HandShape other) {
		switch (this) {
		case ROCK: return other == SCISSOR;
		case PAPER: return other == ROCK;
		case SCISSOR: return other == PAPER;
		default: return false;
		}
	}
}

public class enumRockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("R for Rock, P for Paper, S for Scissor");
			System.out.println("Enter your Choice: ");
			char playerChoice = Character.toUpperCase(scanner.next().charAt(0));
			
			HandShape playerHand = getHandShape(playerChoice);
			if(playerHand == null) {
				System.out.println("Invalid Input!");
				continue;
			}
			HandShape computerHand = HandShape.values()[random.nextInt(3)];
			
			System.out.println("You Choosed " + getHandShape((char)playerHand.getSymbol()));
			System.out.println("Computer Choosed " + getHandShape((char)computerHand.getSymbol()));
			
			String result = determineWinner(playerHand, computerHand);
			System.out.println(result);
			
			System.out.println("Play Again? (y/n): ");
			String playAgain = scanner.next();
			if(!playAgain.equalsIgnoreCase("y")) {
				break;
			}
		}
		scanner.close();
	}

	public static HandShape getHandShape(char choice) {
		switch(choice) {
		case 'R': return HandShape.ROCK;
		case 'P': return HandShape.PAPER;
		case 'S': return HandShape.SCISSOR;
		default: return null;
		}
	}
	
	public static String determineWinner(HandShape player, HandShape computer) {
		if(player == null)
			return "Invalid input, Yoy Loose";
		else if(player.beats(computer))
			return "You Win!";
		else if(computer.beats(player))
			return "Computer Wins!";
		else
			return "It's a tie!";
	}
}
