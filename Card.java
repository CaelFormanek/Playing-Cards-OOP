/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP3A: Cards
*/

/**
* The source file being submitted is called Card.java. The purpose of this file is to detail a playing card,
* including its value and suit. It includes a default constructor, an overloaded constructor, and a
* copy constructor, along with accessors and mutators for each of its private member variables.
*/

/** Creating a class called Card which stores information about the aspects of a playing card
* @author Cael Formanek
* @version 1.0
*/
import java.util.*;
public class Card {

  /** Declaring private member variables for card value and suit */
  private int cardValue;
  private int cardSuit;

  /** Constants for cardSuit are defined here, with a different int value associated with each suit */
  public static final int HEARTS = 0;
  public static final int SPADES = 1;
  public static final int CLUBS = 2;
  public static final int DIAMONDS = 3;

  /** Constants for face cards are declared here, with different in values associated with each face card */
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;
  public static final int ACE = 14;

  /** Default constructor that makes an ace of spades */
  public Card() {
    this.cardValue = SPADES;
    this.cardSuit = ACE;
  }

  /** Overloaded constructor
  * @param cardValue is the value of the card
  * @param cardSuit is the suit of the card
  */
  public Card(int cardValue, int cardSuit) {
    this.cardValue = cardValue;
    this.cardSuit = cardSuit;
  }

  /** Copy constructor */
  public Card(Card card) {
    this.cardValue = card.cardValue;
    this.cardSuit = card.cardSuit;
  }

  /** Accessor for the value of the card
  * @return this.cardValue gives the value of the card
  */
  public int getCardValue() {
    return this.cardValue;
  }

  /** Accessor for the value of the card
  * @return this.cardSuit gives the suit of the card
  */
  public int getCardSuit() {
    return this.cardSuit;
  }

  /** Mutator for the value of the card
  * @param newCardValue sets the card's value
  */
  public void setCardValue(int newCardValue) {
    this.cardValue = newCardValue;
  }

  /** Mutator for the suit of the card
  * @param newCardSuit sets the card's suit
  */
  public void setCardSuit(int newCardSuit) {
    this.cardSuit = newCardSuit;
  }

  /** To string method displays details fo the card */
  public String toString() {

    /** Using a hashmap to assign a String to face cards */
    HashMap<Integer, String> faceCards = new HashMap<Integer, String>();
    faceCards.put(JACK, "Jack");
    faceCards.put(QUEEN, "Queen");
    faceCards.put(KING, "King");
    faceCards.put(ACE, "Ace");

    /** Using a hashmap to assign a String to suits */
    HashMap<Integer, String> cardSuits = new HashMap<Integer, String>();
    cardSuits.put(HEARTS, "Hearts");
    cardSuits.put(SPADES, "Spades");
    cardSuits.put(CLUBS, "Clubs");
    cardSuits.put(DIAMONDS, "Diamonds");

    /** If the card is not a face card, display the numbered value, otherwise display the facecard (Jack, Queen, King, Ace) */
    if (this.cardValue > 10) {
      return faceCards.get(this.cardValue) + " of " + cardSuits.get(this.cardSuit);
    }
    else {
      return this.cardValue + " of " + cardSuits.get(this.cardSuit);
    }

  }

  /** Equals method will tests if two cards are equal based on their value */
  public boolean equals(Card myCard) {
    System.out.println("Are these two cards the same? Return true if they are, return false if they are not:");
    return (this.cardValue == myCard.cardValue);
  }

}
