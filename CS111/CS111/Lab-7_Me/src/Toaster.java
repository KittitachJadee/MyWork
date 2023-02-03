import java.util.Random;

//Pangon La-or-on
//6409700074

public class Toaster {
	Slot slot1;
	Slot slot2;
	
	public Toaster() {
		slot1=new Slot();
		slot2=new Slot();
	}
	
	public void toast(Bread bread) {
		Random ran=new Random();
		int selectSlot;
		for(int i=1; i<=4; i++) {
			System.out.println("Round " +i);
			for(int j=0; j<10; j++) {
				selectSlot=1+ran.nextInt(2);
				if(selectSlot==1) {
					slot1.toast(bread);
					System.out.println("Slot 1 ,Status : " +bread.getState());
				}
				else {
					slot2.toast(bread);
					System.out.println("Slot 2 ,Status : " +bread.getState());
				}
			}
			System.out.println("Slot 1 age : " +slot1.getAge());
			System.out.println("Slot 2 age : " +slot2.getAge());
			if(slot1.getAge()<=0)
				slot1=new Slot();
			if(slot2.getAge()<=0)
				slot2=new Slot();
		}
	}
}
