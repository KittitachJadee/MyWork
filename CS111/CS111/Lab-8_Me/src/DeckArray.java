import java.util.Random;

//Pangon La-or-on
//6409700074

public class DeckArray {
	Card[] cards;
	
	public DeckArray() {
		cards=new Card[52];
		for(int i=0, k=0; i<4 ; i++)
		{
			for(int j=0; j<13; j++)
			{
				cards[k]=new Card(i, j);
				k++;
			}
		}
	}
	
	public void shuffle() {
		Random ran=new Random();
		Card swap;
		int numCard1, numCard2;
		for(int i=0; i<cards.length; i++)
		{
			numCard1=ran.nextInt(cards.length);
			numCard2=ran.nextInt(cards.length);
			swap=new Card(cards[numCard1].getSuit(), cards[numCard1].getRank());
			cards[numCard1]=cards[numCard2];
			cards[numCard2]=swap;
		}
	}
	
	public Card getCard(int i) {
		return cards[i];
	}
	
	public int findCard(Card card) {
		for(int i=0; i<cards.length; i++)
		{
			if(card.getSuit()==cards[i].getSuit())
			{
				if(card.getRank()==cards[i].getRank())
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
	
	public void printDeck() {
		for(int i=0; i<cards.length; System.out.println(cards[i].toString()), i++);
	}
}
