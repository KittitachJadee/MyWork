import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class CanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Can cocaCola = new Can();
		
		System.out.println("Please input the radius of a can");
		cocaCola.setRadian(scan.nextFloat());
		System.out.println("Please input the height of a can");
		cocaCola.setHeight(scan.nextFloat());
		System.out.printf("The side area of this can is:%.2f\n", cocaCola.calculateSideArea());
		System.out.printf("The volume of this can is:%.2f", cocaCola.calculateVolume());
	}

}
