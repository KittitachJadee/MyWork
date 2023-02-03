//Pangon La-or-on
//6409700074
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
		int maxAmount=1, amount=1;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				amount++;
				if(amount>maxAmount)
					maxAmount=amount;
			}
			else
				amount=1;
		}
		return maxAmount;
	}
	
	public int maxRun() {
		int maxAmount=1, amount=1;
		for(int i=1; i<code.length(); i++) {
			if(code.charAt(i-1)==code.charAt(i)) {
				amount++;
				if(amount>maxAmount)
					maxAmount=amount;
			}
			else
				amount=1;
		}
		return maxAmount;
	}
	public void formStep() {
		String str=blowUp();
		int i, j, maxAmount=maxRun(str);
		String strList="";
		for(i=0; i<maxAmount; System.out.print("-"), i++);
		System.out.println("+");
		for(i=0; i<str.length(); i++) {
			if(i==0) {
				strList+=str.charAt(i);
				if(str.length()==1)
					System.out.println(str.charAt(i) +"|");
			}
			else if(i>0 && i<str.length()-1) {
				if(str.charAt(i)==str.charAt(i-1))
					strList+=str.charAt(i);
				else {
					for(j=0; j<maxAmount-strList.length(); System.out.print(" ") ,j++);
					System.out.println(strList +"|");
					strList="";
					strList+=str.charAt(i);
				}
			}
			else {
				if(str.charAt(i)==str.charAt(i-1)) {
					strList+=str.charAt(i);
					for(j=0; j<maxAmount-strList.length(); System.out.print(" ") ,j++);
					System.out.println(strList +"|");
				}
				else {
					for(j=0; j<maxAmount-strList.length(); System.out.print(" ") ,j++);
					System.out.println(strList +"|");
					for(j=0; j<maxAmount-1; System.out.print(" ") ,j++);
					System.out.println(str.charAt(i) +"|");
				}
			}
		}
		for(i=0; i<maxAmount; System.out.print("-"), i++);
		System.out.println("+");
	}
	public String getCode() {
		return code;
	}
}