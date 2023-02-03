//Pangon La-or-on
//6409700074

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();

		person1.Person("Team", person1.FEMALE, 53, 173);
		person2.Person("Ja", person2.MALE, 39, 155);
		person3.Person("Ice", person3.MALE, 41, 160);
		
		System.out.println(person1.getDetail());
		System.out.println(person2.getDetail());
		System.out.println(person3.getDetail());
	}

}
