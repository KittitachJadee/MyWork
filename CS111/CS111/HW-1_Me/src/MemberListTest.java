//Pangon La-or-on
//6409700074

public class MemberListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberList member=new MemberList("TUCS Year 1");
		Person person1=new Person();
		Person person2=new Person();
		Person person3=new Person();
		Person person4=new Person();
		
		person1.Person("Team", person1.FEMALE, 53, 173);
		person2.Person("Ja", person2.MALE, 39, 155);
		person3.Person("Ice", person3.MALE, 41, 160);
		person4.Person("Pond", person4.MALE, 47, 172);
		member.addMember(person1);
		member.addMember(person2);
		member.addMember(person3);
		member.addMember(person4);
		
		member.printInfo();
	}

}
