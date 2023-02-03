//Kanyanat Det-in
//6409618011
import java.util.Random;
import java.util.Scanner;
public class BomberGame {
	private int playerLife=3, comLife=3;
	private GridData board[][];
	public BomberGame(int boardSize, int bombNo) {
		Random ran=new Random();
		int c, r;
		if(boardSize<3)
			board=new GridData[3][3];
		else
			board=new GridData[boardSize][boardSize];
		//set default(new object)
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j]=new GridData();
			}
		}
		if(bombNo<5)
			bombNo=5;
		for(; bombNo>0;) {
			c=ran.nextInt(boardSize);
			r=ran.nextInt(boardSize);
			if(board[r][c].getHasBomb()==true)
				continue;
			else {
				board[r][c].setHasBomb(true);
				bombNo--;
			}
		}
	}
	private void printAllBomb() {
		for(int r=0; r<board.length; r++) {
			for(int c=0; c<board.length; c++) {
				if(board[r][c].getHasBomb()==false)
					System.out.print("- ");
				else
					System.out.print("b ");
			}
			System.out.println();
		}
	}
	private void printBoard() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[i][j].getIsOpen()==false)
					System.out.print("X ");
				else {
					if(board[i][j].getHasBomb()==false)
						System.out.print("- ");
					else
						System.out.print("b ");
				}
			}
			System.out.println();
		}
	}
	public void play() {
		Scanner input=new Scanner(System.in);
		Random ran=new Random();
		int r, c;
		boolean pass=false;
		while((playerLife>0&&comLife>0)&&(comLife>0)) {
			//Player
			if(pass==false) {
				System.out.println("------- Player Turn --------");
				System.out.println("Input row");
				r=input.nextInt();
				System.out.println("Input col");
				c=input.nextInt();
				if((board[r][c].getIsOpen()==true)||((r >= board.length||r<0)||(c>=board.length||c<0))) {
					if(board[r][c].getIsOpen())
						System.out.printf("Grid %d,%d is already opened. Choose again\n", r, c);
					else
						System.out.printf("Invalid row or column. Choose again\n");
					continue;
				}
				if(board[r][c].getHasBomb())
					playerLife--;
				board[r][c].setIsOpen(true);
				System.out.printf("Openning Grid %d, %d", r, c);
				printBoard();
				System.out.printf("Player Life: %d", playerLife);
				System.out.printf("Computer Life: %d", comLife);
			}
			//Com
				pass = false;
				System.out.println("------- Computer Turn --------");
				r = ran.nextInt(board.length);
				c = ran.nextInt(board.length);
				System.out.println("Openning Grid " +r +" , " +c);
				if((board[r][c].getIsOpen()==true)||((r>= board.length||r<0)||(c>=board.length||c<0))) {
					if(board[r][c].getIsOpen())
						System.out.printf("Grid %d,%d is already opened. Choose again\n", r, c);
					else
						System.out.printf("Invalid row or column. Choose again\n");
					pass = true;
					continue;
				}
				if(board[r][c].getHasBomb())
					comLife--;
				board[r][c].setIsOpen(true);
				printBoard();
				System.out.printf("Player Life: %d", playerLife);
				System.out.printf("Computer Life: %d", comLife);
		}
		System.out.println("\n------------- Game Ended. All Bombs' Location are -----------");
		printAllBomb();
	}
}