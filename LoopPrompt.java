import java.util.Scanner;
public class LoopPrompt {
	public char prompt(){
		char awn;
		Scanner inp = new Scanner(System.in);
		do {
			System.out.print("\n\tWould you like to run the program again? (y/n): ");
			awn = Character.toUpperCase(inp.next().charAt(0));
		} while (!valid(awn));
		
		/*
		 * || Dont close the scanner. At least, not this way.
		 * \/ this closes all the scanner stuff for some reason and crashes the loop. 
		 */
		//inp.close();
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
