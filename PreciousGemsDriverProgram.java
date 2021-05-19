// Tural Hagverdiyev 
// I couldnt completely finish the code and I am aware that it doesnt compilie
import java.text.NumberFormat;
import java.util.Scanner;
public class PreciousGemsDriverProgram
{
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);
      int numofGems;
      String name;
      double numberofGemseachCarats;
      
      while(true)
      {
      System.out.println("How many types of gems are you interested in?\nAmount must be >= 1: ");
      numofGems = sc.nextInt();
           
      while(numofGems < 1)
      {
         System.out.println("How many types of gems are you interested in?\nAmount must be >= 1: ");
      numofGems = sc.nextInt();
      }
      }
         
      PreciousGemsDriverProgram [] array = new PreciousGemsDriverProgram [numofGems];
      
      for (int i = 0; i < numofGems; i++)
      {
         System.out.println("Enter name of gem " + (i + 1) + ": ");
         name = sc.nextInt();
         while(true){
         
         System.out.println("Enter amount of carats (> 0) for gem " + (i+1) + ": ");
       numberofGemseachCarats = sc.nextDouble();
       if(numberofGemseachCarats > 0){
       break;
       }
       

         
        else 
         {
            System.out.println("Amount of shares must be greater than 1. Re-enter amount of carats for gems " + (i+1)+":");
           numberofGemseachCarats = sc.nextDouble();
         }
         System.out.println();
         break;
         }
         array[i] = new PreciousGemsDriverProgram (name, numberofGemseachCarats); 
         
      }// end of loop
       System.out.println("Your listed precious gems are: ");
        System.out.println(array);
        }
        }
      
 
