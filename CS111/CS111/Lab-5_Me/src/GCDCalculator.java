//Pangon La-or-on
//6409700074

public class GCDCalculator {
	public static int gcd (int p, int q) {
		if(p==0) {
			return p;
		}
		else {
			if(p>=q) {
				if(q>0) {
					return gcd(q, p%q);
			}
				else {
					return p;
				}
			}
			else {
				if(p>0) {
					return gcd(p, q%p);
				}
				else {
					return q;
				}
			}
		}
	}
}
