//Kanyanat Det-in
//6409618011
public class MemberListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberList group=new MemberList("TUCS Year 1");
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.Person("Tida", p1.MALE, 38, 157);
		p2.Person("Job", p3.FEMALE, 58, 180);
		p3.Person("Tawan", p3.FEMALE, 70, 186);
		group.addMember(p1);
		group.addMember(p2);
		group.addMember(p3);
		group.printInfo();
	}
}