/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

import static cardtrickice1.Card.RANKS;
import static cardtrickice1.Card.SUITS;

public class CardTrickICE1 {

    public static void main(String[] args) 
    {
        Card luckCard = new Card("diamonds",8); //Added from GitHub
        Card[] magicHand = new Card[7];
        String draw;
        String rank;

        for(int i=0;i<magicHand.length;i++) {
            draw = SUITS[(int) (Math.random()*4)];
            rank = RANKS[(int) (Math.random()*13)];
            magicHand[i] = new Card(draw, rank);
            System.out.println(magicHand[i]);
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("1. diamonds\n2. clubs\n3. spades\n4. hearts\nChoose suit: ");
        int suit = input.nextInt();
        System.out.print("Enter rank number(1 to 13): ");
        int value = input.nextInt();
        Card c1 = new Card(SUITS[suit-1], RANKS[value-1]);
        System.out.println(c1);

        String output = "Sorry, no match";
        for (Card card : magicHand) {
            if (c1.toString().equals(card.toString())) {
                output = "Card is found";
                break;
            }
        }
        System.out.println(output);
    }
    
}
