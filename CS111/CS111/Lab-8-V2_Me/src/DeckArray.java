import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Pangon La-or-on
//6409700074

public class DeckArray {
	ArrayList<Card> cards;
	
	public DeckArray() {
		cards = new ArrayList<Card>();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; cards.add(new Card(i, j)), j++);
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public void printDeck() {
		for(Card card: cards) {
			System.out.println(card.toString());
		}
	}
	public Card getCard(int i) {
		return cards.get(i);
	}
	public int findCard(Card card) {
		for(int i = 0; i < 52; i++) {
			if(cards.get(i).getRank() == card.getRank() &&
			   cards.get(i).getSuit() == card.getSuit()) {
				return i;
			}
		}
		return -1;
	}
	public void checkDeck() {
		boolean fullDeck = true;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				Card newCard = new Card(i, j);
				if(findCard(newCard) == -1) {
					System.out.println(newCard.toString());
					fullDeck = false;
				}
			}
		}
		if(fullDeck) {
			System.out.println("Full Deck");
		}
	}
	public Card removeCard(int index) {
		Card card = cards.get(index);
		cards.remove(index);
		return card;
	}
	public void addCard(Card card, int index) {
		boolean canAdd = true;
		for(Card newCard: cards) {
			if(newCard.getRank() == card.getRank() && newCard.getSuit() == card.getSuit()) {
				canAdd = false;
			}
		}
		if(canAdd) {
			cards.add(index, card);
		}
		else {
			System.out.println("Can't add card, because in deck have this card");
		}
	}
	
	public static void main(String[] args) {
		DeckArray deck = new DeckArray();
		Card newCard = new Card(5, 5);
		deck.checkDeck();
		deck.shuffle();
		deck.printDeck();
	}
}
