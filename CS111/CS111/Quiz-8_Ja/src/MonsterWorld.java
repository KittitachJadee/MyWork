//Kanyanat Det-in
//6409618011
import java.util.ArrayList;

public class MonsterWorld {
	private ArrayList<Monster> world;
	
	public MonsterWorld() {
		world = new ArrayList<>();
	}

	public void add(Monster mons) {
		world.add(mons);
	}

	public int count() {
		return world.size();
	}

	public double getCoverage(){
		double sum = 0;
		for (Monster m: world){
				sum += m.getArea();
		}
		return sum;
	}

	public double getAverage(){
	if(world.size() == 0) return 0;
	return getCoverage()/world.size();
	}
	
	public Monster remove(int index) {
		return world.remove(index);
	}
	
	public void print() {
		System.out.println("Monster World: ");
		for(Monster m: world) {
			System.out.print("\t" +m.getStatus() +"\n");
		}
	}
}