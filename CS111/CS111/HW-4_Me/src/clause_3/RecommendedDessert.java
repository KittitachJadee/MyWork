//Pangon La-or-on
//6409700074

package clause_3;

public class RecommendedDessert extends Dessert{
	private int star;
	
	public RecommendedDessert(String name, String category, String storeName, 
							  float calories, int star) {
		super(name, category, storeName, calories);
		this.star = star;
	}
	public int getStar() {
		return this.star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String toString() {
		return "[RecommendedDessert]: " +getName() +", category:" +getCategory() 
				+", store:" +getStoreName() +", calories:"
				+String.format("%.1f", getCalories()) +" star:" +getStar();
	}
}
