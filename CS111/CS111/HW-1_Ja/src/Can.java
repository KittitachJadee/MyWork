//Kanyanat Det-in
//6409618011
public class Can {
	private float r, h;
	public void setRadian(float radian) {
		r=radian;
	}
	public void setHeight(float height) {
		h=height;
	}
	public double calculateSideArea() {
		return 2*Math.PI*r*h;
	}
	public double calculateVolume() {
		return h*Math.PI*Math.pow(r, 2);
	}
}
