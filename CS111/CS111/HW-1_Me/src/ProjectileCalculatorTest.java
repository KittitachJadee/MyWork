import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class ProjectileCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectileCalculator obj=new ProjectileCalculator();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please input velocity");
		obj.setU(scan.nextDouble());
		System.out.println("Please input angle");
		obj.setZeta(scan.nextDouble());
		System.out.printf("The highest point is at %.2f meters and the distance before "
				+ "falling is %.2f", obj.findSy(), obj.findSx());
	}
}
