//Pangon La-or-on
//6409700074
public class MonsterCage {
	private Monster[][] cage;
	public MonsterCage(String filename) throws Exception{
	cage = CharacterFileReader.readMonsters(filename);
	}
	public void print(){
	System.out.println("---------Cage---------");
	
	for(Monster[] row : cage){
	for(Monster monster : row){
	if(monster.isSleep())
	System.out.print(". ");
	else
	System.out.print("o ");
	}
	System.out.println();
	}
	}
	
	public void flipVerrical() {
		int i;
		Monster[][] flip = new Monster[cage.length][cage.length];
		for(i = 0; i < cage.length; i++) {
			int rowSize = cage[i].length;
			for(int j = 0; j < rowSize; j++) {
				flip[i][j] = cage[rowSize - i - 1][j];
			}
		}
		for(i = 0; i < flip.length; i++) {
			System.arraycopy(flip[i], 0, cage[i], 0, flip[i].length);
		}
	}
	
	public static void main(String[] args){
		try{
		MonsterCage cage = new MonsterCage("monsters.txt");
		cage.print();
		} catch(Exception ex){
		System.out.println(ex);
		ex.printStackTrace();
		}
		System.out.println("End of program");
		}


}
