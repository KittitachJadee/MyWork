//Pangon La-or-on
//6409700074

public class DeckArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckArray deckArr=new DeckArray();
		Card newCard=new Card(0, 0);
		
		deckArr.shuffle();
		System.out.println(deckArr.getCard(14).toString());
		System.out.println("--------------------");
		deckArr.findCard(newCard);
		deckArr.checkDeck();
		System.out.println("--------------------");
		deckArr.printDeck();
	}
}
