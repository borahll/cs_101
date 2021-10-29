package lab5;

import java.util.Scanner;
import java.util.Random;

public class Lab05_Q2_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("starting the game with the following deck");

        String playerHand = "";
        String dealerHand = "";
        byte starting = 1;
        String deck = "";
        int randomChoicePlayer2 = 0;
        int randomChoiceDealer2 = 0;

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
             randomChoicePlayer2 = rand.nextInt(1,10);
             playerHand = playerHand + Integer.toString(randomChoicePlayer2);

        }
        for(byte m=0;m<=1;m++)
        {
             randomChoiceDealer2 = rand.nextInt(1,10);
             dealerHand = dealerHand + Integer.toString(randomChoiceDealer2);

        }

        int randomChoicePlayer1 = Integer.parseInt(String.valueOf(playerHand.charAt(0)));
        int randomChoiceDealer1 = Integer.parseInt(String.valueOf(dealerHand.charAt(0)));

        int playerSum = randomChoicePlayer1 + randomChoicePlayer2;
        int dealerSum = randomChoiceDealer1 + randomChoiceDealer2;
        String choiceDecision;

        String newDeck ;


        char randomChoicePlayer1Char = playerHand.charAt(0);
        char randomChoicePlayer2Char = playerHand.charAt(1);
        char randomChoiceDealer1Char = dealerHand.charAt(0);
        char randomChoiceDealer2Char = dealerHand.charAt(1);

        System.out.println("");
        System.out.println("Dealer is now dealing cards...");
        System.out.println(" player hand\n" + playerHand);
        System.out.println("dealer's hand\n" + dealerHand.charAt(0) + "?");

        
        int randomChoicePlayer1Index = deck.indexOf(randomChoicePlayer1Char);
        if(randomChoicePlayer1Index==0)
        {
            newDeck = deck.substring(1,deck.length());
            deck = newDeck;
        }
        else
        {
            newDeck = deck.substring(0,randomChoicePlayer1Index-1) + deck.substring(randomChoicePlayer1Index+1, deck.length());
            deck = newDeck;
        }

        int randomChoicePlayer2Index = newDeck.indexOf(randomChoicePlayer2Char);
        if(randomChoicePlayer2Index==0)
        {
            newDeck = deck.substring(1, deck.length());
            deck = newDeck;
        }
        else
        {
            newDeck = deck.substring(0, randomChoicePlayer2Index-1) + deck.substring(randomChoicePlayer2Index+1, deck.length() );
            deck = newDeck;
        }

        int randomChoiceDealer1Index = deck.indexOf(randomChoiceDealer1Char);
        if(randomChoiceDealer1Index==0)
        {
            newDeck = deck.substring(1,deck.length());
            deck = newDeck;
        }
        else
        {
            newDeck = deck.substring(0, randomChoiceDealer1Index-1) + deck.substring(randomChoiceDealer1Index+1, deck.length() );
            deck = newDeck;
        }

        int randomChoiceDealer2Index = deck.indexOf(randomChoiceDealer2Char);
        if(randomChoiceDealer2Index==0)
        {
            newDeck = deck.substring(1,deck.length());
            deck = newDeck;
        }
        else
        {
            newDeck = deck.substring(0, randomChoiceDealer2Index-1) + deck.substring(randomChoiceDealer2Index+1, deck.length() );
            deck = newDeck;
        }


        do{
            System.out.println("please enter your choice:\n" + "1)Hit\n" + "2)Stand\n" + "your choice:");
            choiceDecision = sc.next();

            if(choiceDecision.equals("1"))
            {
                int randomChoice3 = rand.nextInt(1, 10);
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
        
                }
                if(playerSum>21)
                {
                    System.out.println("dealer won");                }
            }          
        }
        while(choiceDecision.equals("1"));

        if(choiceDecision.equals("2"))
            {
                do
                {
                    System.out.println("player stands\nPlayers turn is over now players hand sums to" + playerHand);
                    int randomChoice4 = rand.nextInt(1, 10);
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
                    }
                    if(dealerSum>21)
                    {
                        System.out.println("Player won");
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
