import java.util.Scanner;

/**
 * This class implements a MasterBrain game. The game involves a user
 * trying to guess the code.  After the user makes a guess, he/she is
 * given feed back on that guess.  The object is to correctly guess
 * the code within a certain number of guesses.
 * 
 * Honor statement:
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MBGame
{
   /*******************************************************
    * A MasterBrain game board.
    *******************************************************/ 
   private MBBoard gameBoard;

   /*******************************************************
    * The maximum number of allowed guesses.
    *******************************************************/ 
   private int     guessLimit;

   /*******************************************************
    * The number of guesses so far.
    *******************************************************/ 
   private int     numGuesses;

   /*******************************************************
    * This constructor sets the number of values in the code,
    * the maximum number of allowed guesses, and sets the number
    * of guesses so far to 0.  And allocates the memory for the
    * gameboard. 
    * @param size       Number of values in the code
    * @param winNumber   Maximum number of allowed guesses
    *******************************************************/ 
   public MBGame(int size, int winNumber)
   {
      ; // Replace this stub with appropriate code
   }
   
   /********************************************************
    * This helper method prompts for and reads in a guess for this game and
    * returns the guess as a String.  If the user enters an invalid
    * string (it has the wrong number of characters or contains invalid
    * characters), the method outputs an appropriate error message, 
    * prompts again, and reads another guess.  The method continues doing 
    * this until a valid guess is entered.
    * @param stdIn Scanner input string is read from
    * @return The String entered
    *********************************************************/
   private String readGuess(Scanner stdIn)
   {
      return "???"; // Replace this stub with appropriate code
   }

   /********************************************************
    * This helper function converts a string of digits to
    * an array of integers, one element in the array for each
    * digit.  The string should already have been validated during 
    * the readGuess() method so we may assume that it contains only
    * valid digits.
    * @param str The string to be converted
    * @return The array of single digit integers derived from string str
    *********************************************************/
   private int[] stringToIntArray(String str)
   {
       // Replace this stub with appropriate code
   }

   /********************************************************
    * This method plays a MasterBrain game. It returns true
    * if the player wins, false otherwise.  A player wins if they guess
    * the code within the specified number of guesses. After each
    * guess is entered, the method outputs the result (the blue and
    * grey count) for that guess.  At the conclusion of the game,
    * if the user did not correctly guess the code, the method
    * outputs what the code was.
    * @param stdin Standard input for player dialog
    * @return  True if player wins, false otherwise.
    *********************************************************/
   public boolean playGame(Scanner stdin)
   {
      return true; // Replace this stub with appropriate code
   }

}