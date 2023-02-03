//Kanyanat Det-in
//6409618011
public class Dessert {
	private String name, storeName, category;
	private float calories;
	
	public Dessert(String data) throws DessertException{
		String split[]=data.split(",");
		if(split.length<4)
			throw new DessertException("Missing Information:"+data);
		try {
			float calories=Float.parseFloat(split[split.length-1]);
			name=split[0];
			category=split[1];
			storeName=split[2];
			this.calories=Float.parseFloat(split[split.length-1]);
		}catch(Exception e) {
			throw new DessertException("“Invalid Info:"+data);
		}
	}
	public Dessert(String name, String category, String storeName, float calories) {
		this.name=name;
		this.category=category;
		this.storeName=storeName;
		this.calories=calories;
	}
	public void setName(String name) {				 
		this.name=name;
	}
	public void setStoreName(String storeName) {	 
		this.storeName=storeName;
	}
	public void setCategory(String category) {				 
		this.category=category;
	}
	public void setCalorie(float calories) {		 
		this.calories=calories;
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
		System.out.print(toString());
	}
	public String toString() {
		return "Dessert [name:"+name+", category:"+category+", storeName:"+storeName+", calories:"+String.format("%.1f", calories);
	}
	
}
