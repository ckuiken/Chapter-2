//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length, height, width;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
 
            //Declare and initialize the length of the room
            length = 15;
 
            //Declare and initialize the width of the room
            width = 11;
 
            //Declare and initialize the height of the room
            height = 8;
 
            //Compute the total square feet to be painted--think
            totalSqFt = (length*height*2 + width*height*2 + width*length*2);
            //about the dimensions of each wall
 
            //Compute the amount of paint needed
            paintNeeded = (int) (totalSqFt/350);
 
            //Print the length, width, and height of the room and the
            System.out.println(paintNeeded);
            //number of gallons of paint needed.
        }
}