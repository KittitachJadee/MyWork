import java.util.Random;
import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class BomberGame {
	private int playerLife = 3, comLife = 3;
	private GridData board[][];
	
	public BomberGame(int boardSize, int bombNo) {
		board = boardSize < 3? new GridData[3][3]: new GridData[boardSize][boardSize];
		bombNo = bombNo < 5? 5: bombNo;
		Random random = new Random();
		int complete = bombNo, row, col;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; board[i][j] = new GridData(), j++);
		}
		do {
			row = random.nextInt(boardSize);
			col = random.nextInt(boardSize);
			if(board[row][col].getHasBomb() == false) {
				board[row][col].setHasBomb(true);
				complete--;
			}
		}while(complete > 0);
	}
	
	private void printAllBomb() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j].getHasBomb()) System.out.print("b ");
				else System.out.print("- ");
			}
			if(i < board.length - 1) System.out.println();
		}
	}
	
	private void printBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j].getIsOpen()) {
					if(board[i][j].getHasBomb()) System.out.print("b ");
					else System.out.print("- ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
	
	public void play() {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int row, col;
		for(int i = 0; playerLife > 0 && comLife > 0; i++) {
			if(i % 2 == 0) {
				System.out.println("------- Player Turn --------");
				System.out.println("Input row");
				row = scan.nextInt();
				System.out.println("Input col");
				col = scan.nextInt();
				if((row >= board.length || row < 0) || (col >= board.length || col < 0)) {
					System.out.println("Invalid row or column. Choose again");
					i--;
					continue;
				}
				if(board[row][col].getIsOpen()) {
					System.out.println("Grid " +row +"," +col +" is already opened. Choose again");
					i--;
					continue;
				}
				board[row][col].setIsOpen(true);
				if(board[row][col].getHasBomb()) playerLife--;
				System.out.println("Openning Grid " +row +" , " +col);
				printBoard();
				System.out.println("Player Life: " +playerLife);
				System.out.println("Computer Life: " +comLife);
			}
			else {
				System.out.println("------- Computer Turn --------");
				row = random.nextInt(board.length);
				col = random.nextInt(board.length);
				System.out.println("Openning Grid " +row +" , " +col);
				if((row >= board.length || row < 0) || (col >= board.length || col < 0)) {
					System.out.println("Invalid row or column. Choose again");
					i--;
					continue;
				}
				if(board[row][col].getIsOpen()) {
					System.out.println("Grid " +row +"," +col +" is already opened. Choose again");
					i--;
					continue;
				}
				board[row][col].setIsOpen(true);
				if(board[row][col].getHasBomb()) comLife--;
				printBoard();
				System.out.println("Player Life: " +playerLife);
				System.out.println("Computer Life: " +comLife);
			}
		}
		System.out.println("\n------------- Game Ended. All Bombs' Location are -----------");
		printAllBomb();
	}
}
