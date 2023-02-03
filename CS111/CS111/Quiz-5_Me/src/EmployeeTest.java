import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		Employee person1=new Employee();
		String name;
		double salary;
		
		System.out.print("Enter name: ");
		person1.setName(scan.nextLine());
		System.out.print("Enter salary: ");
		person1.setSalary(scan.nextDouble());
		System.out.print("Enter name: ");
		name=scan2.nextLine();
		System.out.print("Enter salary: ");
		salary=scan2.nextDouble();
		Employee person2=new Employee(name, salary);
		if(person1.getSalary()>person2.getSalary()) {
			System.out.println(person1.getName()+" takes more salary than "+person2.getName());
		}
		else if(person1.getSalary()==person2.getSalary()) {
			System.out.println(person1.getName()+" takes same salary "+person2.getName());
		}
		else {
			System.out.println(person2.getName()+" takes more salary than "+person1.getName());
		}
	}

}
