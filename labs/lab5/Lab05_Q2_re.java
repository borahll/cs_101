package lab5;

import java.util.Scanner;
import java.util.Random;

public class Lab05_Q2_re {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("starting the game with the following deck");
        String newDeck ;

        String playerHand = "";
        String dealerHand = "";
        int randomChoicePlayer = 0;
        int randomChoiceDealer = 0;
        String choiceDecision;
        int playerSum = 0;
        int dealerSum = 0;

        byte starting = 1;
        String deck = "";


        for(byte a=0;a<9;a++)
        {
            for(byte i=0;i<4;i++)
            {
                deck = deck + String.valueOf(starting);
                System.out.print(starting);
            }
            starting++;
        }


        for(byte x=0;x<=1;x++)
        {
             randomChoicePlayer = rand.nextInt(0,deck.length());
             playerHand = playerHand + String.valueOf(deck.charAt(randomChoicePlayer));

             if(randomChoicePlayer==0)
                {
                    newDeck = deck.substring(1,deck.length());
                    deck = newDeck;
                }
            else
                {
                    newDeck = deck.substring(0,randomChoicePlayer) + deck.substring(randomChoicePlayer+1, deck.length());
                    deck = newDeck;
                }

            playerSum = playerSum + Integer.parseInt(String.valueOf(playerHand.charAt(x)));

        }
        for(byte x=0;x<=1;x++)
        {
             randomChoiceDealer = rand.nextInt(0,deck.length());
             dealerHand = dealerHand + String.valueOf(deck.charAt(randomChoiceDealer));

             if(randomChoiceDealer==0)
                {
                    newDeck = deck.substring(1,deck.length());
                    deck = newDeck;
                }
            else
                {
                    newDeck = deck.substring(0,randomChoiceDealer) + deck.substring(randomChoiceDealer+1, deck.length());
                    deck = newDeck;
                }
            dealerSum = dealerSum + Integer.parseInt(String.valueOf(dealerHand.charAt(x)));
        }

        System.out.println("");
        System.out.println("Dealer is now dealing cards...");
        System.out.println(" player hand\n" + playerHand);
        System.out.println("dealer's hand\n" + dealerHand.charAt(0) + "?");

        do{
            System.out.println("please enter your choice:\n" + "1)Hit\n" + "2)Stand\n" + "your choice:");
            choiceDecision = sc.next();

                if(choiceDecision.equals("1"))
                {
                    int randomChoice3 = rand.nextInt(0,deck.length());

                    if (randomChoice3 == 0)
                    {
                        newDeck = deck.substring(1,deck.length());
                        deck = newDeck;
                    }
                    else 
                    {
                        newDeck = deck.substring(0,randomChoice3) + deck.substring(randomChoice3+1, deck.length());
                        deck = newDeck;
                    }
                    playerSum = playerSum + Integer.parseInt(String.valueOf(deck.charAt(randomChoice3)));
                    playerHand = playerHand + String.valueOf(deck.charAt(randomChoice3));

                    System.out.println("Hit! Dealers giving the player a card\n" + "players hand:\n" + playerHand);

                    if(playerSum == 21 )
                    {
            
                        System.out.println("player wins");
                        System.out.println(deck);        
                        System.exit(0);
            
                    }
                    if(playerSum>21)
                    {
                        System.out.println("dealer won"); 
                        System.out.println(deck);         
                        System.exit(0);              
                    }
                }          
        }
        while(choiceDecision.equals("1"));

        if(choiceDecision.equals("2"))
            {
                System.out.println("player stands\nPlayers turn is over now players hand sums to" + playerHand + "\ndealers hand:\n" + dealerHand);

                do
                {
                    int randomChoice4 = rand.nextInt(0,deck.length());

                    if (randomChoice4 == 0)
                    {
                        newDeck = deck.substring(1,deck.length());
                        deck = newDeck;
                    }
                    else
                    {
                        newDeck = deck.substring(0,randomChoice4) + deck.substring(randomChoice4+1, deck.length());
                        deck = newDeck;
                    }

                    dealerSum = dealerSum + Integer.parseInt(String.valueOf(deck.charAt(randomChoice4)));
                    dealerHand = dealerHand + String.valueOf(deck.charAt(randomChoice4));

                    System.out.println("Stand! Dealer is playing\n" + "dealers hand:\n" + dealerHand);

                    if(dealerSum == 21)
                    {
            
                        System.out.println("dealer wins");
                        System.out.println(deck);        
                        System.exit(0);
                    }
                    if(dealerSum>21)
                    {
                        System.out.println("Player won");
                        System.out.println(deck);        
                        System.exit(0);
                    }
                }
                while(dealerSum<playerSum);
                
                if (dealerSum>playerSum && dealerSum < 21)
                {
                    System.out.println("dealer won");
                }
                else if(playerSum>dealerSum && playerSum < 21)
                {
                    System.out.println("player won");
                }
            }
        System.out.println(deck);        
        sc.close();
    }    
}
