/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP3A: Cards
*/

/**
* The source file being submitted is called TestCards.java. The purpose of this file is to test
* the functionality of Card.java, Deck.java, and Dealer.java
*/

/** Creating a class called TestCards which test funcitonality of other classes with a main method
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;
public class TestCards {

  public static void main (String[] args) {

    /** Testing Card.java methods and functionality
    * faceCard and numberedCard are new cards which are compared
    * using .equals()
    */
    Card faceCard = new Card(Card.ACE, Card.SPADES);
    Card numberedCard = new Card(8, Card.HEARTS);
    System.out.println(faceCard);
    System.out.println(numberedCard);
    System.out.println(faceCard.equals(numberedCard));
    System.out.println();

    /** Testing Deck.java methods and functionality
    * decky is a new Deck
    * Calling the .deal() method will deal a random card, .size()
    * gives size of the deck
    */
    Deck decky = new Deck();
    System.out.println("The following card was dealt: ");
    System.out.println(decky.deal());
    System.out.println("Updated deck: ");
    System.out.println(decky);
    System.out.println("Deck size: ");
    System.out.println(decky.size());
    System.out.println();

    /** Testing Dealer.java methods and functionality
    * Creating a dealer will allow users to manage a
    * card game by dealing cards and keeping track of which
    * ones have already been used
    * The .deals() method deals any specified number of random cards
    */
    Dealer dealer = new Dealer();
    System.out.println("The dealer has the following cards in a fresh deck: ");
    System.out.println(dealer);
    System.out.println("Deck size: ");
    System.out.println(dealer.size());
    System.out.println();
    System.out.println("The following cards were dealt: ");
    System.out.println(dealer.deals(12));
    System.out.println();
    System.out.println("Updated Deck:");
    System.out.println(dealer);
    System.out.println("Deck size: ");
    System.out.println(dealer.size());
  }

}
