//Pangon La-or-on
//6409700074

package two;

import java.util.ArrayList;

public class ArrayUtilTest {
	public static void main(String[] args) {
		String [] strArr1 = {"Seal", "Cat", "Dog"};
		String [] strArr2 = {"Pokemon", "Digimon", "Yugio"};
		System.out.println("Combined String");
		ArrayList<String> strs = ArrayUtil.concat(strArr1, strArr2);
		ArrayUtil.print(strs);
		String strMax = ArrayUtil.findMax(strArr1);
		System.out.println ("Max String: " + strMax);
		System.out.println ("----------------------------------------------");
		System.out.println ("Combined Dessert");
		Dessert[] dArray1 = {new Dessert("Vanilla Layer Cake ", "Cake", "S&P", 800),
							 new Dessert("Croissant ", "Bakery", "S&P", 300)};
		Dessert[] dArray2 = {new Dessert("Honey Toast","Bakery","After You", 850.50f),
							 new Dessert("Strawberry Panna Cotta ", "Sweet", "On the table", 400),
							 new Dessert("Red Bean Moji", "Japanese", "Sukishi", 850.20f)};
		ArrayList<Dessert> dList = ArrayUtil.concat(dArray1, dArray2);
		ArrayUtil.print(dList);
		Dessert dMax = ArrayUtil.findMax(dArray2);
		System.out.println ("Max String: " + dMax);
	}
}