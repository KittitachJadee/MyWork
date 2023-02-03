//Pangon La-or-on
//6409700074

package one;

public class Dessert {
	private String name, storeName, category;
	private float calories;
	
	public Dessert(String data) throws Exception{
		String split[] = data.split(",");
		if(split.length < 4) {
			throw new DessertException("Missing Information:" +data);
		}
		for(char information: split[split.length - 1].trim().toCharArray()) {
			if(!Character.isDigit(information) && information != '.') {
				throw new DessertException("Invalid Info:" +data);
			}
		}
		this.name = split[0].trim();
		this.category = split[1].trim();
		this.storeName = split[2].trim();
		this.calories = Float.parseFloat(split[split.length - 1].trim());
	}
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
				+", calories:" +String.format("%.1f", calories);
	}
}