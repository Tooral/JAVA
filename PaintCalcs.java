/* Tural Hagverdiyev 
this program requires length, width, height of rectangular room. it calculates the wall area the amount of gallon pints needs for area
and cost of paint needs to complete this. 
*/  
import java.util.Scanner;
import java.text.DecimalFormat;
public class PaintCalcs
{
 
 final static double COST_OF_A_GALLON = 32.0;// entering gallons(cost)
 final static int WALL_SPACE_PER_GALLON =350;
 
 public static void main (String [] args)
 {
 Scanner scan = new Scanner (System.in); // scanner class
 double length=0; //entering double entegers for length width and height 
 double width=0;
 double height=0;
 
 System.out.print("Enter the room's lentgh (in feet): ");
 length = scan.nextDouble();
 for(; length<0 ;) { //using for loops
 System.out.println("The value you entered for the length invalid.");
  System.out.println("Re-enter the room's height (in feet): ");
height = scan.nextDouble();
}
method1(length,width,height);
}
public static void method1 (double length,double width, double height)
{
double area = 2*height*(width+length);
DecimalFormat f = new DecimalFormat("0.00");
System.out.println("You will need " + method2(area) + "gallons");
double totalPrice = (method2(area)*COST_OF_A_GALLON);
System.out.println("The price to paint the room is $" + f.format(totalPrice)); 
}
public static double method2(double A)
{ double amountofGallon = (A/WALL_SPACE_PER_GALLON );
return amountofGallon;
}

} // end main method 2


 
