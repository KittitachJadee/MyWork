//Pangon La-or-on
//6409700074

package two;

public class Dessert implements Comparable<Dessert>{
	private String name, storeName, category;
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
	public void setCategory(String category) {				 
		this.category = category;
	}
	public void setCalorie(float calories) {		 
		this.calories = calories;
	}
	public String getName() {						 
		return name;
	}
	public String getStoreName() {					 
		return storeName;
	}
	public String getCategory() {						 
		return category;
	}
	public float getCalories() {					
		return calories;
	}
	public void print() {						
		System.out.printf("Dessert [name:%s, category:%s, storeName:%s, calories:%.1f]\n",
				name, category, storeName, calories);
	}
	public String toString() {
		return "Dessert [name:" +name +", category:" +category +", storeName:" +storeName
				+", calories:" +String.format("%.1f", calories) +"]";
	}
	@Override
	public int compareTo(Dessert obj) {
		if(this.calories < obj.getCalories()) {
			return -1;
		}else if(this.calories == obj.getCalories()) {
			return 0;
		}else {
			return 1;
		}
	}
}