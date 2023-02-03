import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		File file = new File("Sample.txt");
		try {
			Scanner scanner = new Scanner(file);
			double num = scanner.nextDouble();
			System.out.println(num);
		}catch(FileNotFoundException e) {
			System.out.println("File not found " +e);
		}catch(InputMismatchException e) {
			System.out.println("Input was not a number " +e);
		}
	}

}
