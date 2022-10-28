/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP3A: Cards
*/

/**
* The source file being submitted is called Deck.java. The purpose of this file is to detail a playing card deck,
* where each card is based off of a Card.java Card object.
*/

/** Creating a class called Deck which stores information about the aspects of a playing card deck
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;
public class Deck {

  /** Creating a private member variable Card called deckSetter which will
  * eventually create every card within a deck
  */
  private Card deckSetter;

  /** Declaring the linked list data structure */
  LinkedList<Card> m_cards = new LinkedList<Card>();

  /** Default constructor that initializes fresh deck of 52 cards within linked list
  * Values and Suits store values and suits that will construct the card deck
  */
  public Deck() {

    /** Values has all of the possible values of a playing card
    * This makes it so we can construct the deck with a nested for loop by storing card
    * values in one place
    * The link below was used to find the addAll method used to add all 4 values at once
    * https://howtodoinjava.com/java/collections/arraylist/add-multiple-elements-arraylist/
    */
    ArrayList<Integer> Values = new ArrayList<Integer>();
    Collections.addAll(Values, Card.JACK, Card.QUEEN, Card.KING, Card.ACE);
    for (int i = 2; i < 11; ++i) {
      Values.add(i);
    }

    /** Suits has all of the possible suits of a playing card
    * This makes it so we can construct the deck with a nested for loop
    * by storing card suits in one place
    */
    ArrayList<Integer> Suits = new ArrayList<Integer>();
    Collections.addAll(Suits, Card.HEARTS, Card.SPADES, Card.CLUBS, Card.DIAMONDS);

    /** Nested for-each loops initialize m_cards to have 52 cards */
    for (int value : Values) {
      for (int suit : Suits) {
        deckSetter = new Card(value, suit);
        m_cards.add(deckSetter);
      }
    }
  }

    /** Copy constructor that makes a deep copy of each card */
    public Deck(Deck deck) {
      this.deckSetter = new Card(deck.deckSetter);
    }

    /** Size method which returns the size of a deck
    * @return this.m_cards.size() the size of a deck
    */
    public int size() {
      return this.m_cards.size();
    }

    /** Deal method which removes a card from the deck and tells the user which card(s) it was
    * @return removed the card that was removed from the deck after dealing it
    */
    public Card deal() {
      Random randy1 = new Random();
      int remove = randy1.nextInt(size());
      Card removed = this.m_cards.get(remove);
      this.m_cards.remove(removed);
      return removed;
    }

    /** To string method just calls toString on m_cards
    * @return m_cards.toString() the content of the entire deck of cards
    */
    public String toString() {
      return m_cards.toString();
    }

}
