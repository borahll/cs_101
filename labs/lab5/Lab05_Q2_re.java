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
        byte starting = 1;
        String deck = "";
        int randomChoicePlayer2 = 0;
        int randomChoiceDealer2 = 0;
        String choiceDecision;
        int playerSum = 0;
        int dealerSum = 0;

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
             randomChoicePlayer2 = rand.nextInt(Integer.parseInt(String.valueOf(deck.charAt(0))),Integer.parseInt(String.valueOf(deck.charAt(deck.length()-1))));
             playerHand = playerHand + Integer.toString(randomChoicePlayer2);

             char randomChoicePlayerChar = playerHand.charAt(x);
             int randomChoicePlayerIndex = deck.indexOf(randomChoicePlayerChar);
             if(randomChoicePlayerIndex==0)
                {
                    newDeck = deck.substring(1,deck.length());
                    deck = newDeck;
                }
            else
                {
                    newDeck = deck.substring(0,randomChoicePlayerIndex-1) + deck.substring(randomChoicePlayerIndex+1, deck.length());
                    deck = newDeck;
                }

            playerSum = playerSum + Integer.parseInt(String.valueOf(deck.charAt(x)));

        }
        for(byte x=0;x<=1;x++)
        {
             randomChoiceDealer2 = rand.nextInt(Integer.parseInt(String.valueOf(deck.charAt(0))),Integer.parseInt(String.valueOf(deck.charAt(deck.length()-1))));
             dealerHand = dealerHand + Integer.toString(randomChoiceDealer2);

             char randomChoiceDealerChar = dealerHand.charAt(x);
             int randomChoiceDealerIndex = deck.indexOf(randomChoiceDealerChar);

             if(randomChoiceDealerIndex==0)
                {
                    newDeck = deck.substring(1,deck.length());
                    deck = newDeck;
                }
            else
                {
                    newDeck = deck.substring(0,randomChoiceDealerIndex-1) + deck.substring(randomChoiceDealerIndex+1, deck.length());
                    deck = newDeck;
                }

            dealerSum = dealerSum + Integer.parseInt(String.valueOf(deck.charAt(x)));

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
                    int randomChoice3 = rand.nextInt(Integer.parseInt(String.valueOf(deck.charAt(0))),Integer.parseInt(String.valueOf(deck.charAt(deck.length()-1))));
                    char randomChoice3Char = Integer.toString(randomChoice3).charAt(0);
                    int randomChoice3Index = deck.indexOf(randomChoice3Char);
                    if (randomChoice3Index == 0)
                    {
                        newDeck = deck.substring(1,deck.length());
                        deck = newDeck;
                    }
                    else 
                    {
                        newDeck = deck.substring(0,randomChoice3Index-1) + deck.substring(randomChoice3Index+1, deck.length());
                        deck = newDeck;
                    }
                    playerSum = playerSum + randomChoice3;
                    playerHand = playerHand + randomChoice3;

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
                do
                {
                    System.out.println("player stands\nPlayers turn is over now players hand sums to" + playerHand);
                    int randomChoice4 = rand.nextInt(Integer.parseInt(String.valueOf(deck.charAt(0))),Integer.parseInt(String.valueOf(deck.charAt(deck.length()-1))));
                    char randomChoice4Char = Integer.toString(randomChoice4).charAt(0);
                    int randomChoice4Index = deck.indexOf(randomChoice4Char);
                    if (randomChoice4Index == 0)
                    {
                        newDeck = deck.substring(1,deck.length());
                        deck = newDeck;
                    }
                    else
                    {
                        newDeck = deck.substring(0,randomChoice4Index-1) + deck.substring(randomChoice4Index+1, deck.length());
                        deck = newDeck;
                    }

                    dealerSum = dealerSum + randomChoice4;
                    dealerHand = dealerHand + randomChoice4;

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
