// Tural Hagverdiyev U10263909
// In this program, user inputs name, color, price and amount of carats interested.
// for this program striing class, switch statements, private class, format etc has been used
import java.text.*;

public class  RareGemsClassFile{
   private String name, color;
   private double pricePerCarat;
   private double amountofcarats;
   
   private static double totalCost = 0;
   
   public RareGemsClassFile (String name, double amountofcarats)
   {
      this.name = name;
      this.amountofcarats = amountofcarats;
      
      setColor();
      setPrice();
   }
   
   private void setColor()
   {
      switch(name.toLowerCase())
      // swicth statements here for color per carat
      {
       case "tanzanite" : color ="Royal Blue";
           break;
         case "opal" : color = "Black";
           break;
         case "beryl" : color = "Red";
           break;
         case "musgravite" : color = "Grey";
           break;
         case "alexandrite" : color = "Purple";
           break;
         case "emerald" : color = "Green";
           break;
         case "ruby" : color = "Red";
           break;
         case "diamond" : color = "Pink";
           break;
         case "jadeite" : color= "Dark Green";
           break;
           default : color = "Not precious gem";
           break;
            
       }
   }

   
   private void setPrice()
   {
      switch(name.toLowerCase())
      // switch statements here for per carat price with decimals
      {
        case "tanzanite": pricePerCarat=1200.00;
           break;
         case "opal": pricePerCarat=9500.00;
           break;
         case "beryl": pricePerCarat=10000.00;
           break;
         case "musgravite": pricePerCarat=35000.00;
           break;
         case "alexandrite": pricePerCarat=70000.00;
           break;
         case "emerald": pricePerCarat=305000.00;
           break;
         case "ruby": pricePerCarat=1180000.00;
           break;
         case "diamond": pricePerCarat=1190000.00;
           break;
         case "jadeite": pricePerCarat=3000000.00;
           break;
           default : pricePerCarat = 0.00;
           break;
      }
   }
   
   private double calcCost()
   // calculating the total cost per chosen carat
   {
      double cost;
      cost = pricePerCarat * amountofcarats;
      totalCost = totalCost + cost;
       
      return cost;
   }  
   
   public static double getTotalCost()
   {
      return totalCost;
   }
   
   public String toString()
   // using toString method with Numformat 
   {
      NumberFormat format = NumberFormat.getCurrencyInstance();
     String layout;
     layout = name + color + format.format(pricePerCarat) + amountofcarats + format.format(calcCost());
          return layout;
  }
}