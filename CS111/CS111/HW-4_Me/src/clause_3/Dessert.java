//Pangon La-or-on
//6409700074

package clause_3;

public class Dessert {
	private String name, category, storeName;
	private float calories;
	
	public Dessert(String name, String category, String storeName, float calories) {
		this.name = name;
		this.category = category;
		this.storeName = storeName;
		this.calories = calories;
	}
	public void setName(String name) {				
		this.name = name;
	}
	public void setStoreName(String storeName) {	
		this.storeName = storeName;
	}
	public void setcategory(String category) {				
		this.category = category;
	}
	public void setCalories(float aCalories) {		
		this.calories = calories;
	}
	public String getName() {						
		return this.name;
	}
	public String getStoreName() {					
		return this.storeName;
	}
	public String getCategory() {						
		return this.category;
	}
	public double getCalories() {					
		return this.calories;
	}
	public String toString() {
		return "[Dessert]: " +name +", category:" +category +", store:" +storeName
				+", calories:" +String.format("%.1f", calories);
	}
}