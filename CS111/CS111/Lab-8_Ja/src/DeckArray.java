//Kanyanat Det-in
//6409618011
import java.util.Random;
public class DeckArray {
	Card[] cards;
	
	public DeckArray() {
		cards=new Card[52];
		int i, j, count=0;
		for(i=0; i<4 ; i++){
			for(j=0; j<13; cards[count]=new Card(i, j), count++, j++);
		}
	}
	public void shuffle() {
		int positionCard1, positionCard2;
		Random random=new Random();
		for(int i=0; i<cards.length; i++){
			positionCard1=random.nextInt(52);
			Card  change=new Card(cards[positionCard1].getSuit(), cards[positionCard1].getRank());
			positionCard2=random.nextInt(52);
			cards[positionCard1]=cards[positionCard2];
			cards[positionCard2]=change;
		}
	}
	public int findCard(Card card) {
		for(int i=0; i<cards.length; i++){
			if((card.getSuit()==cards[i].getSuit())&&(card.getRank()==cards[i].getRank())) return i;
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
	public Card getCard(int i) {
		return cards[i];
	}
	public void printDeck() {
		for(int i=0; i<52; System.out.println(cards[i].toString()), i++);
	}
}
