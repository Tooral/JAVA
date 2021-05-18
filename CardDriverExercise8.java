// Tural Hagverdiyev 
// this program asks user to enter a number and, then based on number, it shuffles cards
// for this program, there has been used some classes such as scanner, boolean, string, if, while loops, for, etc. 

import java.util.*;
public class CardDriverExercise8
 {
    public static void main(String[] args) 
    {
        //creating a new object for deck of cards
        DecksOFCards deck = new DecksOFCards();
        
        Scanner scan = new Scanner(System.in);//scanner class
        
        int numbers1 = 0; //integers
        
        deck.shuffle();
        
        int cardnumbers2 = 1;
        
        //promt user to enter card number
        System.out.print("How many cards? ");
        
        numbers1 = scan.nextInt();
        
        while(cardnumbers2 <= numbers1 && deck.remains()) {
        
            System.out.println(cardnumbers2 + "." + deck.deal());
            
            cardnumbers2++;
        }
    }
}

 class DecksOFCards 
 {
    public static final int NewCards = 52;
    
    private static Card[] decksOfCards;
    
    public static int numbersofCards;

    //constructor for deck of cards
    public DecksOFCards()
     {
        numbersofCards = NewCards;
        
        decksOfCards = new Card[NewCards];
        
        int in = 0;

        for ( int set = 1; set <= 4; set++ ) //for loops
        
            for ( int main= 1; main <= 13; main++ )
            
                decksOfCards[in++] = new Card(set, main);

    }
    //method for deal
    
    public static Card deal()
     {
        if(numbersofCards > 0)
         {
            return decksOfCards[--numbersofCards];
        }
        return null;
       
    }
    //number of cards that still remains
    public static boolean remains()
     {
        if(numbersofCards > 0)
         {
            return true;
        }
        return false;
    }


    // shuffle the cards
    public void shuffle()
     {

        Card temp;
        int a, b;

        for (int i = 0; i < 9999 ; i ++)
        {
            a = (int) ( NewCards * Math.random() );
            
            b = (int) ( NewCards * Math.random() );
            
            temp = decksOfCards[a];
            
            decksOfCards[a] = decksOfCards[b];
            
            decksOfCards[b] = temp;
        }
    }
}

 class Cards {
    private static int main;
    private static int set;
    private String maincard, setcard;

    //constructor of class card with parameters
    public Cards(int set, int main) {
        this.main = main;
        
        this.set = set;
        PackOfCardColors();
    }
    //card number - main
    private void PackOfCardNumbers() {
        switch(main) {
            case 1: maincard = "Ace";
                break;
            case 2: maincard = "Two";
                break;
            case 3: maincard = "Three";
                break;
            case 4: maincard = "Four";
                break;
            case 5: maincard = "Five";
                break;
            case 6: maincard = "Six";
                break;
            case 7: maincard = "Seven";
                break;
            case 8: maincard = "Eigth";
                break;
            case 9: maincard = "Nine";
                break;
            case 10: maincard = "Ten";
                break;
            case 11: maincard = "Jack";
                break;
            case 12: maincard = "Queen";
                break;
            case 13: maincard = "King";
                break;
        }
    }
    //card color - sets
    private void PackOfCardColors() {
        switch(set) {
            case 1: setcard = "Hearts";
                break;
            case 2: setcard = "Clubs";
                break;
            case 3: setcard = "Spades";
                break;
            case 4: setcard = "Diamonds";
                break;
        }
    }
    public String toString() {
        return (maincard + " of " + setcard);
    }
}
