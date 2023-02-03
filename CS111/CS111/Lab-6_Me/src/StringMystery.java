//Pangon La-or-on
//6409700074

public class StringMystery {
	public String swapHalf(String str) {
		StringBuffer buf = new StringBuffer(str.toLowerCase());
		int mid = buf.length()/2 - 1;
		int last = buf.length();
		for (int i=1; i<=mid; i++) {
			char ch1 = buf.charAt(i-1);
			char ch2 = buf.charAt(last-i);
			buf.setCharAt(i-1, ch2);
			buf.setCharAt(last-i, ch1);
		}
		return buf.toString();
	}
	public boolean isPalindromeWord(String str) {
		str = str.toLowerCase();
		return str.equals(swapHalf(str));
	}
	
	public static void main(String[] args) {
		StringMystery m = new StringMystery();
		System.out.println(m.isPalindromeWord("Madam"));    // should be true
		System.out.println(m.isPalindromeWord("raceCar"));  // should be true
		System.out.println(m.isPalindromeWord("House"));  // should be false
	}
}
