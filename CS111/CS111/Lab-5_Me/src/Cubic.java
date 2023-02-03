//Pangon La-or-on
//6409700074

public class Cubic {
	private double mm;
	final static int MM=0, INCH=1;
	
	public double cubicVolume() {
		return Math.pow(mm, 3);
	}
	public double cubicVolumeOz() {
		return Math.pow(mm, 3)/29573.53;
	}
	public void setHeight(double mm) {
		this.mm=mm;
	}
	public void setHeight(double length, int type)
	{
		if(type==MM) {
			mm=length;
		}
		else {
			mm=length*25.4;
		}
	}
	public double getHeight() {
		return mm;
	}
	public double getHeight(int type) {
		if(type==MM) {
			return mm;
		}
		else {
			return mm/25.4;
		}
	}
}
