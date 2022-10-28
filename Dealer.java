/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP3A: Cards
*/

/**
* The source file being submitted is called Dealer.java. The purpose of this file is to manage the cards of
* a deck during gameplay
*/

/** Creating a class called Dealer which manages the card deck during gameplay
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;
public class Dealer {

  /** Creating a private Deck member variable called m_deck */
  private Deck m_deck;

  /** Default constructor that initializes m_deck to a new Deck of 52 cards */
  public Dealer() {
    this.m_deck = new Deck();
  }

  /** Deals method which deal n number of cards and returns a new deck
  * @return test LinkedList showing the cards that were dealt
  */
  public LinkedList<Card> deals(int n) {
    LinkedList<Card> test = new LinkedList<Card>();
    for (int i = 0; i < n; ++i ) {
      test.add(m_deck.deal());
    }
    return test;
  }

  /** Size method that returns the size of the deck
  * @return this.m_deck.size() the size of a deck
  */
  public int size() {
    return this.m_deck.size();
  }

  /** To string method that calls toString on the entire deck
  * @return m_deck.toString() the contents of the entire card deck
  */
  public String toString() {
    return m_deck.toString();
  }

}
