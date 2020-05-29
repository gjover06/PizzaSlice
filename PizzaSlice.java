/**
Author:George Samu
Date:5/24/2020
Purpose: Chapter 3 number 4

*/

import java.util.Scanner;

public class PizzaSlice
{
	public static void main (String[]args)
	{
	final int exponent=2;
	
	//get the data and create a scanner
	Scanner keyboard=new Scanner(System.in);
	System.out.println("What is the cost of pizza ? ");
	double costOfPizza=keyboard.nextDouble();
	
	//Diameter of pizza in inches
	System.out.println("What is the diameter of pizza ?");
	double diameterOfPizza=keyboard.nextDouble();
	
	System.out.println("The number of equally sized slices into "
					    +	"which the pizza is cut");
	double numOfEqualSlices=keyboard.nextDouble();
	
		
	//get the base and height
	System.out.println("What is the base: ");
	double base = keyboard.nextDouble();
	System.out.println("What is the height: ");
	double height=keyboard.nextDouble();
	
	//radius of pizza
	double radius=diameterOfPizza/2;
	
	//calculating areaOfPizza A=PI*r^2
	double areaOfPizza=Math.PI *(radius * radius);
	
	//calculating areaOfOneSlice
	double areaOfOneSlice=(base * height)/2;
	
	//cost of one slice of pizza
	double costOfOneSlice=costOfPizza/numOfEqualSlices;
	
	System.out.println("Cost of pizza is: " + costOfPizza);
	System.out.println("The diameter of pizza in inches is: " + diameterOfPizza
						+ " inches");
	System.out.println("The number of equally slices into " + 
						" which the pizza is: " + numOfEqualSlices);
	System.out.println("The area of pizza: " + areaOfPizza);
	System.out.println("Cost of one slice: " + costOfOneSlice);
	System.out.println("The area of one slice: " + areaOfOneSlice);
	
	}//end main
}//end PizzaSlice