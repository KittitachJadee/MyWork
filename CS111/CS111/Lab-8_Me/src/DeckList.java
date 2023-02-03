import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Pangon La-or-on
//6409700074

public class DeckList {
	ArrayList<Card> cards=new ArrayList<Card>();
	
	public DeckList() {
		for(int i=0, k=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				cards.add(new Card(i, j));
			}
		}
	}
	
	public void shuffle() {
//		Random ran=new Random();
//		Card swap;
//		int numCard1, numCard2;
//		for(int i=0; i<cards.size(); i++)
//		{
//			numCard1=ran.nextInt(cards.size());
//			numCard2=ran.nextInt(cards.size());
//			swap=cards.get(numCard1);
//			cards.set(numCard1, cards.get(numCard2));
//			cards.set(numCard2, swap);
//		}
		Collections.shuffle(cards);
	}
	
	public Card getCard(int index) {
		return cards.get(index);
	}
	
	public int findCard(Card card) {
		for(int i=0; i<cards.size(); i++)
		{
			if(card.getSuit()==cards.get(i).getSuit())
			{
				if(card.getRank()==cards.get(i).getRank())
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public void checkDeck() {
		int amount=0;
		Card card;
		for(int i=0, k=0; i<4 ; i++)
		{
			for(int j=0; j<13; j++)
			{
				card=new Card(i, j);
				if(findCard(card)==-1)
				{
					System.out.println(card.toString());
				}
				else
				{
					amount++;
					if(amount==52)
					{
						System.out.println("Full Deck");
					}
				}
			}
		}
	}
	
	public Card removeCard(int index) {
		Card card=cards.get(index);
		cards.remove(index);
		return card;
	}
	
	public void addCard(Card card, int index) {
		if(findCard(card)==-1)
		{
			cards.add(index, card);
		}
		else
		{
			System.out.println("Invalid input, have this card in deck.");
		}
	}
	
	public void printDeck() {
		for(int i=0; i<cards.size(); System.out.println(cards.get(i).toString()), i++);
	}
}
