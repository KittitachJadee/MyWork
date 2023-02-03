import java.util.Scanner;
//Kanyanat Det-in
//6409618011
public class CanTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Can can = new Can();
		System.out.println("Please input the radius of a can");
		can.setRadian(input.nextFloat());
		System.out.println("Please input the height of a can");
		can.setHeight(input.nextFloat());
		System.out.printf("The side area of this can is:%.2f\n", can.calculateSideArea());
		System.out.printf("The volume of this can is:%.2f", can.calculateVolume());
	}
}
