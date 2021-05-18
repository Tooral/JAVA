// Tural Hagverdiyev

// this assignment asks user to input positive numbers and using Babylonian method to find the square root.
import java.util.Scanner;
public class BabylonSquareRoot
{
 public static void main (String [] args)
 { 
 Scanner scan = new Scanner(System.in); // scan class
 
 System.out.println("This program will calculate the square root of a number");
 System.out.println("using the Babylonian method.");
 System.out.println("");
 
 double userChoice1; // number that user inputs. only positive ones
 System.out.print("Enter a positive number; ");
 userChoice1 = scan.nextDouble();
 
 for(; userChoice1<0 ;){ // entering for loop
  System.out.println("Number must be greater than 0.");
   System.out.println("Re-enter a number: ");
   userChoice1 = scan.nextDouble();
   }
   
    System.out.println("The square root of" + userChoice1 + "is " + method1(userChoice1));
    
    }  
    // end main
    
    public static double method1 (double n)
    {
    double wrongchoice = 1;
    double prevchoice = wrongchoice;
    double nextchoice = 1;
    double abs = 0; //absolute value
    
    do
    {
    nextchoice = (prevchoice+n/ prevchoice)/2;
    abs = Math.abs(nextchoice-prevchoice);
    prevchoice = nextchoice;
    }while (abs >= 0.0001);
    return nextchoice;
    } // end method1

    

 }
 
