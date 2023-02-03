//
//

public class DataSet {
	private double[] data;
	private int dataSize;
	public DataSet() {
		data = new double[100];
		dataSize = 0;
	}
	public void add() {
		double[] newData = new double[data.length*2];
		System.arraycopy(data, 0, newData, 0, data.length);
		data = newData;
		data[0] = 555;
		dataSize++;
	}
	public double getAverage() {
		double sum = 0.0;
		for(int i=0; i<data.length; sum+=data[i], i++);
		return sum/data.length;
	}
}
