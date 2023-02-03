public class OtherTest {
	public static void main(String args[]) {
		oLoop:
			for(int o = 0; o < 3; o++) {
				System.out.println("+++++");
				iLoop:
					for(int i = 0; i < 2; i++) {
						System.out.println("**********");
						jLoop:
							for(int j = 0; j < 5; j++) {
								System.out.println(j+1);
								if(j == 3) {
									break oLoop;
								}
							}
					}
			}
		System.out.println("+++++");
	}
}