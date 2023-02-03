//Pangon La-or-on
//6409700074

package clause_3;

public class FilterRecommendedDessert implements FilterInterface{
	@Override
	public boolean isSatified(Dessert d) {
		if(d instanceof RecommendedDessert) {
			RecommendedDessert recommendedDessert = (RecommendedDessert)d;
			return recommendedDessert.getStar() > 2? true: false;
		}
		else	return false;
	}
}