//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class DeckList {
	ArrayList<Card> cards=new ArrayList<Card>();;
	
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
		Collections.shuffle(cards);
	}
	public Card getCard(int index) {
		return cards.get(index);
	}
	
	public int findCard(Card card) {
		for(int i=0; i<cards.size(); i++){
			if((card.getSuit()==cards.get(i).getSuit())&&(card.getRank()==cards.get(i).getRank()))
					return i;
		}
		return -1;
	}
	public void checkDeck() {
		Card card;
		int i, j;
		for(i=0; i<4 ; i++){
			for(j=0; j<13; j++){
				card=new Card(i, j);
				if(findCard(card)==-1)
					System.out.println(card.toString());
				else {
					if((i==3)&&(j==12))
						System.out.println("Full Deck");
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
			cards.add(index, card);
		else
			System.out.println("Error");
	}
	public void printDeck() {
		for(int i=0; i<cards.size(); System.out.println(cards.get(i).toString()), i++);
	}
}
