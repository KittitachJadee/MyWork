import java.util.Scanner;

public class TwoPointsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoPoints test = new TwoPoints();

        System.out.print("Input x value for the first point: ");
        test.setFirstX(scanner.nextDouble());
        System.out.print("Input y value for the first point: ");
        test.setFirstY(scanner.nextDouble());
        System.out.print("Input x value for the second point: ");
        test.setSecondX(scanner.nextDouble());
        System.out.print("Input y value for the second point: ");
        test.setSecondY(scanner.nextDouble());

        System.out.printf("The distance between them is: %.3f\n", test.findDistance());
        System.out.printf("The slope between them is: %.3f", test.findSlope());
    }
}