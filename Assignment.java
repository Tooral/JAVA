// Tural Hagverdiyev 
// I put constant for n, and then I put doubles (decimals) for coordinates, then I use math method to 
// find the frormula for angle, then syntax for outpitting x and y coordinates, before that i am using math cos and math sin
// methods to find x and y coordinates related to my radius and angle.  
import java.util.Scanner; 
public class JavaLabExam1
{
   public static void main (String[] args)
    
   {
  
  Scanner input=new Scanner(System.in);
   final int n = 6; 
  double angle;
  double radius;
  double x1,y1;
  double x2,y2;
  double x3,y3;
  double x4,y4;
  double x5,y5;
  double x6,y6;
  
  System.out.print("Enter the radius of the bounding circle: ");
       radius = input.nextDouble();
       angle = (2*Math.PI)/n;
       x1 =  radius*Math.sin(0*angle);
       y1 =  radius*Math.cos(0*angle);

       x2 =  radius*Math.sin(1*angle);
       y2 =  radius*Math.cos(1*angle);
       
       x3 =  radius*Math.sin(2*angle);
       y3 =   radius*Math.cos(2*angle);
       
       x4 =  radius*Math.sin(3*angle);
       y4 = radius*Math.cos(3*angle);
       
       x5 =  radius*Math.sin(4*angle);
       y5 =  radius*Math.cos(4*angle);
       
       x6 =  radius*Math.sin(5*angle);
       y6 = radius*Math.cos(5*angle);
       
       
       
       System.out.println("First vertex: " + "(" + x1 + ", "+ y1 + ")");
       
       System.out.println("Second vertex: " + "(" + x2 + ", "+ y2 + ")");
       
       System.out.println("Third vertex: " + "(" + x3 + ", "+ y3 + ")");
       
       System.out.println("Fourth vertex: " + "(" +  x4 + ", "+ y4 + ")");
       
       System.out.println("Fifth vertex: " + "("+ x5 + ", "+ y5 + ")");
       



       
       


 
 
  

  
  




  
  
  
  
  
  
  
  
  
  
   }
}
