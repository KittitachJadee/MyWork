import java.util.StringTokenizer;

//Pangon La-or-on
//6409700074

public class DessertList {
	private String dessertList="";
	Dessert first;
	Dessert second;
	Dessert third;
	
	public DessertList() {
		first=new Dessert();
		second=new Dessert();
		third=new Dessert();
	}
	public void add(Dessert dessert) {
		dessertList+=dessert.getName()+" "+dessert.getCalorie()+",";
			if(dessert.getCalorie()>first.getCalorie()) {
				third.setName(second.getName());
				third.setStoreName(second.getStoreName());
				third.setType(second.getType());
				third.setCalorie(second.getCalorie());
				second.setName(first.getName());
				second.setStoreName(first.getStoreName());
				second.setType(first.getType());
				second.setCalorie(first.getCalorie());
				first.setName(dessert.getName());
				first.setStoreName(dessert.getStoreName());
				first.setType(dessert.getType());
				first.setCalorie(dessert.getCalorie());
			}
			else if(dessert.getCalorie()>second.getCalorie()) {
				third.setName(second.getName());
				third.setStoreName(second.getStoreName());
				third.setType(second.getType());
				third.setCalorie(second.getCalorie());
				second.setName(dessert.getName());
				second.setStoreName(dessert.getStoreName());
				second.setType(dessert.getType());
				second.setCalorie(dessert.getCalorie());
			}
			else if(dessert.getCalorie()>third.getCalorie()) {
				third.setName(dessert.getName());
				third.setStoreName(dessert.getStoreName());
				third.setType(dessert.getType());
				third.setCalorie(dessert.getCalorie());
			}
	}
	public void printInfo() {
		System.out.println("List of desserts:");
		StringTokenizer st=new StringTokenizer(dessertList, ",");
		while(st.hasMoreTokens()) {
			System.out.println("\t"+st.nextToken());
		}
		System.out.println("\nTop 3 high calories:");
		first.printFood();
		second.printFood();
		third.printFood();
	}
}