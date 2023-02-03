//Pangon La-or-on
//6409700074

public class Can {
	private float radian, height;
	
	public void setRadian(float aRadian) {
		radian=aRadian;
	}
	public void setHeight(float aHeight) {
		height=aHeight;
	}
	public double calculateSideArea() {
		return 2*Math.PI*radian*height;
	}
	public double calculateVolume() {
		return height*Math.PI*Math.pow(radian, 2);
	}
}
