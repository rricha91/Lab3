import java.util.Scanner;
public class LoopPrompt {
	
	//Put scanner in prefix so it still closes
	public char prompt(Scanner in){
		char awn;
		
		do {
			System.out.print("\n\tWould you like to run the program again? (y/n): ");
			awn = Character.toUpperCase(in.next().charAt(0));
		} while (!valid(awn));
		
		/*
		 * || Original created scanner in the file and closed it at the end. 
		 * || 		Didn't work. 
		 * || 
		 * || If an original Scanner is made in the prompt, do not close it.
		 * \/ 		This closes all the scanner stuff for some reason and crashes the loop. 
		 */
		//inp.close();
		
		in.nextLine();
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
