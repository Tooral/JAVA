// Tural Hagverdiyev U10263909
// Assignment 2 - writing a code which converting a number of minutes 
// to both days and hours 
import java.util.Scanner; // beginning of code
public class MinutesConversion
{
   public static void main (String[] args)
    
   {
   // coding variables in mins,hours and days
   int Minutes;
   int Hours;
   int Hours_afterday, days;
   int Days;
   
   // putting statement/argument to enter integer
   System.out.print("Enter number of minutes: ");
   
   // creating scanner
   Scanner scan = new Scanner (System.in);
   Minutes = scan.nextInt();
   // calculating hours
   
   Hours = Minutes/60;
   
   // calculating days 
   Days=Hours/24;
   Hours_afterday = Hours%24;
   
   // putting all them in one statement
   System.out.print("" + Minutes + " minutes is " + Hours + " hours" + " or " + Days + " days and " + Hours_afterday + " hours");
   
   
   }
 }// end of code
