//Kanyanat Det-in
//6409618011
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class DessertReader {
	private ArrayList<Dessert> foodList;
	
	public DessertReader(){
		foodList=new ArrayList<Dessert>();
		Scanner scaner=null;
		int amount=0;
		try {
			scaner=new Scanner(new File("dessert.txt"));
			while(scaner.hasNextLine()) {
				try {
					foodList.add(new Dessert(scaner.nextLine()));
				}catch(Exception e) {
					System.out.println(e.getMessage());
					amount++;
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error: Can't find data file");
		}finally {
			if(scaner!=null)
				scaner.close();
		}
		if(amount!=0)
			System.out.println("Total Error Dessert Info: "+amount);
	}
	public void print() {
		for(Dessert dessert: foodList) {
			dessert.print();
		}
	}
	
}
