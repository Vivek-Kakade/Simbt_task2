import java.util.Random;
import java.util.Scanner;

class Game{
	int computer;
	public Game() {
		Random ran = new Random();
		computer = ran.nextInt(100);
		System.out.println("Guess the number between 1 to 100");
	}
	public int computerNo() {
		return computer;
	}
}

public class NumberGuessingGame {
	static int takeInput() {
		int input;
		System.out.print("\nEnter the No.: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		return input;
	}
	
	static void isCorrectNo(int i, int j) {
		if(i==j) {
			System.out.println("Yeahh!! You guessed the correct No.");
		}
		else if(i>j) {
			System.out.println("Your No. is higher than the generated No.");
		}
		else {
			System.out.println("Your No. is lower than the generated No.");
		}
	}

	public static void main(String[] args) {
		int input=0, computer=0, iteration=0;
		Game g = new Game();
		do {
			input = takeInput();
			computer = g.computerNo();
			isCorrectNo(input, computer);
			iteration++;
		}while(input != computer);
		System.out.println("You guessed the correct No. in " + iteration + " attempts.");
	}

}
