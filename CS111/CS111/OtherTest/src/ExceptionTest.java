
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "lol.l";
		for(char s: num.toCharArray()) {
			if(!Character.isDigit(s) && s != '.') {
				System.out.print(s);
			}
		}
	}

}
