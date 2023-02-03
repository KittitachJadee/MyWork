import java.util.Scanner;
//Kanyanat Det-in
//6409618011
public class ProjectileCalculatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectileCalculator rock=new ProjectileCalculator();
		Scanner input=new Scanner(System.in);
		System.out.println("Please input velocity");
		rock.setU(input.nextDouble());
		System.out.println("Please input angle");
		rock.setZeta(input.nextDouble());
		System.out.printf("The highest point is at %.2f meters and the distance before "+ "falling is %.2f", rock.findSy(), rock.findSx());
	}
}