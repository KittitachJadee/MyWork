//Kanyanat Det-in
//6409618011
public class MemberList {
	private String memberNameList="", groupName;
	private int amount;
	public MemberList(String gName) {
		groupName=gName;
	}
	public void addMember(Person person) {
		memberNameList+=person.getName();
		memberNameList+=" : ";
		memberNameList+=person.getGender();
		memberNameList+="\n";
		amount++;
	}
	public void printInfo() {
		System.out.println("Group: "+groupName);
		System.out.println();
		System.out.println(memberNameList);
		System.out.println("Total: "+amount);
	}
}