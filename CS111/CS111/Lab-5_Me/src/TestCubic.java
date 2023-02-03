//Pangon La-or-on
//6409700074

public class TestCubic {
	public static void main(String[] args) {
		Cubic cubic = new Cubic();
		cubic.setHeight(5.0, Cubic.INCH);
		double volume = cubic.cubicVolumeOz();
		// เพื่อหาความจุของกล่องที่มีความยาวด้าน 5 นิ้ว
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.INCH)
		+ " inches: " + volume + " fl.oz");
		volume = cubic.cubicVolume();
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.MM)
		+ " milimeters: " + volume + " mm3");
		cubic.setHeight(100.0);
		// เพื่อหาความจุของกล่องที่มีความยาวด้าน 100 mm.
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.INCH)
		+ " inches (" + cubic.getHeight() + " mm): " +
		+ cubic.cubicVolumeOz() + " fl.oz ("
		+ cubic.cubicVolume() + " mm3)");
	}
}
