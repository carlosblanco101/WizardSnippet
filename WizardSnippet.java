/* WizardSnippet knows all!
   your name here
*/

import java.util.Scanner;

public class WizardSnippet
{
  public static void main( String [] args )
  {
     Scanner scan = new Scanner( System.in );
     System.out.println( "I am the all-knowing Wizard." );
     System.out.println( "What is your question?" );               
     String question = scan.next( );    // we only care about the first word
  
     /****** 1. enter answers for who, what, where, and why. 
          If user enters something other than those words, 
          output a message saying you don't understand.
     */
    
       if ( question.equalsIgnoreCase("Who"))
       {
            System.out.println("Mickey Mouse");  
       } 
           
      else if ( question.equalsIgnoreCase("What"))
       {
            System.out.println("Magic Kingdom");
       }
      else if ( question.equalsIgnoreCase("Where"))
       {
            System.out.println("Disney World");
       }
       
       else if ( question.equalsIgnoreCase("Why"))
       {
            System.out.println("I don't know");
       }
       
       else
       {
            System.out.println("I don't understand");
            
       }
    
  } // end main
} // end class
