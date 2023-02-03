//Kanyanat Det-in
//6409618011
public class StringCoder {
	private String code;
	public StringCoder(String code) {
		this.code=code;
	}
	public String blowUp() {
		String result="";
		int amount;
		for(int i=0; i<code.length(); i++) {
			if(Character.isDigit(code.charAt(i))==false||i==code.length()-1) {
				result+=code.charAt(i);
			}
			else {
				amount=Character.getNumericValue(code.charAt(i));
				for(int j=1; j<=amount; result+=code.charAt(i+1) ,j++);
			}
		}
		return result;
	}
	public int maxRun(String str) {
		int maxRun=1;
		int amount=1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				amount++;
			else
				amount=1;
			if(amount>maxRun)
				maxRun=amount;
		}
		return maxRun;
	}
	public int maxRun() {
		int maxRun=1;
		int amount=1;
		for(int i=1; i<code.length()-1; i++) {
			if(code.charAt(i)==code.charAt(i+1))
				amount++;
			else
				amount=1;
			if(amount>maxRun)
				maxRun=amount;
		}
		return maxRun;
	}
	public String getCode() {
		return code;
	}
	public void formStep() {
		int i, j;
		String str=blowUp();
		String str2=""+str.charAt(0);
		for(i=0; i<maxRun(str); i++) {
			System.out.print("-");
			if(i==maxRun(str)-1)
				System.out.println("+");
		}
		for(i=1; i<str.length(); i++) {
			if(str.length()==1)
				System.out.println(str.charAt(i) +"|");
			else if(i==str.length()-1) {
				if(str.charAt(i)==str.charAt(i-1)) {
					for(j=0; j<maxRun(str)-(str2.length()+1); System.out.print(" ") ,j++);
					System.out.println(str2+str.charAt(i)+"|");
				}
				else {
					for(j=0; j<maxRun(str)-str2.length(); j++) {
						System.out.print(" ");
						if(j==(maxRun(str)-str2.length())-1)
							System.out.println(str2 +"|");
					}
					for(j=0; j<maxRun(str)-1; j++) {
						System.out.print(" ");
						if(j==maxRun(str)-2)
							System.out.println(str.charAt(i) +"|");
					}
				}
			}
			else {
				if(str.charAt(i)==str.charAt(i-1))
					str2+=str.charAt(i);
				else {
					for(j=0; j<maxRun(str)-str2.length(); System.out.print(" ") ,j++);
					System.out.println(str2 +"|");
					str2=""+str.charAt(i);
				}
			}
		}
		for(i=0; i<maxRun(str); i++) {
			System.out.print("-");
			if(i==maxRun(str)-1)
				System.out.println("+");
		}
	}
}