// Tural Hagverdiyev U10263909
// Assignment 2 - calculating the area and volume with given the radius of a sphere.
  import java.util.Scanner;
public class SphereCalculations
 {

   public static void main(String[] args) 
   {
       //Object of Scanner class
       Scanner input=new Scanner(System.in);
       
       //asking user radius
       System.out.print("Enter the sphere's radius : ");
       
       double r;
       r = input.nextDouble();
       //double spheresRadius=input.nextDouble();//reading spheres radius
       
       //calculating spheres volume
       double spheresVolume=(4*Math.PI*Math.pow(r,3))/3;
       //double spheresVolume=(4*Math.PI*Math.pow(spheresRadius,3))/3;
       
       //calculate spheres surface area
       //double spheresSurfaceArea=4*Math.PI*Math.pow(spheresRadius, 2);
         double spheresSurfaceArea=4*Math.PI*Math.pow(r, 2);
       
       //display spheres volume and surface area
       System.out.println("Volume : "+spheresVolume);
       
       //display spheres surface area
       System.out.println("Surface area : "+spheresSurfaceArea);

   }

}