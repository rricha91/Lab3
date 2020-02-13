import java.util.Scanner;
public class LoopPrompt {
	public char prompt(){
		char awn;
		Scanner inp = new Scanner(System.in);
		do {
			awn = Character.toUpperCase(inp.next().charAt(0));
		} while (!valid(awn));
		inp.close();
		return awn;
	}

	private boolean valid(char a) {
		if (a==89||a==78) return true;
		else System.out.print("\n\tInvalid Input, please enter something else."
				+ "\n\tWould you like to run the program again? (y/n): ");
		return false;
	}
}
