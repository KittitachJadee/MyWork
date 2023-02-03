//Kanyanat Det-in
//6409618011
import java.util.Random;
public class DeckArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckArray deckArr=new DeckArray();
		deckArr.shuffle();
		Random random=new Random();
		System.out.println(deckArr.getCard(14).toString());
		System.out.println();
		deckArr.findCard(new Card(random.nextInt(4), random.nextInt(13)));
		deckArr.checkDeck();
		System.out.println();
		deckArr.printDeck();
	}
}