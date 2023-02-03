//Kanyanat Det-in
//6409618011
package bull;
public class Checker {
	public static boolean isValid(int num){
		if (num <= 1000 || num >= 9999) {
			return false;
		}
		return isValid(""+num);
	}
	public static boolean isValid(String str) {
		if (str.length() != 4) return false;
		for (int i=0; i<4; i++) {
			char digit = str.charAt(i);
			if (digit <= '0' || digit > '9' ) return false;
			for (int j=i+1; j<4; j++) {
				if (digit == str.charAt(j)) return false;
			}
		}
		return true;
	}
}