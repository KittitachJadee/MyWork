//Kittitach Jadee
//6509700024
//24
import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width, height;
		System.out.print("Box size ");
		String message;
		message = scan.next();
		width = message.charAt(0)-48;
		height= message.charAt(2)-48;
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}

}
