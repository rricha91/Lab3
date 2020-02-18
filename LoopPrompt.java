import java.util.Scanner;
public class LoopPrompt {
	public char prompt(){
		char awn;
		Scanner inp = new Scanner(System.in);
		do {
			System.out.print("\n\tWould you like to run the program again? (y/n): ");
			awn = Character.toUpperCase(inp.next().charAt(0));
		} while (!valid(awn));
		inp.nextLine();
		inp.close();
		return awn;
	}

	private boolean valid(char a) {
		if (a==89||a==78) return true;
		else {
			System.out.print("\tInvalid Input, please enter something else.");
			return false;
		}
	}
}
