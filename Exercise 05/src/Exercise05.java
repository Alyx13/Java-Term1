/*
 * Author: Stanley Pieda
 * Date: March 16, 2022
 * Modified by: Alexandre Valiquette
 * Modified Date: 2022-08-05
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: Use the pseudocode and complete the main method
 */

/*
 * This class only contains method main, to drive the application.
 */
public class Exercise05 {
	
	/*
	 * Supervisor wants a comment here overviewing the logic in method main
	 */
	public static void main(String[] args) {
		User user = new User();
		HighLowGame game = new HighLowGame();
		
		String CONTINUE_GAME = "y";
		String EXIT_GAME = "n";
		String shouldContinue = EXIT_GAME;
		
		do {
			if (shouldContinue.equalsIgnoreCase(CONTINUE_GAME)) {
				game.reset();
			}
			game.run();
			shouldContinue = user.inputString("Would you like to play again? (y/n)");
			
		} while (shouldContinue.equalsIgnoreCase(CONTINUE_GAME));
		
		System.out.println("Program by Alexandre Valiquette");
	
	}
}
