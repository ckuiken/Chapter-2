// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         //It is going to join the two seperate segments of text
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         //The text will be joined with the number and other segment of text                        
         System.out.println ("8 plus 5 is " + 8 + 5);
         //the text will stay the same but 85 will be added to the end
         System.out.println ("8 plus 5 is " + (8 + 5));
         //13 will be added to the end
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //85 will be added to the beggining
        }
}