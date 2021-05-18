// Tural Hagverdiyev U10263909
// Assignment 2 - calculating frequency and energy using given formula 
import java.util.Scanner;// beginning of code 
public class EnergyofLight 

{
   public static void main(String[] args) 
   {
       //Constant to store Planck's constant
       final double h = 6.626E-34;
       //Constant to store speed of light
       final double c = 3e+8;
      
       //Creating object of Scanner class for standard input
       Scanner stdin = new Scanner(System.in);
      
       // the wavelength of photon r
       System.out.print("Enter the wavelength of the photon (in m): ");
        double wavelength = stdin.nextDouble();
        
 
        //Calculate frequency of photon
        double frequency = c / wavelength;
        
        //Calculate energy of photon
        double energy = h * frequency;
      
        //Printing frequency and energy of photon
        System.out.println("The frequency of the photon is "+frequency+" Hertz.");
        System.out.println("The energy of the photon is "+energy+" Joules.");
   }
}// end of code