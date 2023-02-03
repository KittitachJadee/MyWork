//Pangon La-or-on
//6409700074

public class Toaster {
	private Slot slot1, slot2;
	
	public Toaster() {
		slot1 = new Slot();
		slot2 = new Slot();
	}
	public void toast(Bread bread[][]) {
		for(int i = 0; i < bread.length; i++) {
			System.out.println("Round " +(i+1));
			for(int j = 0; j < bread[0].length; j++) {
				if(Math.random() > 0.5) {
					slot1.toast(bread[i][j]);
					System.out.println("Slot 1, Status : " +bread[i][j].getState());
				}
				else {
					slot2.toast(bread[i][j]);
					System.out.println("Slot 2, Status : " +bread[i][j].getState());
				}
			}
			System.out.println("Slot 1 age : " +slot1.getAge() +"\nSlot 2 age : " +slot2.getAge());
			
			if(slot1.getAge() <= 0) {
				slot1 = new Slot();
			}
			if(slot2.getAge() <= 0) {
				slot2 = new Slot();
			}
		}
	}
}
