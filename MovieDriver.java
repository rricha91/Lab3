import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// Create a new object of type Scanner that reads from the keyboard
		Scanner in = new Scanner(System.in);
		
		// Create a new movie object
		Movie movie = new Movie();
		
		LoopPrompt loop = new LoopPrompt();
		
		
		
		do {
			//Prompt the user to enter the title of a movie 
			System.out.print("\n\tPlease enter the name of a movie: ");
			
			/*
			 * Read in the line that the user types
			 * Set the title in the movie object
			 */
			movie.setTitle(in.nextLine());
			
			//Prompt the user to enter the movie’s rating
			System.out.print("\n\tEnter the age rating for \"" + movie.getTitle() +"\": ");
			
			/*
			 * Read in the line that the user types
			 * Set the rating in the movie object
			 */
			movie.setRating(in.next());
			
			// Prompt the user to enter the number of tickets sold at a (unnamed) theater
			System.out.print("\n\tEnter the number of tickets whatever theater sold for \"" + movie.getTitle() +"\": ");
			
			/*
			 * Read in the integer that the user types
			 * Set the number of tickets sold in the movie object
			 */
			movie.setSoldTickets(in.nextInt());
			in.nextLine();
			
			// Print out the information using the movie’s toString method
			System.out.print("\n\t" + movie.toString());
		} while (loop.prompt(in)==89);
		
			in.close();

	}
}
