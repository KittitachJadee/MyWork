//Kanyanat Det-in
//6409618011
public class DataSet {
	private double[] data;
	private int dataSize;
	public DataSet() {
		data=new double[100];
		dataSize=0;
	}
	public void add(double x) {
		if(dataSize<=data.length){
			double[] newData=new double[data.length*2];
			System.arraycopy(data, 0, newData, 0, data.length);
			data=newData;
		}
		data[dataSize]=x;
		dataSize++;
	}
	public double getAverage() {
		double sum = 0.0;
		if(dataSize==0){
			return 0;
		}
		for(double num: data){
			sum+=num;
		}
		return sum/data.length;
	}
}