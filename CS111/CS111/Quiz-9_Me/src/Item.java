
public class Item implements Reportable{
	private String name;
	private double weigth;
	
	public Item(String name, double weigth) {
		this.name=name;
		this.weigth=weigth;
	}
	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("Item name = " +name +" with weigth = " +weigth);
	}

}
