//Kanyanat Det-in
//6409618011
import java.util.Scanner;
public class StringCoderTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		StringCoder str;
		int i=1;
		char round;
		do {
			System.out.print("Enter your string: ");
			str=new StringCoder(input.nextLine());
			System.out.println("Round "+i +": "+str.getCode());
			System.out.println("blowUp "+str.blowUp());
			System.out.println("maxRun "+str.maxRun());
			System.out.println("maxRun blowUp "+str.maxRun(str.blowUp()));
			str.formStep();
			System.out.print("Continue (y/n)? ");
			round=input2.next().charAt(0);
			i++;
		}while(round=='y');
		System.out.print("Bye!");
	}
}