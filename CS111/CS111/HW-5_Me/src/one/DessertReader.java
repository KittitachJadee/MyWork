//Pangon La-or-on
//6409700074

package one;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class DessertReader {
	private ArrayList<Dessert> foodList;
	
	public DessertReader(){
		foodList = new ArrayList<Dessert>();
		int amountOfException = 0;
		try (Scanner scan = new Scanner(new File("dessert.txt"))){
			while(scan.hasNextLine()) {
				try {
					foodList.add(new Dessert(scan.nextLine()));
				}catch(Exception e) {
					System.out.println(e.getMessage());
					amountOfException++;
				}
			}
			if(amountOfException != 0) {
				System.out.println("Total Error Dessert Info: " +amountOfException);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error: Can't find data file");
		}
	}
	public void print() {
		for(Dessert dessert: foodList) {
			dessert.print();
		}
	}
	
	public static void main(String[] args) {
		DessertReader dj = new DessertReader();
		System.out.println ("------------------------------------");
		dj.print();
	}
}
