//Kanyanat Det-in
//6409618011
import java.util.Random;
public class DeckListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckList deckList=new DeckList();
		Random random=new Random();
		deckList.shuffle();
		System.out.println(deckList.getCard(6).toString());
		System.out.println("--------------------");
		deckList.findCard(new Card(random.nextInt(4), random.nextInt(13)));
		deckList.checkDeck();
		System.out.println("(Before remove)\n--------------------");
		deckList.removeCard(2);
		deckList.checkDeck();
		System.out.println("(After remove)\n--------------------");
		deckList.addCard(new Card(random.nextInt(4), random.nextInt(13)), 44);
		System.out.println("--------------------");
		deckList.printDeck();
	}
}
