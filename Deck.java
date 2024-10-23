//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 
//Date -

import java.util.Stack;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	//create a private Stack of Cards

	public Deck ()
	{
		//make a new Stack
		//add 52 cards to the stack
		//call a method maybe??
	}

	//modifiers
   public void shuffle ()
	{
		//add 52 cards to the stack
		//random maybe
	}	

   //accessors
	public int  size ()
	{
		return 0;
	}

	public int numCardsLeft()
	{
		return 0;
	}

	public Card nextCard()
	{
		return null;
	}

	public String toString()
	{
		return "";  //stackOfCards.toString().replaceAll(",","\n");
	}
 }