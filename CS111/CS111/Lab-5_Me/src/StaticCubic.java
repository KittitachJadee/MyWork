//Pangon La-or-on
//6409700074

public class StaticCubic {
	public static final double MM_PER_INCH = 25.4;
	public static final double MM_CUBED_PER_OZ = 29573.53;
	
	public static double inchToMm(double inches) {
		return inches*MM_PER_INCH;
	}
	public static double mmCubedToOz(double mm3) {
		return mm3/MM_CUBED_PER_OZ;
	}
	/*
	 * before Overloaded method
	public static double cubicVolume(double height) {
		return Math.pow(height, 3);
	}
	public static double cubicVolumeOz(double height) {
		double mm=inchToMm(height);
		double volume=cubicVolume(mm);
		return mmCubedToOz(volume);
	}
	 */
	public static double cubicVolume(double width, double length, double height) {
		return width*length*height;
	}
	public static double cubicVolumeOz(double height) {
		double mm=inchToMm(height);
		double volume=cubicVolume(mm, mm, mm);
		return mmCubedToOz(volume);
	}
}
