//Pangon La-or-on
//6409700074

public class MemberList {
	private String memberNameList="";
	private String groupName;
	private int amount;
	
	public MemberList(String groupName) {
		this.groupName=groupName;
	}
	public void addMember(Person p) {
		memberNameList+=p.getName()+" : "+p.getGender()+"\n";
		amount++;
	}
	public void printInfo() {
		System.out.printf("Group: %s\n\n",groupName);
		System.out.println(memberNameList);
		System.out.printf("Total: %d", amount);
	}
}
