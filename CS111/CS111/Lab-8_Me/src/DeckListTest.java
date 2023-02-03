//Pangon La-or-on
//6409700074

public class DeckListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckList deckList=new DeckList();
		Card newCard=new Card(0, 0);
		
		deckList.shuffle();
		System.out.println(deckList.getCard(6).toString());
		System.out.println("--------------------");
		deckList.findCard(newCard);
		deckList.checkDeck();
		System.out.println("(Before remove)\n--------------------");
		deckList.removeCard(2);
		deckList.checkDeck();
		System.out.println("(After remove)\n--------------------");
		deckList.addCard(newCard, 44);
		System.out.println("--------------------");
		deckList.printDeck();
	}
}
