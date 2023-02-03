//Kanyanat Det-in
//6409618011
import java.util.StringTokenizer;
public class DessertList {
	private String dessertList="";
	Dessert first=new Dessert();
	Dessert second=new Dessert();
	Dessert third=new Dessert();
	public DessertList() {
		first=new Dessert();
		second=new Dessert();
		third=new Dessert();
	}
	public void printInfo() {
		System.out.println("List of desserts:");
		System.out.println(dessertList+"\nTop 3 high calories:");
		first.print();
		second.print();
		third.print();
	}
	public void add(Dessert dessert) {
		dessertList+="\t"+dessert.getName()+" ";
		dessertList+=dessert.getCalorie()+"\n";
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
}