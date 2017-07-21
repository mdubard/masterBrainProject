import java.util.Scanner;
import java.util.Random;

/**********************************************************************
 * This class drives the MasterBrain game
 * @author Nancy Harris & J. Archer Harris
 * @version V2 11/01/12
 *********************************************************************/
public class MasterBrain
{

   /**
    * The random number generator for this game
    **/
   public static Random randy;

   /*****************************************************************
    * The main method loops continually while the player wants to play again
    * play ends when something other than y or yes are answered to 
    * the play a game invitation.
    * @param args command line arguments, used to set the random number seed
    ******************************************************************/
   public static void main(String args [])
   {
      Scanner   stdin;         // input stream
      int       codeSize;      // size of the code
      int       gameLength;    // number of guesses before computer wins
      MBGame    myGame;        // the MasterBrain game
      boolean   playerWin;     // does the player win?
      
      if (args.length > 0)
         randy = new Random(Integer.parseInt(args[0]));
      else
         randy = new Random();
      stdin = new Scanner(System.in);
      //---------------------------------------------------------------
      // play games until the user responds with something other than
      // y or yes
      //---------------------------------------------------------------
      while (MasterBrain.readYesNo(stdin, "Play a game? "))
      {
         codeSize = MasterBrain.readInt(stdin, "Code size: ");
         gameLength = MasterBrain.readInt(stdin, "Number of guesses: ");    
         
         myGame = new MBGame(codeSize, gameLength);
         playerWin = myGame.playGame(stdin);         
         if (playerWin)
            System.out.print("You win!\n\n");
         else
            System.out.print("You lose!\n\n");
      }
      System.out.println("Good bye");
   }

   /*************************************************************
    * Method purpose: this function prompts the user for a yes
    * or no input and returns true if the user responds affirmatively,
    * and return false if the user responds negatively.  A response 
    * of "yes" or "y" (case ignored) as an affirmative response, a
    * response of "no" or "n" (case ignored) as a negative response.
    * Any other response will cause the function to ask the
    * question again.
    * 
    * @param stream Input stream the input is to be read from.
    * @param prompt The prompt output before trying to read.
    * @return       A boolean indicating if the user responded affirmatively.
    *************************************************************/
   public static boolean readYesNo(Scanner stream, String prompt)
   {
      String ans;
      boolean valid;

      do
      {
         System.out.print(prompt);
         ans = stream.nextLine();
         valid = ans.equalsIgnoreCase("yes") 
          || ans.equalsIgnoreCase("y") 
          || ans.equalsIgnoreCase("no") 
          || ans.equalsIgnoreCase("n");
         if (!valid)
            System.out.print("Please answer with \"yes\", \"y\", \"no\", \"n\".\n");
      }
      while (!valid);
      return ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y");
   }

   /************************************************************
    * This function outputs a prompt to standard output, reads
    * the next integer from input stream  <code>stream</code>,
    * and then returns the int value.
    * @param stream A <code>Scanner</code> object input is read from
    * @param prompt The prompt string.
    * @return       The value you read
    *****************************************************************/
   public static int readInt(Scanner stream, String prompt)
   {
      int   inputVal;   // The value input

      System.out.printf(prompt);
      inputVal = stream.nextInt();
      return inputVal;
   }
}