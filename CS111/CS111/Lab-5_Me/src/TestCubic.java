//Pangon La-or-on
//6409700074

public class TestCubic {
	public static void main(String[] args) {
		Cubic cubic = new Cubic();
		cubic.setHeight(5.0, Cubic.INCH);
		double volume = cubic.cubicVolumeOz();
		// �����Ҥ����آͧ���ͧ����դ�����Ǵ�ҹ 5 ����
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.INCH)
		+ " inches: " + volume + " fl.oz");
		volume = cubic.cubicVolume();
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.MM)
		+ " milimeters: " + volume + " mm3");
		cubic.setHeight(100.0);
		// �����Ҥ����آͧ���ͧ����դ�����Ǵ�ҹ 100 mm.
		System.out.println("Volume of cubic " + cubic.getHeight(Cubic.INCH)
		+ " inches (" + cubic.getHeight() + " mm): " +
		+ cubic.cubicVolumeOz() + " fl.oz ("
		+ cubic.cubicVolume() + " mm3)");
	}
}
