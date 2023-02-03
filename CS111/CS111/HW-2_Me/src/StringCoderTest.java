import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class StringCoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		StringCoder str;
		char again='y';
		
		for(int i=0; again=='y'; i++) {
			System.out.print("Enter your string: ");
			str=new StringCoder(scan.nextLine());
			System.out.println("Round " +i +": " +str.getCode());
			System.out.println("blowUp " +str.blowUp());
			System.out.println("maxRun " +str.maxRun());
			System.out.println("maxRun blowUp " +str.maxRun(str.blowUp()));
			str.formStep();
			System.out.print("Continue (y/n)? ");
			again=scan2.next().charAt(0);
		}
		System.out.print("Bye!");
	}
}