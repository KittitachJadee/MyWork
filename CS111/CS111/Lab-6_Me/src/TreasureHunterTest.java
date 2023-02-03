import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class TreasureHunterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		TreasureHunter game=new TreasureHunter();
		int choice=0;
		do {
			game.play();
			System.out.print("Do you want to play again (1=Yes)?: ");
			choice=scan.nextInt();
		}while(choice==1);
		System.out.println("Good bye.");
	}

}
