/*
 * Members: Long, Hank, Reach, Moe
 * Area of the circle: Long
 * Area of the ellipse: Hank
 * Area of the kite: Reach
 * Area of the trapezoid: Moe
 *
 * AreaOfShapes.java
 *
 * Ask user for a shape whose area they want:
 * rectangle, circle, ellipse, trapezoid, or kite.
 * Depending on choice, ask for the relevant dimension(s)
 * and calculate the area.
 * 
 * Each shape has its own area-calculating method.
 * All of the area will be rounded to 3 decimal places
 */

import java.util.Scanner;

public class AreaOfShapes {

    // Takes Scanner input. Reads in a double. Keeps reading
    // doubles until the user enters a postive entry. Return
    // the number
    public static double getPositiveNumber(Scanner input) {
		// Declaring and reading in the number
        double positiveNum = input.nextDouble();

        // Continue entering numbers until the number is positive
        while (positiveNum <= 0) {
			System.out.print("The number must be positive. Please enter"
			    + " a new number: ");

			// Read in a new number
			positiveNum = input.nextDouble();
	    }

	    return positiveNum;
    }

    // Takes the dimensions of the rectangle. Calculate and returns the area.
    public static double getRectangleArea(double width, double height) {
        return width * height;
    }
    
    // Takes the radius of the circle. Calculate and returns the area.
    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Takes the radius of the ellipse. Calculate and returns the area.
    public static double getEllipseArea(double majorRadius, 
										double minorRadius) {
        return  Math.PI * majorRadius * minorRadius;
    }
    
    // Takes the bases and height of the trapezoid. Calculate and returns the area.
    public static double getTrapezoidArea(double base1, double base2, 
										double height) {
        return 0.5 * (base1 + base2) * height;
    }
    
    // Takes the diagonals of the kite. Calculate and returns the area.
    public static double getKiteArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for shape to calculate area for
        System.out.println("Find area of");
        System.out.print("R)ectangle, C)ircle, E)llipse, T)rapezoid, or"
			+ " K)ite: ");
        String shapeType = input.nextLine();

        // Based upon the shape. Prompt user for dimensions of shape.
        // Call method to calculate area. Display area to 3 decimal places
        switch (shapeType) {
			// Calculate area for rectangle
            case "R":
            case "r":
                // Prompt user for width and get positive number
                System.out.print("Enter width of rectangle: ");
                double width = getPositiveNumber(input);

                // Prompt user for height and get positive number
                System.out.print("Enter height of rectangle: ");
                double height = getPositiveNumber(input);

                // Calculate the area of the rectangle and display area 
                //to 3 decimal places
                double rectangleArea = getRectangleArea(width, height);
                System.out.printf("Area of rectangle is %.3f square "
					+ "units.%n", rectangleArea);
                break;
            
            //Calculate area for circle
            case "C":
            case "c":
                //Enter the radius of the circle and get positive number
                System.out.print("Enter radius of circle: ");
                double radius = getPositiveNumber(input);
                
                //Calculate the area of the circle and round it to 3 
                //decimal places
                double circleArea = getCircleArea(radius);
                System.out.printf("Area of circle is %.3f square units." 
					+ "%n", circleArea);
                break;
                
            case "E":
            case "e":
                //Enter the minor and major radius of ellipse
                System.out.print("Enter major radius of ellipse: ");
                double majorRadius = getPositiveNumber(input);
                System.out.print("Enter minor radius of ellipse: ");
                double minorRadius = getPositiveNumber(input);
                
                //Calculate the area of the Ellipse and round it to 3 decimal places
                double ellipseArea = getEllipseArea(majorRadius, minorRadius);
                System.out.printf("Area of ellipse is %.3f square units.%n",
                    ellipseArea);
                break;
            
            //Calculate area for Trapezoid
            case "T":
            case "t":
                // Enter the measurements of Trapezoid
                System.out.print("Enter the height of Trapezoid: ");
                double height1 = getPositiveNumber(input);
                System.out.print("Enter length of base: ");
                double base1 = getPositiveNumber(input);
                System.out.print("Enter length of top base: ");
                double base2 = getPositiveNumber(input);
                
                //Calculate and display trapezoid area to 3 decimal places
                double trapezoidArea = getTrapezoidArea(base1, base2, height1);
                System.out.printf("Area of trapezoid is %.3f square units.%n",
                    trapezoidArea);
                break;
            
            //Calculate area for kite
            case "K":
            case "k":
                // Prompt user for first diagonal and get positive number
                System.out.print("Enter first diagonal of kite: ");
                double diagonal1 = getPositiveNumber(input);
                
                // Prompt user for second diagonal and get positive number
                System.out.print("Enter second diagonal of kite: ");
                double diagonal2 = getPositiveNumber(input);
                
                // Calculate and display area to 3 decimal places
                double kiteArea = getKiteArea(diagonal1, diagonal2);
                System.out.printf("Area of kite is %.3f square units.%n",
                    kiteArea);
                break;
                
            // User entered an invalid option
            default:
                System.out.println("That letter is not a valid shape.");
                break;
        }

        input.close();
    }

}
