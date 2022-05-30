/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private String rank;
    private String suit; //encapsulation
    //constant
    public static final String [] SUITS = {"diamonds","clubs","spades","hearts"};
    public static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String toString(){
        return this.rank + " of " + this.suit;
    }
}
