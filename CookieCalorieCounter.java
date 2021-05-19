// Tural Hagverdiyev,

import java.util.Scanner;

public class CookieCalorieCounter {
  public static void main(String args[]){
  
  // create a Scanner object
    Scanner scanner = new Scanner(System.in);
    // declaring variable
    int n;
    //integer
    System.out.println("enter the number of cookies you ate: ");
    n = scanner.nextInt();
    double res = (n/4.0)*300;
    System.out.println("Calories = "+ res);
  }
}
