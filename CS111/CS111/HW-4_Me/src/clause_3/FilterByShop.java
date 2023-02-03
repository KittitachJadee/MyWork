//Pangon La-or-on
//6409700074

package clause_3;

public class FilterByShop implements FilterInterface{
	private String shop;
	
	public FilterByShop(String shop) {
		this.shop = shop;
	}
	@Override
	public boolean isSatified(Dessert d) {
		if(d.getStoreName().equals(this.shop))	return true;
		else	return false;
	}
}