import java.util.Scanner;

/**
 * This class implements a game board for the MasterBrain game.
 * A game board stores the answer code consisting of a sequence of
 * values from 0 to HI_LIMIT.  The game involves a user
 * trying to guess the code.  Methods provide a user information
 * on how close their guess was to being correct.
 * 
 * Honor statement:
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MBBoard
{
   /*******************************************************
    * Code values are integer values from 0 to HI_LIMIT 
    *******************************************************/ 
   public static final int HI_LIMIT = 9;

   /*******************************************************
    * The code to be guessed.
    *******************************************************/
   private int [] code; 

   /*******************************************************
    * Constructor which sets the  the number of slots  
    * in the code and sets the code to be a random sequence 
    * of values from 0 to HI_LIMIT.
    * @param codeSize    Number of values in the code
    *******************************************************/ 
   public MBBoard(int codeSize)
   {
       // replace this stub with appropriate code
   }

   /*******************************************************
    * This method returns the number of values in this code.
    * @return The number of values in the code
    *******************************************************/ 
   public int codeSize()
   {
      // replace this stub with appropriate code
   }

   /*******************************************************
    * This method returns a string representation of the code.
    * For example, if the code is the sequence of values
    * 9, 3, 5, 1, and 6, this method would return the string
    * "93516".
    * @return A string representation of the code
    *******************************************************/ 
   public String getCode()
   {
       // replace this stub with appropriate code
   }
   
   /*******************************************************
    * Same value in the same position.
    * This method returns the number of values in the guess that
    * have a match at the corresponding position in the code. 
    * @param guess A guess of what the code is
    * @return The number of exact matches in the guess.
    *******************************************************/ 
   public int getExactMatch(int[] guess)
   {
       // replace this stub with appropriate code
   }
   
   /*******************************************************
    * This helper function returns the number of times the
    * value <code>target</code> exists in the array <code>array</code>
    * @param target The value to be searched for
    * @param array The array to be searched
    * @return The number of time the target exists in the array.
    *******************************************************/ 
   private static int inArrayCount(int target, int[] array)
   {
       // replace this stub with appropriate code
   }

   /*******************************************************
    * This method returns the number of values in the guess that
    * match a value in the code, without considering position.
    * (The number of matches includes the exact matches.)
    * @param guess --  guess of what the code is
    * @return the number of matches in the guess.
    *******************************************************/ 
   // Hint: for each possible number in the code, find how
   // many times that number appears in the guess and how
   // many time that number appears in the code and take the
   // minimum of those two numbers. The number of "any" matches is
   // the sum of the minimums for all possible values in the code.
   //**********************************************************
   public int getAnyMatch(int[] guess)
   {
      // replace this stub with appropriate code
   }
}